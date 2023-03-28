package com.mobileCentre;

import java.util.Scanner;

public class MobileStore 
{
	static int mobileCount=0;
	static Scanner sc = new Scanner(System.in);
	
	public static void addMobile(Mobile m)
	{
		System.out.println("Enter mobile id :");
		m.setId(sc.nextInt());
		
		System.out.println("Enter mobile brand :");
		m.setBrand(sc.next());
		
		System.out.println("Enter mobile name :");
		m.setName(sc.next());
		
		System.out.println("Enter mobile price :");
		m.setPrice(sc.nextFloat());
	}
	
	public static void deleteMobile(Mobile m[],int rid)
	{
		boolean flag = false;
		
		for(int i=0;i<mobileCount;i++)
		{
			if(m[i].getId()==rid)
			{
				flag=true;
				
				System.out.println(m[i]);
				
				for(int j=i;j<mobileCount-1;j++)
				{
					m[j]=m[j+1];
				}
				m[mobileCount-1]=null;
				mobileCount=mobileCount-1;
				System.out.println("Mobile deleted succesfully");
				System.out.println("----------------------------------");
				break;
			}
		}
		if(!flag)
			System.out.println("Mobile not found ");
	}
	
	public static void updateMobilePrice(Mobile m[],int rid)
	{
		boolean flag = false;
		
		for(int i=0;i<mobileCount;i++)
		{
			if(m[i].getId()==rid)
			{
				flag=true;
				System.out.println("Enter updated price :");
				m[i].setPrice(sc.nextFloat());
				System.out.println(m[i]);
				
				System.out.println("Mobile price updated succesfully :");
				break;
				
				
				
			}
			
				
		}
		if(!flag)
		{
			System.out.println("Mobile not found");
		}
	}
	
	public static void ViewByBrand(Mobile m[],String mbrand)
	{
		boolean flag = false;
		
		for(int i=0;i<mobileCount;i++)
		{
			if(m[i].getBrand().equals(mbrand))
			{
				flag=true;
				System.out.println("Mobile details are :");
				System.out.println(m[i]);
				
			}
		}
	}
	
	public static void viewAllMobiles(Mobile m[])
	{
		System.out.println("----------------///////////--------------");
		System.out.println("==================MOBILE LIST===========");
		System.out.println("-----------------////////////--------------");
		
		for(int i=0;i<mobileCount;i++)
		{
			System.out.println(m[i]);
		}
	}

	public static void main(String[] args) 
	{
		Mobile m1[] = new Mobile[3];
		
		int choice;
		String ch;
		do
		{
			System.out.println(":::::::::::::WELCOME TO MOBILE STORE:::::::::::::");
			System.out.println("=========CHOOSE TASK==============");
			
			System.out.println("1.Add a mobile :");
			System.out.println("2.Delete a mobile :");
			System.out.println("3.Update price of mobile :");
			System.out.println("4.View mobile by brand");
			System.out.println("5.View all mobiles");
			System.out.println("0.Exit :");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:if(mobileCount<3)
			{
				m1[mobileCount] = new Mobile(); 
				addMobile(m1[mobileCount]);
				mobileCount++;
			}
			
			else
			{
				System.out.println("No more mobiles :");
			}
			break;
			
			case 2: System.out.println("Enter mobile id to be deleted :");
			int rid = sc.nextInt();
			deleteMobile(m1, rid);
			break;
			
			case 3: System.out.println("Enter id to be updated :");
			rid = sc.nextInt();
			updateMobilePrice(m1, rid);
			break;
			
			case 4: System.out.println("Enter brand name :");
			String mbrand=sc.next();
			ViewByBrand(m1, mbrand);
			break;
			
			case 5:viewAllMobiles(m1);
			break;
			
			
			
			
			
			
			}
			System.out.println("Do you want to perform more operation(yes/no)");	
		      ch=sc.next();
		    	 

			}while(ch.equalsIgnoreCase("yes"));
		
		while(ch.equalsIgnoreCase("no"))
		{
			System.out.println("Thank you!!! Visit again");
			break;
		}
		
	
		

	}

}
