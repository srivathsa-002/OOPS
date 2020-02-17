import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 6 numbers:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		Arithmetic a=new Adder();
		System.out.println("Sum is " + a.add(arr));
	}
}