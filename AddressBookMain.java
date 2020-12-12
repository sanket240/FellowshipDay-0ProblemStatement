package Addressbook;
import java.util.ArrayList;
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
             System.out.println("1.Add Person\n2.Update\n3.Delete\n4.Duplicates\n5.Sort By Name\n");
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
             case 4:
                    ArrayList<Person> h= personmethods.unique();
                    for(Person a:h){
                        System.out.println(a);
                    }
                 break;  
             case 5:
                personmethods.sortByName();
                break;
             case 6:
                personmethods.sortByCity();
                break;
             case 7:
                personmethods.sortByState();
                break;
             case 8:
                 personmethods.Display();
                 break;
             }  
         }
    }

}
