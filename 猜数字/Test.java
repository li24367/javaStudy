import java.util.Scanner;
 
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //生成随机1-1000以内整数
        int num = (int)(Math.random()*1000+1);
        System.out.println(num);  //作弊，查看随机数是多少
        while(true){
            System.out.println("猜吧");
            int input = scan.nextInt();
            if(input == -1){
                System.out.println("游戏结束!");
                break;
            }else if(input >num){
                System.out.println("猜大了!");
            }else if(input <num){
                System.out.println("猜小了!");
            }else{
                System.out.println("猜对了，恭喜你!");
                break;
            }
        }
    }
}
 

 