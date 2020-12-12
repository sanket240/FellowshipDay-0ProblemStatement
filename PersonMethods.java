package Addressbook;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Iterator;

public class PersonMethods {
	int id=0;
	ArrayList<Person> person=new ArrayList<>();
	public void CreatePerson()
	{
	  id++;
	  
      Person person1=new Person();
      person1.id=id;
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
	        Scanner s=new Scanner(System.in);
	        for(Person p:person){
	        if(p.firstName.equals(name))
	        {
	                flag=1;
	                switch (u)
	                {
	                    case "city":
	                        System.out.println("Enter Your city Name");
	                        p.city=s.nextLine();
	                        break;
	                    case "state":
	                        System.out.println("Enter Your state Name");
	                        p.state=s.nextLine();
	                        break;
	                    case "phNo":
	                        System.out.println("Enter Your phone Number");
	                        p.phNo=s.nextLine();
	                        break;
	                    case "zip":
	                        System.out.println("Enter Your zip");
	                        p.zip=s.nextInt();
	                        break;
	                }
	          }
	      }
	        if(flag==0){
	            System.out.println("Not Found");
	        }
	        else{
	            System.out.println("Update Successfully");
	        }
	    }
	 public void DeletePerson(String name)
	 {
		   int flag=0;
	        Scanner s=new Scanner(System.in);
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

	    public ArrayList<Person> unique(){
	        Person a=new Person();
	        a.set.addAll(person);
	        ArrayList<Person>arr=new ArrayList<Person>(a.set);

	        return arr;
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

	    public void Display(){
	        for(Person p:person){
	            System.out.println(p);
	        }
	    }
	    
	    public void SearchCity()
	    {
	    	Scanner input =new Scanner(System.in);
	    	System.out.println("Enter city:");
	    	String city_name=input.nextLine();
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
	    	Scanner input =new Scanner(System.in);
	    	System.out.println("Enter state:");
	    	String state_name=input.nextLine();
	    	for(Person per : person)
	    	{
	    		if(state_name.equals(per.state))
	    		{
	    			System.out.println(per.toString());
	    		}
	    	}
	    }
}
