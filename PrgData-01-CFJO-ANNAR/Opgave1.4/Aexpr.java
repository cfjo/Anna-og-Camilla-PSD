import java.util.HashMap;

abstract class Aexpr{
    int i;
    public abstract int eval (HashMap<String, Integer> env);
    public abstract String toString();
    public abstract Aexpr simplify();
}