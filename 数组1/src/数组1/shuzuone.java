package สýื้1;

public class shuzuone {

	public static void main(String[] args) {
		int[] a1= {2,3,4,7,8,9,};
		int[] a2;
		a2=a1;
		for(int a3=0;a3<a1.length;a3++) {
			a2[a3]++;
			System.out.println("a1["+a3+"]="+a1[a3]);
			System.out.println("a2["+a3+"]="+a2[a3]);
		}
  
		
	}

}
