package 循环语句;

public class XunHuan {

	public static void main(String[] args) {
		// for语句
		for(int a=0;a<10;a++) {
		System.out.println(a);	
		}
         for(int b=1,c=6;b<c;c--) {
        	System.out.println("b="+b);
        	System.out.println("c="+c);
         }
         /*for的嵌套语句*/
         int n=7;
         int o=(n/2);
         int t=1;
         int step=2;
         for(int i=0;i<n;i++) {
        	 for(int j=0;j<Math.abs(o);j++) {
        		 System.out.println((char)32);
        	 }
        	 o--;
        	 for(int k=1;k<=t;k++) {
        		 System.out.println("*");
        		 
        	 }
        	 t=t=step;
        	 if(t==n) {
        		 step=-step;
        		 
        	 }
        	 System.out.println();
         }
      for(int x=9;x>=1;x--) {
    	for(int y=x;y>=1;y--) {
    		System.out.println(y+"");
    	}
    	System.out.println();
      }
      /*whhile语句*/
      int aa=0;
      while(aa<10) {
    	System.out.println(aa);
    	aa++;
      }
      int sum=0;
      int ii=1;
      System.out.println("累加不大于4的所有自然数如下：");
      while(sum<10) {
    	  sum=sum+ii;
    	  System.out.println(ii);
    	  ii++;
      }
      int bb=0;
      do {
    	  System.out.println(bb);
    	  bb++;
    	  
      }while(bb<10);
      int tao=2;
    		  do {
    			  tao=tao-5;
    			  System.out.println(tao);
    		  }
    		  while(tao>=5);
	}

}
