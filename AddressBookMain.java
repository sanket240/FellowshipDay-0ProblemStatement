package Addressbook;
import java.util.Scanner;
public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int choice=1,person_count,i;
		 PersonMethods personmethods=new PersonMethods();
		 personmethods.CreatePerson();
		 Scanner s=new Scanner(System.in);
		 while(choice!=0)
		 {
			 System.out.println("1.Add Person\n");
			 System.out.println("Enter Your Choice");
	         choice=s.nextInt();
	         switch (choice) {
             case 1:
            	 System.out.println("Enter Number of persons:");
            	 person_count=s.nextInt();
            	 for(i=0;i<person_count;i++)
            	 {
            		 personmethods.CreatePerson();
            	 }
                 break;
             case 2:
            	 System.out.println("Enter name to Update");
                 String name=s.next();
                 System.out.println("Enter what to update");
                 String wht=s.next();
                 personmethods.UpdatePerson(name,wht);
                 break;
             case 3:
            	 System.out.println("Enter name to Delete");
                 String n=s.next();
                 personmethods.DeletePerson(n);
                 break;
	         }  
		 }
	}

}

