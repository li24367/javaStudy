package student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1 = new Student(1,"����");
    Student s2 = new Student(1,"����");
    if (s1.equals(s2))
		System.out.println("����s1��s2��ѧ������ͬ��");
	else
		System.out.println("����s1��s2��ѧ���ǲ���ͬ��");
	}

}
