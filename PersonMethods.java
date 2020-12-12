package Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMethods {
	int id=0;
	public void CreatePerson()
	{
	  id++;
	  ArrayList<Person> person=new ArrayList<>();
      Person person1=new Person();
      person1.id=id;
      System.out.println("Enter Your First Name");
      Scanner s=new Scanner(System.in);
      person1.firstName=s.nextLine();
      System.out.println("Enter Your Last Name");
      person1.lastName=s.nextLine();
      System.out.println("Enter Your city Name");
      person1.city=s.nextLine();
      System.out.println("Enter Your state Name");
      person1.state=s.nextLine();
      System.out.println("Enter Your phone Number");
      person1.phNo=s.nextLine();
      System.out.println("Enter Your zip");
      person1.zip=s.nextInt();
      System.out.println("Added Successfully");
      person.add(person1);	
	}
}
