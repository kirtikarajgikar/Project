	import java.util.Scanner;
	public class Demo 
	{
	public static void main(String [] main)
	{
		Link l=new Link();
		l.create(5);
		l.display();
		int ch=1;
		Scanner sc=new Scanner(System.in);

		do
		{
			System.out.println("1.insert");
			System.out.println("2.delet");
			System.out.println("3.display");
			System.out.println("enter u ch");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter data to insert");
				int data=sc.nextInt();
				System.out.println("Enter pos to insert");
				int pos=sc.nextInt();
				
				l.Insert(data, pos);
				break;
			case 2:
				System.out.println("Enter pos to del data");
				int posi=sc.nextInt();
				l.Delete(posi);
				break;
			case 3:
				l.display();
				break;
			}
			
		}while(ch>0);
	}
	}

