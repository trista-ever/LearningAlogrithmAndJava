package Graph;

/**
 * 2017/4/14 16:23
 *
 * @author weiyu si
 */
public class test {
    private int a;
    public test(int b){
        a=b;
    }
    private void out(){
        System.out.println(a);
    }
    public static void main(String[] args){
        test f= new test(1);
        f.a = 2;
        System.out.println(f.a);
        f.out();
        A a =new A();
        a.output(f);
    }
}
class A{
    public void output(test t){
       // System.out.println(t.a);
    }
}
