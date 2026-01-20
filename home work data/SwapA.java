class SwapA
{
	public static void main(String[] args)
	{
		int[] a = {10,20};
		int tem = a[0];
		a[0] = a[1];
		a[1] = tem;
		
		System.out.print("a[0]="+ a[0]+" "+"a[1]="+a[1]);
    }

}