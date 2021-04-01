package 定义一个新的类2;

public class TestRectangle {
	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(4.0f,7.0f);
		
		Rectangle b = new Rectangle();
		//a.setLength(4.0f);
		//a.setWidth(7.0f);
		a.Perimeter = (a.getLength()+a.getWidth())*2;
		a.Area = a.getLength() * a.getWidth();		
		a.show();
		System.out.println("; 周长="+a.Perimeter+"; 面积="+a.Area);
		
		b.setLength(2.0f);
		b.setWidth(8.0f);
		b.Perimeter = (b.getLength()+b.getWidth())*2;
		b.Area = b.getLength() * b.getWidth();
		b.show();
		System.out.println("; 周长="+b.Perimeter+"; 面积="+b.Area);


	}

}



