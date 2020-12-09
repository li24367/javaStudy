public class Test {
    public static void main(String[] args) {
        int a =1, b = 2;
        String o = "qwer";
        String P = a+b+o+a+b; 
        /*
         *任何类型与字符串类型拼接，得到的依然是字符串类型
         *计算顺序:
         *1.先计算a+b，两个int相加得到int，结果为3
         *2.再+o为字符串，得到字符串3qwer
         *3再+a+b，得到的依然是字符串，结果为3qwer12
         */
        System.out.println(P);  //3qwer12
    }
}