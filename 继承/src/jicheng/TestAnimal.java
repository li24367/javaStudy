package jicheng;

public class TestAnimal {

	public static void main(String[] args) {
		Wolf s2 = new Wolf();
		Goat s1 =new Goat();
		s1.id=1;
		s1.name ="É½Ñò";
		s2.id=2;
		s2.name="ÀÇ";
		s1.eat1();
		s1.walk();
		
		Wolf b = new Wolf();
		s2.eat();
		s2.walk();

	}

}
