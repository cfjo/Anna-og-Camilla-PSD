(* Programming language concepts for software developers, 2010-08-28 *)

(* Evaluating simple expressions with variables *)

module Intro2

(* Association lists map object language variables to their values *)

let env = [("a", 3); ("c", 78); ("baf", 666); ("b", 111)];;

let emptyenv = []; (* the empty environment *)

let rec lookup env x =
    match env with 
    | []        -> failwith (x + " not found")
    | (y, v)::r -> if x=y then v else lookup r x;;

let cvalue = lookup env "c";;


(* Object language expressions with variables *)

type expr = 
  | CstI of int
  | Var of string
  | Prim of string * expr * expr
  //vi tilføjede den her:
  | If of expr * expr * expr;;

let e1 = CstI 17;;

let e2 = Prim("+", CstI 3, Var "a");;

let e3 = Prim("+", Prim("*", Var "b", CstI 9), Var "a");;

//Vi lavede disse:
let e4 = Prim("min", CstI 5, Prim ("*", CstI 3, CstI 2));;

let e5 = Prim("max", Prim("*", CstI 7, Var "baf"), CstI 1000);;

let e6 = Prim("==", Var "b", CstI 111);;

let e7 = Prim("==", Var "b", CstI 110);;

let e8 = If(Var "a", CstI 11, CstI 22);;


(* Evaluation within an environment *)

(*
let rec eval e (env : (string * int) list) : int =
    match e with
    | CstI i            -> i
    | Var x             -> lookup env x 
    | Prim("+", e1, e2) -> eval e1 env + eval e2 env
    | Prim("*", e1, e2) -> eval e1 env * eval e2 env
    | Prim("-", e1, e2) -> eval e1 env - eval e2 env
    
    //We made this vvvvv
    | Prim("==", e1, e2) ->
        let left = eval e1 env
        let right = eval e2 env
        if left = right then 1 else 0
    | Prim("min", e1, e2) ->
        let left = eval e1 env
        let right = eval e2 env
        if left < right then left
        else right
    | Prim ("max", e1, e2) -> 
        let left = eval e1 env
        let right = eval e2 env
        if left > right 
        then left
        else right

    //Vi flyttede den her vvv
    | Prim _            -> failwith "unknown primitive";;
*)

let rec eval e (env : (string * int) list) : int =
    match e with
    | CstI i            -> i
    | Var x             -> lookup env x 
    | Prim (ope, e1, e2) ->
        let i1 = eval e1 env
        let i2 = eval e2 env
        match ope with
        | "+" -> i1 + i2
        | "-" -> i1 - i2
        | "*" -> i2 * i1
        | "min" -> if i1 < i2 then i1 else i2
        | "max" -> if i1 > i2 then i1 else i2
        | "==" -> if i1 = i2 then 1 else 0
    //opgave iv + v
    | If (e1, e2, e3) -> 
        let i1 = eval e1 env
        if i1 <> 0 then eval e2 env else eval e3 env


let e1v  = eval e1 env;;
let e2v1 = eval e2 env;;
let e2v2 = eval e2 [("a", 314)];;
let e3v  = eval e3 env;;
