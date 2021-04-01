package 定义一个新的类2;

public class Rectangle {
	private float length=1;
	private float width=1;
	float Perimeter;
	float Area;
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public Rectangle(float chang,float kuan) {
		length = chang;
		width = kuan;
		
	}
	public Rectangle () {
		
    }
	public void show(){
		System.out.print("矩形长="+length+"; 宽="+width);
	}

}



