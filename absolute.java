import java.util.*;
class main{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = obj.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sum += Math.abs(arr[i]-arr[i-i]);
            }
            else{
                sum += Math.abs(arr[i]-arr[i+1]);
            }
        }
        System.out.print(sum);
    }
}
