package ����������;
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
		System.out.println("�������һ������");
		int a1 = i1.nextInt();
		System.out.println("������ڶ�������");
		int b1 = i1.nextInt();
		System.out.println("������Ϊ��"+s1.chongza(a1, b1));
		
        System.out.println("�������һ���ַ�����");
        String a2 = i2.nextLine();
        System.out.println("������ڶ����ַ�����");
        String b2 = i2.nextLine();
        System.out.println("����Ϊ��"+s1.chongza(a2, b2));
        
        System.out.println("�������һ����������");
        double a3 = i3.nextDouble();
        System.out.println("������ڶ�����������");
        double b3 = i3.nextDouble();
        System.out.println("������Ϊ��"+s1.chongza(a3, b3));
        }

}
