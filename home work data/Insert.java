class Insert
{
	public static void main(String[] args)
	{
		int [] arr = {10, 20, 30, 40,50};
		int in_p = 3;
		int in_v = 25;
		
		int [] new_arr = new int[arr.length + 1];
		
		for(int i = 0; i <= in_p - 1; i++)
			
		    new_arr[i] = arr[i];
			
		    new_arr[in_p - 1] = in_v;
			
	    for(int i = in_p; i < new_arr.length; i++)
			
			new_arr[i] = arr[i - 1];
			
		for(int i=0; i<new_arr.length; i++)
			System.out.print(new_arr[i] +"  ");
		
	}
}