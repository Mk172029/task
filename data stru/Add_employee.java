import java.util.Scanner;
class Add_employee
{
	int[] eid = new int[100];
	int count = 0;
	Scanner sc = new Scanner(System.in);
	
	void addemployeeid()
	{

		System.out.print("enter your employee id :");
		int id = sc.nextInt();
		eid[count] = id;
		count++;
		System.out.print("enter your employee " +id + "added");
	}
	void removeEmployeeid()
	{

		System.out.print("enter your removeEmployeeid id :");
		int id = sc.nextInt();
		
		for(int i = 0; i < count; i++)
		{
			if(eid[i] == id)
			{	
			for(int j = i; j < count - 1; j++)
			{
				eid[j] = eid[j+1];
			}
			count--;
			System.out.println(" removeEmployeeid id succesfull");
			return;
			
			}
		}
		System.out.println(" removeEmployeeid id not fount:");	
		
	}
 void displayEmployeeid()
	{
		if(count == 0)
		{
			System.out.println(" no Employeeid ");
			return;
		}
		System.out.println(" ..show Employeeid.. ");
		
		for(int i=0; i< count; i++)
		{		
		System.out.print("   " + eid[i] + " ");
	}
	System.out.println(" ");
	}
	
	void manu()
	{
	int option;
do {
	System.out.println("...Main menu... ");
	System.out.println("1. addemployeeid ");
	System.out.println("2. removeEmployeeid");
	System.out.println("3. displayEmployeeid");
	System.out.println("4. Exit");
	System.out.print("Enter option :");
	
	option = sc.nextInt();
	
	switch(option)
	{
	   case 1 :
		 addemployeeid();
		 break;
		
	   case 2 :
		 removeEmployeeid();
		 break;
	   case 3 :
		 displayEmployeeid();
		 break;
		 
	default:
	{
		System.out.println("Thank you welcome...");
	 }
    }
	}while(option != 4 );
	
	}
	public static void main(String[] args)
	{
		Add_employee obj = new Add_employee();
		obj.manu();
    }
}