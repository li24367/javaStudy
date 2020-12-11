package StringBuffer2;

public class StringBuffer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringBuffer a=new StringBuffer("我会java");
      a.insert(2,"盲打和" );
      System.out.println(a);
      
      
      StringBuffer b=new StringBuffer("我爱你");
      b.reverse();
      System.out.println(b);
      
      StringBuffer c=new StringBuffer("我一定会学会java和盲打！");
      c.toString();
      System.out.println(c);
      
      String f="good";
      String g=f.concat("idea").toUpperCase().replace('G', 'g');
      System.out.println(g);
      
      StringBuffer h=new StringBuffer("我一定能");
      h.append("java和盲打");
      System.out.println(h);
	}

}
