public class Test {
    public static void main(String[] args){
        int a = 2, b = 7, c=5;
        System.out.println(a++);  //2
        System.out.println(a);    //3
        System.out.println(++b);  //8
        /*
         * 当变量参与运算时，++x，先自加再运算
         * 当变量参与运算时，x++，先运算在自加
         */
        c = c++;   
        /*
         * 运算顺序:
         * 1.c取出自己内存的值5
         * 2.进行自加c变成6
         * 3.c++参与运算时的整体值是5
         * 4.然后将（c++）整体值赋值给c
         * 5.c的值又变成5
         */
        System.out.println(c);  //5
    }
}
