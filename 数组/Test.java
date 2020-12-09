import java.util.Arrays;
 
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));  //查看随机生成的数组
        //求数组最大值
        for(int i=0;i<arr.length-1;i++){
            int temp;
            if(arr[i]>arr[i+1]){
                temp= arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            System.out.println("第"+(i+1)+"次排序"+Arrays.toString(arr));
        }
        System.out.println("最大元素是:"+arr[arr.length-1]);
    }
}