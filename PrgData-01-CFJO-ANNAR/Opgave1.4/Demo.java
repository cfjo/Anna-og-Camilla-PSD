import java.util.HashMap;

class Demo{

    public static void main (String[] args){
        test();
    }

    static void test(){
        Aexpr e = new Add(new CstI(17), new Var("z"));
        System.out.println(e.toString());
        
        //Extra expressions:
        Aexpr ae1 = new Add(new CstI(21), new CstI(4));
        Aexpr ae2 = new Mul(new CstI(3), new Sub(new CstI(2), new CstI (1)));
        Aexpr ae3 = new Sub(new Var ("a"), new CstI(5));
        
        System.out.println(ae1);
        System.out.println(ae2);
        System.out.println(ae3);
        
        //opgave 1.4.iii
        HashMap<String, Integer> env = new HashMap<String, Integer>();
        env.put("a", 1);
        env.put("b", 21);
        env.put("c", 67);
        
        System.out.println(ae1.eval(env));
        System.out.println(ae2.eval(env));
        System.out.println(ae3.eval(env));
        
        //opgave 1.4.iv
        Aexpr zero = new CstI(0);
        Aexpr ae4 = new Add(zero, new CstI(5));
        Aexpr ae5 = new Sub(new CstI(5), zero);
        Aexpr ae6 = new Mul(zero, new CstI(5));
        System.out.println(ae4.simplify());
        System.out.println(ae5.simplify());
        System.out.println(ae6.simplify());
    }

}