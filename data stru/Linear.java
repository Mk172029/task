import java.util.Scanner;

class Linear 
   {
    public static void main(String[] args)
	
	{

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
	 {
            arr[i] = sc.nextInt();
     }

       
        System.out.print("Enter target element:");
        int target = sc.nextInt();

        int index = -1;

        
        for (int i = 0; i < n; i++) 
		{
            if (arr[i] == target) 
			{
                index = i;
            }
        }

        
        System.out.println("index :"+ index);
    }
}