package StringBuffer2;

public class StringBuffer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringBuffer a=new StringBuffer("�һ�java");
      a.insert(2,"ä���" );
      System.out.println(a);
      
      
      StringBuffer b=new StringBuffer("�Ұ���");
      b.reverse();
      System.out.println(b);
      
      StringBuffer c=new StringBuffer("��һ����ѧ��java��ä��");
      c.toString();
      System.out.println(c);
      
      String f="good";
      String g=f.concat("idea").toUpperCase().replace('G', 'g');
      System.out.println(g);
      
      StringBuffer h=new StringBuffer("��һ����");
      h.append("java��ä��");
      System.out.println(h);
	}

}
