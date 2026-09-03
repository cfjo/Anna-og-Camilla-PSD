import java.util.HashMap;

class Mul extends Binop{
    @Override
    public String toString(){
        return "(" + ae1 + "*" + ae2 + ")";
    }

    Mul(Aexpr ae1, Aexpr ae2){
        super(ae1, ae2);
    }

    public int eval(HashMap<String, Integer> env){
        int eval1 = ae1.eval(env);
        int eval2 = ae2.eval(env);
        return eval1 * eval2;
    }

    public Aexpr simplify(){
        Aexpr simple1 = ae1.simplify();
        Aexpr simple2 = ae2.simplify();
        if (simple1.i == 1) {
            return ae2.simplify();
        } else if (simple2.i == 1){
            return simple1;
        } else if (simple1.i == 0){
            return new CstI(0);
        } else if (simple2.i == 0){
            return new CstI(0);
        } else return this;
    }
}