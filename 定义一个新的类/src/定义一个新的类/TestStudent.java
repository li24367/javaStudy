package ����һ���µ���;

public abstract class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sNo = 200401125;
		s1.sName = "����";
		s1.sSex = "Ů";
		s1.sAge = 18;
		s1.sJava = 90;
		System.out.println("ѧ�ţ�"+s1.sNo+"   ������"+s1.sName+"   �Ա�"+s1.sSex+"   ���䣺"+s1.sAge+"   java�ɼ�"+s1.sJava);
		Student s2 = new Student();
		s2.sNo = 200401126;
		s2.sName = "������";
		s2.sSex = "��";
		s2.sAge = 19;
		s2.sJava = 83;
		System.out.println("ѧ�ţ�"+s2.sNo+"   ������"+s2.sName+"   �Ա�"+s2.sSex+"   ���䣺"+s2.sAge+"   java�ɼ�"+s2.sJava);
		Student s3 = new Student();
		s3.sNo = 200401127;
		s3.sName = "����";
		s3.sSex = "��";
		s3.sAge = 18;
		s3.sJava = 85;
		System.out.println("ѧ�ţ�"+s3.sNo+"   ������"+s3.sName+"   �Ա�"+s3.sSex+"   ���䣺"+s3.sAge+"   java�ɼ�"+s3.sJava);
		Student s4 = new Student();
		s4.sNo = 200401128;
		s4.sName = "��Բ";
		s4.sSex = "Ů";
		s4.sAge = 18;
		s4.sJava = 89;
		System.out.println("ѧ�ţ�"+s4.sNo+"   ������"+s4.sName+"   �Ա�"+s4.sSex+"   ���䣺"+s4.sAge+"   java�ɼ�"+s4.sJava);
		Student s5 = new Student();
		s5.sNo = 200401129;
		s5.sName = "����";
		s5.sSex = "��";
		s5.sAge = 19;
		s5.sJava = 88;
		System.out.println("ѧ�ţ�"+s5.sNo+"   ������"+s5.sName+"   �Ա�"+s5.sSex+"   ���䣺"+s5.sAge+"   java�ɼ�"+s5.sJava);
		int A = (s1.sJava+s2.sJava+s3.sJava+s4.sJava+s5.sJava)/5;
		System.out.println("ƽ����Ϊ"+A);
		int arr[] = {s1.sJava,s2.sJava,s3.sJava,s4.sJava,s5.sJava};
		
		int max=arr[0];//������ĵ�һ��Ԫ�ظ���max
		int min=arr[0];//������ĵ�һ��Ԫ�ظ���min
		for(int i=1;i<arr.length;i++){//������ĵڶ���Ԫ�ؿ�ʼ��ֵ�����αȽ�
			if(arr[i]>max){//���arr[i]�������ֵ���ͽ�arr[i]�������ֵ
				max=arr[i];
			}
			if(arr[i]<min){//���arr[i]С����Сֵ���ͽ�arr[i]������Сֵ
				min=arr[i];
			}
		}
		System.out.println("���ֵ��:"+max);
		System.out.println("��Сֵ��:"+min);

	 
	}
}
