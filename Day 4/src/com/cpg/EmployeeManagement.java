package com.cpg;
import java.util.*;
class EmployeeM
{
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", ID=" + ID + "]";
	}
	

	public EmployeeM(String name, int salary, int iD) {
		super();
		this.name = name;
		this.salary = salary;
		this.ID = iD;
	}


	public EmployeeM() {
		// TODO Auto-generated constructor stub
	}


	private String name;
	private int salary;
	private int ID;
}

public class EmployeeManagement {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		EmployeeM e1[]= {};
		while(true)
		{
			System.out.println("Enter 1 to create details");
			System.out.println("Enter 2 to display");
			System.out.println("Enter 3 to search an employee");
			System.out.println("Enter 4 for delete a employee");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter the number of employees");
				int size=sc.nextInt();
				e1=new EmployeeM[size];
				for(int i=0;i<size;i++)
				{
					System.out.println("Enter the name");
					String name=sc.next();
					System.out.println("Enter the ID");
					int ID=sc.nextInt();
					System.out.println("Enter the salary");
					int salary=sc.nextInt();
					e1[i]=new EmployeeM(name,salary,ID);
				}
			}
			if(choice==2)
			{
				for(int i=0;i<e1.length;i++)
				{
					if(e1[i].getID()!=0)
					{
						System.out.println(e1[i]);
					}
				}
			}
			if(choice==3)
			{
				System.out.println("Enter the name to search");
				String name=sc.next();
				boolean flag=true;
				for(int i=0;i<e1.length;i++)
				{
					if(e1[i].getName().equalsIgnoreCase(name))
					{
						System.out.println("Employee found"+e1.toString());
						flag=false;
						break;
					}
				}
				if(flag)
				{
					System.out.println("Not Found");
				}
			}
			if(choice==4)
			{
				boolean deleteFlag=true;
				for(int i=0;i<e1.length;i++)
				{
					System.out.println(e1[i]);
				}
				System.out.println("Enter the id for which you want to delete the employee");
				int id=sc.nextInt();
				for(int i=0;i<e1.length;i++)
				{
					if(e1[i].getID()==id)
					{
						System.out.println("Deleting record "+e1[i].toString());
						e1[i]=new EmployeeM();
						deleteFlag=false;
						break;
						
					}
				}
				if(deleteFlag)
				{
					System.out.println("No Matching Id found");
				}
				
			}
		}
	}

}
