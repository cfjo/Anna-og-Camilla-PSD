import java.util.HashMap;

class Var extends Aexpr{
    String s;

    public Var(String s){
        this.s = s;
    }
    public String toString(){
        return s;
    }
    public int eval(HashMap<String, Integer> env){
        return env.get(s);
    }
    public Aexpr simplify(){
        return this;
    }
}