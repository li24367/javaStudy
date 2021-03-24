package 定义一个新的类;

public abstract class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sNo = 200401125;
		s1.sName = "洛洛";
		s1.sSex = "女";
		s1.sAge = 18;
		s1.sJava = 90;
		System.out.println("学号："+s1.sNo+"   姓名："+s1.sName+"   性别："+s1.sSex+"   年龄："+s1.sAge+"   java成绩"+s1.sJava);
		Student s2 = new Student();
		s2.sNo = 200401126;
		s2.sName = "不求人";
		s2.sSex = "男";
		s2.sAge = 19;
		s2.sJava = 83;
		System.out.println("学号："+s2.sNo+"   姓名："+s2.sName+"   性别："+s2.sSex+"   年龄："+s2.sAge+"   java成绩"+s2.sJava);
		Student s3 = new Student();
		s3.sNo = 200401127;
		s3.sName = "难言";
		s3.sSex = "男";
		s3.sAge = 18;
		s3.sJava = 85;
		System.out.println("学号："+s3.sNo+"   姓名："+s3.sName+"   性别："+s3.sSex+"   年龄："+s3.sAge+"   java成绩"+s3.sJava);
		Student s4 = new Student();
		s4.sNo = 200401128;
		s4.sName = "汤圆";
		s4.sSex = "女";
		s4.sAge = 18;
		s4.sJava = 89;
		System.out.println("学号："+s4.sNo+"   姓名："+s4.sName+"   性别："+s4.sSex+"   年龄："+s4.sAge+"   java成绩"+s4.sJava);
		Student s5 = new Student();
		s5.sNo = 200401129;
		s5.sName = "晚玉";
		s5.sSex = "男";
		s5.sAge = 19;
		s5.sJava = 88;
		System.out.println("学号："+s5.sNo+"   姓名："+s5.sName+"   性别："+s5.sSex+"   年龄："+s5.sAge+"   java成绩"+s5.sJava);
		int A = (s1.sJava+s2.sJava+s3.sJava+s4.sJava+s5.sJava)/5;
		System.out.println("平均分为"+A);
		int arr[] = {s1.sJava,s2.sJava,s3.sJava,s4.sJava,s5.sJava};
		
		int max=arr[0];//将数组的第一个元素赋给max
		int min=arr[0];//将数组的第一个元素赋给min
		for(int i=1;i<arr.length;i++){//从数组的第二个元素开始赋值，依次比较
			if(arr[i]>max){//如果arr[i]大于最大值，就将arr[i]赋给最大值
				max=arr[i];
			}
			if(arr[i]<min){//如果arr[i]小于最小值，就将arr[i]赋给最小值
				min=arr[i];
			}
		}
		System.out.println("最大值是:"+max);
		System.out.println("最小值是:"+min);

	 
	}
}
