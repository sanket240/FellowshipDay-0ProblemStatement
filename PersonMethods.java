package Addressbook;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Iterator;

public class PersonMethods implements PersonMethod
{
		ArrayList<Person> person=new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		public void CreatePerson()
		{
				  Person person1=new Person();
			      System.out.println("Enter Your First Name");
			      Scanner scanner=new Scanner(System.in);
			      person1.firstName=scanner.nextLine();			   
			      System.out.println("Enter Your Last Name");
			      person1.lastName=scanner.nextLine();
			      System.out.println("Enter Your city Name");
			      person1.city=scanner.nextLine();
			      System.out.println("Enter Your state Name");
			      person1.state=scanner.nextLine();
			      System.out.println("Enter Your phone Number");
			      person1.phNo=scanner.nextLine();
			      System.out.println("Enter Your zip");
			      person1.zip=scanner.nextInt();
			      System.out.println("Added Successfully");
			      person.add(person1);
		}
	
		public void UpdatePerson(String name,String u)
		{
			int flag=0;
	        for(Person p:person)
	        {
	        	if(p.firstName.equals(name))
	        	{
	        		flag=1;
	                switch (u)
	                {
	                    case "city":
	                        System.out.println("Enter Your city Name");
	                        p.city=scanner.nextLine();
	                        break;
	                    case "state":
	                        System.out.println("Enter Your state Name");
	                        p.state=scanner.nextLine();
	                        break;
	                    case "phone":
	                        System.out.println("Enter Your phone Number");
	                        p.phNo=scanner.nextLine();
	                        break;
	                    case "zip":
	                        System.out.println("Enter Your zip");
	                        p.zip=scanner.nextInt();
	                        break;
	                }
	        	}
	        }
	        if(flag==0)
	        {
	            System.out.println("Not Found");
	        }
	        else
	        {
	            System.out.println("Update Successfully");
	        }
	    }
		public void DeletePerson(String name)
		{
	   	   int flag=0;
	        Iterator<Person> itr=person.iterator();
	        while(itr.hasNext())
	        {
	            Person a=itr.next();
	            if(a.firstName.equals(name))
	            {
	                flag=1;
	                itr.remove();
	            }
	        }
	        if(flag==0)
	        {
	            System.out.println("Not Found");
	        }
	        else
	        {
	            System.out.println("Delete Successfully");
	        }
		}	  
	    public void sortByName()
	    {
	    	Collections.sort(person,Person.PerNameComparator);
	    }
	    public void sortByCity()
	    {
	    	Collections.sort(person,Person.PerCityComparator);
	    }
	    public void sortByState()
	    {
	    	Collections.sort(person,Person.PerStateComparator);
	    }
	    public void sortByZip()
	    {
	    	Collections.sort(person,Person.PerZipComparator);
	    }
	    public void Display(){
	        for(Person p:person){
	            System.out.println(p);
	        }
	    }
	    
	    public void SearchCity()
	    {
	    	System.out.println("Enter city:");
	    	String city_name=scanner.nextLine();
	    	for(Person per : person)
	    	{
	    		if(city_name.equals(per.city))
	    		{
	    			System.out.println(per.toString());
	    		}
	    	}
	    }
	    public void SearchState()
	    {
	    	
	    	System.out.println("Enter state:");
	    	String state_name=scanner.nextLine();
	    	for(Person per : person)
	    	{
	    		if(state_name.equals(per.state))
	    		{
	    			System.out.println(per.toString());
	    		}
	    	}
	    }

		public void viewByCity()
		{
			System.out.println("Enter city name");
			String city=scanner.next();
			Dictionary infoCity=new Hashtable();
			for(Person a:person)
			{
				if(a.city.equals(city)) 
				{
					infoCity.put(a.firstName, city);
				}
				
			}
			System.out.println("The Dictionary Contains:"+infoCity);
			
		}
		
		public void viewByState() 
		{
			System.out.println("Enter State name");
			String state=scanner.next();
			Dictionary infoState=new Hashtable();
			for(Person a:person)
			{
				if(a.state.equals(state))
				{
					infoState.put(a.firstName, state);
				}
				
			}
			System.out.println("The Dictionary Contains:"+infoState);
			
		}

		
}
