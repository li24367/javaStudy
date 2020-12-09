public class Test{
    public static void main(String args[]){
        //1.变量的声明
        int a; //声明一个整型的变量a
        int b,c,d; //声明三个整型变量b,c,d
            
        //2.变量的初始化
        int a = 250; //声明整型变量a并赋值为250
            
        //声明整型变量b，然后赋值为250
        int b;
        b = 250;
            
        //3.变量的使用
        int a = 5;
        int b = b+10; //取出a的值5，加10后赋值给b
        System.out.println(b); //输出b的值15
        System.out.println("b");  //输出字符串b
        a=a+10;  //取出a的值5，加上10后再赋值给a
        System.out.println(a);  //15
    }
}