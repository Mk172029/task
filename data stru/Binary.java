import java.util.Scanner;

 class Binary 
 {
    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++)
	  {
            arr[i] = sc.nextInt();
      }

        System.out.print("Enter target element:");
        int target = sc.nextInt();

        int low = 0;
		int high = n - 1;
        int index = -1;

        while (low <= high) 
		{
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                index = mid;
                high = mid - 1;
            }
            else if (arr[mid] < target)
			{
                low = mid + 1;
            }
            else if (arr[mid] > target)
			{
                high = mid - 1;
            }
        }

       
        System.out.println("index:" + index);
    }
}