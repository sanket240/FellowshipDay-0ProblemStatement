package Addressbook;
import java.util.Scanner;
public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int choice=1,person_count,i;
		 PersonMethods personmethods=new PersonMethods();
		 Scanner scanner=new Scanner(System.in);
		 while(choice!=0)
		 {
			 System.out.println("1.Add Person\n2.Update\n3.Delete\n4.Sort By Name\n5.Sort by City \n6.Sort by State\n7.Sort by Zip\n8.Display\n9.Search By City\n10.Search by State\n11.View By City\n12.View By State");
			 System.out.println("Enter Your Choice");
	         choice=scanner.nextInt();
	         switch (choice) 
	         {
             	case 1:
             		System.out.println("Enter Number of persons:");
             		person_count=scanner.nextInt();
             		for(i=0;i<person_count;i++)
             		{
             			personmethods.CreatePerson();
             		}
             		break;
             	case 2:
             		System.out.println("Enter name to Update");
             		String name=scanner.next();
             		System.out.println("Enter what to update");
             		String update=scanner.next();
             		personmethods.UpdatePerson(name,update);
             		break;
             	case 3:
            	 	System.out.println("Enter name to Delete");
            	 	String n=scanner.next();
            	 	personmethods.DeletePerson(n);
            	 	break;                
             	case 4:
             		personmethods.sortByName();
             		break;
             	case 5:
             		personmethods.sortByCity();
             		break;
             	case 6:
             		personmethods.sortByState();
             		break;
             	case 7:
             		personmethods.sortByZip();
             	case 8:
             		personmethods.Display();
             		break;
             	case 9:
             		personmethods.SearchCity();
             		break;
             	case 10:
             		personmethods.SearchState();
             		break;
             	case 11:
             		personmethods.viewByCity();
             		break;
             	case 12:
             		personmethods.viewByState();
             		break;
	         }  
		 }
	}

}
