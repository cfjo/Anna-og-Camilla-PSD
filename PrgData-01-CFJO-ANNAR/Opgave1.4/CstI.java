import java.util.HashMap;

/**
 * Write a description of class kjn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CstI extends Aexpr
{
    public int i;

    public CstI(int i)
    {
        this.i = i;
    }
    public String toString(){
        return "" + i;
    }
    @Override
    public int eval(HashMap<String, Integer> env){
        return i;
    }
    public Aexpr simplify(){
        return this;
    }

}
