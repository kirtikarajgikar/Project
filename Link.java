import java.util.Scanner;

public class Link {
	private Node head;
	 public Link() 
	 {
		 head=null;
	 }
	 public void create(int terms)
	 {
			int data;
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<=terms;i++)
			{
			System.out.println("enter data");
			data=sc.nextInt();
			Node newnode=new Node(data);
			if(head==null)
			{
				head=newnode;
			}
			else
			{
				Node move=head;
				while(move.getNext()!=null)
				{
					move=move.getNext();
				}
				move.setNext(newnode);	
			}
		}
	 }
public int count()
{
int cnt=0;
	//this is comment....hello kirti
	if(head==null)
	{
		System.out.println("Empty");
	}
	else
	{
		Node move=head;
		while(move.getNext()!=null)
		{
			cnt++;
			move=move.getNext();
		}
	}
	return cnt;
 }
public void Insert(int data,int pos)
{
	Node newnode=new Node(data);
	int cnt=count();
	if(pos==1)
	{
	if(head==null)
	{
		head=newnode;
	}
	else
	{
		Node move=head;
		while(move.getNext()!=null)
		{
			move=move.getNext();
		}
		newnode.setNext(head);
		head=newnode;
		return;
	}
  }
	if(pos==cnt+1)
	{
		Node move=head;
		while(move.getNext()!=null)
		{
			move=move.getNext();
		}
		move.setNext(newnode);
		return;
	}
	if(pos>cnt+1)
	{
		System.out.println("Not valid");
	}
	int i;
	Node move=head;
	for(i=0;i<pos-1;i++)
	{
		move=move.getNext();
	}
	newnode.setNext(move.getNext());
	move.setNext(newnode);
	return;
}
public void Delete(int pos)
{
	if(pos==1)
	{
		if(head==null)
		{
			System.out.println("Empty");
		}
		else
		{
			Node del=head;
			head=del.getNext();
			del=null;
		}
	}
	int cnt=count();
	if(pos==cnt+1)
	{
		Node move=head;
		while(move.getNext().getNext()!=null)
		{
			move=move.getNext();
		}
		Node del=move.getNext();
		move.setNext(null);
		return;
	}
	int i;
	Node move=head;
	for(i=1;i<pos-1;i++) 
	{
	move=move.getNext();
	}
	Node del;
	del=move.getNext();
	move.setNext(del.getNext());
	del=null;
	return;
}
public void display() 
{
	if(head==null)
	{
		System.out.println("LL Is Empty");
	}
		Node move=head;
		while(move.getNext()!=null)
		{
			System.out.println(move.getData());
			move=move.getNext();
		}
    }
}


