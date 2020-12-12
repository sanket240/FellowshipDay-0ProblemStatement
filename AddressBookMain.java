package Addressbook;
import java.util.Scanner;
public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int choice=1;
		 PersonMethods personmethods=new PersonMethods();
		 personmethods.CreatePerson();
		 Scanner s=new Scanner(System.in);
		 while(choice!=0)
		 {
			 System.out.println("1.Add Person\n2.Update");
			 System.out.println("Enter Your Choice");
	         choice=s.nextInt();
	         switch (choice) {
             case 1:
            	 personmethods.CreatePerson();
                 break;
             case 2:
            	 System.out.println("Enter name to Update");
                 String name=s.next();
                 System.out.println("Enter what to update");
                 String wht=s.next();
                 personmethods.update(name,wht);
                 break;
	         }    
		 }
	}

}