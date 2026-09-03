import java.util.HashMap;

abstract class Binop extends Aexpr{
    Aexpr ae1;
    Aexpr ae2;
    public abstract int eval(HashMap<String, Integer> env);
    Binop(Aexpr ae1, Aexpr ae2){
        this.ae1 = ae1;
        this.ae2 = ae2;
    }
}