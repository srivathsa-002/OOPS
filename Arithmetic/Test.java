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
abstract class Arithmetic{
	protected int sum;
	Arithmetic(){
		this.sum=0;
	}
	public abstract int add(int[] arr); 
}
class Adder extends Arithmetic{
	Adder(){
		super();
	}
	public int add(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			sum = sum + arr[i];
		return sum;
	}
}
