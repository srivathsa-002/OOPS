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
