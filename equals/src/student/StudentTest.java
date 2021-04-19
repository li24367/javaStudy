package student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1 = new Student(1,"张三");
    Student s2 = new Student(1,"李四");
    if (s1.equals(s2))
		System.out.println("对象s1和s2的学号是相同的");
	else
		System.out.println("对象s1和s2的学号是不相同的");
	}

}
