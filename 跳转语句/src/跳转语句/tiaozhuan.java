package Ìø×ªÓï¾ä;

public class tiaozhuan {

	public static void main(String[] args) {
		/*breakµÄÌø×ªÓï¾ä*/
		for(int a=0;a<9;a++) {
			if(a==2) {
				break;
			}
			System.out.println(a);
		}

		
		    int b=0;
		    while(b<9) {
		    	if(b==2) {
		    		break;
		    	}
		    	System.out.println(b);
		    	b++;
		    }
		    
		    
		    int c=0;
		    do {
		    	if(c==2) {
		    		break;
		    	}
		    	System.out.println(c);
		    	c++;
		    }
		    while(c<9);
		    
		    
		    
		    for(int d=1;d<10;d++) {
		    	for(int e=d;e<10;e++) {
		    		if(e==5) {
		    			break;
		    		}
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    }
		    
		    
		    for(int f=1;f<10;f++) {
		    	if(f==5) {
		    		break;
		    	}
		    	for(int j=f;j<10;j++) {
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    }
		    
		    
		    
		    out:for(int h=0;h<10;h++) {
		    	System.out.println("h="+h);
		    	for(int i=0;i<10;i++) {
		    		if(i==5) {
		    			break out;
		    		}
		    		System.out.println("i="+i);
		    	}
		    }
		    
		    
		    
		    /*continueÌø×ªÓï¾ä*/
		    for(int g=0;g<9;g++) {
		    	System.out.print(g);
		    	if(g%2==0) {
		    		continue;
		    	}
		    	System.out.println("$");
		    }
		    
		    
		    /*¾Å¾Å³Ë·¨±í*/
		    out:for(int k=1;k<9;k++) {
		    	for(int l=1;l<9;l++) {
		    		if(l>k) {
		    			System.out.println();
		    			continue out;
		    		}
		    		System.out.print(""+k*l);
		    	}
		    	System.out.println();
		    }
		    
	}

}
