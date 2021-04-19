package study;


public class Dog1 {
	int age = 2;
	String name = "rose";

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog1 other = (Dog1) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
	    dog.name = "jack";
	    Dog dog1 = new Dog();
	    System.out.println(dog);
	    System.out.println(dog1);
	    if(dog.equals(dog1)) {
	    	System.out.println("两个对象是相同的");
	    }
	    else {
	    	System.out.println("两个对象是不相同的");
	    }
		
	}

}
