package com.zensar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Utility {
	private ArrayList<Student> list=new ArrayList<>();
	
	public void createList(Student s) 
	{
		list.add(s);
	}
	public void printList() 
	{
		Iterator<Student> iterator=list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()+" "+iterator.toString());
	}
	}

}
public class UtilityList
{
	public static void main(String args[]) {
		
	
		Scanner scanner=new Scanner(System.in);
		int ch=0;
		Utility utilityLi=new Utility();
		while(true)
		{
			System.out.println("Choose an option");
			System.out.println("Choose 1 for inserting");
			System.out.println("Choose 2 for displaying");
			System.out.println("Choose 3 to exit");
			ch=scanner.nextInt();
		  switch (ch) 
		  {
			case 1:
			{
				System.out.println("Enter the values of roll number name and percentage");
				int temp=scanner.nextInt();
				 String temp1=scanner.next();
				 double temp2=scanner.nextDouble();
				 Student studentTwo=new Student(temp,temp1,temp2);
				 utilityLi.createList(studentTwo);
				 break;
			}
			case 2:
			{
				utilityLi.printList();
				break;
			}
			case 3:
			{
				System.exit(0);
			}
			default :
			{
				System.out.println("Invalid choice");
			}
		  }	
		}
	}
}
