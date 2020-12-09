import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //用户输入数值
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入查询的年份:");
        int year = scan.nextInt();
        System.out.print("请输入查询的月份:");
        int month = scan.nextInt();
        int days;  //用于记录天数
        switch(month){
        case 2:
            if(year%400==0 || (year%4==0&&year%100!=0)){
                days = 29;
                break;
            }else{
                days = 28;
                break;
            }
        case 4:
        case 6:
        case 9:
        case 11:
            days = 30;
            break;
        default:
            days = 31;
            break;
        }
        System.out.println(year+"年的"+month+"月有"+days+"天");
    }
}