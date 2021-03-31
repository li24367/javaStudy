package 方法的重载;
import java.util.*;

public class chongzai {
	public int chongza(int a,int b) {
		return a+b;
	}
	public String chongza(String a,String b) {
		return a+b;
	}
	public double chongza(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		chongzai s1 = new chongzai();
		Scanner i1 = new Scanner(System.in);
		Scanner i2 = new Scanner(System.in);
		Scanner i3 = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int a1 = i1.nextInt();
		System.out.println("请输入第二个整数");
		int b1 = i1.nextInt();
		System.out.println("计算结果为："+s1.chongza(a1, b1));
		
        System.out.println("请输入第一个字符串：");
        String a2 = i2.nextLine();
        System.out.println("请输入第二个字符串：");
        String b2 = i2.nextLine();
        System.out.println("连接为："+s1.chongza(a2, b2));
        
        System.out.println("请输入第一个浮点数：");
        double a3 = i3.nextDouble();
        System.out.println("请输入第二个浮点数：");
        double b3 = i3.nextDouble();
        System.out.println("计算结果为："+s1.chongza(a3, b3));
        }

}
