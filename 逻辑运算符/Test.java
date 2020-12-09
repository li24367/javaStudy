public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        boolean c = a>1 && ++a>1;
        boolean d = a++>1 || b--<2;
        boolean e = a<1 || ++b==3;
        System.out.println(a);    
        System.out.println(b);   
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}