import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Rat :");
		int rat = obj.nextInt();
		System.out.print("Unit :");
		int unit = obj.nextInt();
		System.out.print("House Count :");
		int n = obj.nextInt();
		int max_food = rat*unit;
		int[] arr = new int[n];
		int sum=0,count=0;
		for(int i=0;i<=n;i++){
		    arr[i] = obj.nextInt();
		    if(max_food>=sum){
		        sum +=arr[i];
		        count++;
		    }
		}
		System.out.print(count);
	}
}
