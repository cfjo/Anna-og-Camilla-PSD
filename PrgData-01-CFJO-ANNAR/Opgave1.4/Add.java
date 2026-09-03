import java.util.HashMap;
class Add extends Binop{
    Add(Aexpr ae1, Aexpr ae2){
        super(ae1, ae2);
    }
    @Override
    public String toString(){
        return "(" + ae1 + " + " + ae2 + ")";
    }
     public int eval(HashMap<String, Integer> env){
        int eval1 = ae1.eval(env);
        int eval2 = ae2.eval(env);
        return eval1 + eval2;
    }
    public Aexpr simplify(){
        Aexpr simple1 = ae1.simplify();
        Aexpr simple2 = ae2.simplify();
        if (simple1.i == 0) {
            return ae2.simplify();
        } else if (simple2.i == 0){
            return ae1.simplify();
        }
        else return this;
    }
}