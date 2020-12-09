import java.util.Arrays;
 
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = (int)(Math.random()*100);
        }
        System.out.println("随机数组:"+Arrays.toString(arr));
        //冒泡排序
        System.out.println("=====冒泡排序开始=====");
        for(int i=0;i<arr.length-1;i++){   //轮数
            for(int j=0;j<arr.length-i-1;j++){  //次数
                if(arr[j]>arr[j+1]){  //比较两个相邻的元素，并将较大的元素与后一个元素交换
                    int t;
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr)+"\n=====冒泡排序结束=====");
        System.out.println("=====从大到小排序开始=====");
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int t;
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr)+"\n=====从大到小排序结束=====");
    }
}
 