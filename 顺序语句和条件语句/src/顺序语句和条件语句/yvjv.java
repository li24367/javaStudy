package 顺序语句和条件语句;

public class yvjv {

	public static void main(String[] args) {
		// 顺序语句
		int a=5;
		int b=3;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//条件语句
	   /*(if语句)*/
		int chengji=92;
		if(chengji>90) {System.out.println("优秀");}
		System.out.println("考察完毕");
		/*(if...else语句)*/
		int year=2005;
		if(year>2008) {System.out.println("我的值大于2008");}
		else {System.out.println("我的值小于2008");}
		/*if...else...if语句*/
		int fenshu=30;
		if(fenshu>90)
				System.out.println("优秀");
		if(fenshu>70)
                System.out.println("一般");
		if(fenshu>60)
			System.out.println("及格");
		else
			System.out.println("不及格，重修");
		/*(switch控制语句) 1*/
		  int month=12;
		  switch(month) {
		  case 12:
		  case 1:
		  case 2:
			  System.out.println("冬季");
			  break;
		  case 3:
		  case 4:
		  case 5:
			  System.out.println("春季");
			  break;
		  case 6:
		  case 7:
		  case 8:
			  System.out.println("夏季");
			  break;
		  case 9:
		  case 10:
		  case 11:
			  System.out.println("秋季");
		  break;
			  default:
				  System.out.println("输入错误");}
		  /*(switch控制语句)  2*/
		  int y=33;
		  switch(y)
		  {
			  case 11:
				  System.out.println("y=11");
			  case 22:
				  System.out.println("y=22");
			  case 33:
				  System.out.println("y=33");
				  break;
				  default:
					  System.out.println("no");}
			/*(switch控制语句 3)*/
		  int z=111;
		  switch(z) {
		  case 111:
		  case 222:
		  case 333:
			  System.out.println("z=111|z=222|z=333");
			  default:
				  System.out.println("no");
		  }
		  /*(switch控制语句 4)*/
		  int h=1997;
		  switch(h) {
		  case 1992:
			  System.out.println("h=1992");
		  default:
			  System.out.println("no");
		  case 1997:
			  System.out.println("h=1997");
		  case 2008:
			  System.out.println("h=2008");
		  }
	}		  
}		  
		  
			  
		 
		  
	


