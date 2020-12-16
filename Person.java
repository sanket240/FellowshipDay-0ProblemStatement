package Addressbook;
import java.util.Comparator;
import java.util.TreeSet;

public class Person {
	    String firstName;
	    String lastName;
	    String city,state;
	    int zip;
	    String phNo;

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	  
	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public int getZip() {
	        return zip;
	    }

	    public void setZip(int zip) {
	        this.zip = zip;
	    }

	    public String getPhNo() {
	        return phNo;
	    }

	    public void setPhNo(String phNo) {
	        this.phNo = phNo;
	    }

        public static Comparator<Person> PerNameComparator = new Comparator<Person>() {

            public int compare(Person s1, Person s2) {
                String PersonName1 = s1.getFirstName().toUpperCase();
                String PersonName2 = s2.getFirstName().toUpperCase();
                return PersonName1.compareTo(PersonName2);

            }};
            public static Comparator<Person> PerCityComparator = new Comparator<Person>() {

                public int compare(Person s1, Person s2) {
                    String CityName1 = s1.getCity().toUpperCase();
                    String CityName2 = s2.getCity().toUpperCase();
                    return CityName1.compareTo(CityName2);
                }};
                
                public static Comparator<Person> PerStateComparator = new Comparator<Person>() {

                    public int compare(Person s1, Person s2) {
                        String StateName1 = s1.getState().toUpperCase();
                        String StateName2 = s2.getState().toUpperCase();
                        return StateName1.compareTo(StateName2);

                    }};
                    
                    public static Comparator<Person> PerZipComparator = new Comparator<Person>() {

                        public int compare(Person s1, Person s2) {
                            int Zip1 = s1.getZip();
                            int Zip2 = s2.getZip();
                            return Zip1 - Zip2;
                        }};
                    
                    
                    
                    public String toString() {
                        return
                                ", firstName='" + firstName + '\'' +
                                ", lastName='" + lastName + '\''+
                                ", city='" + city + '\'' +
                                ", state='" + state + '\'' +
                                ", zip=" + zip +
                                ", phNo='" + phNo + '\''

                                ;
                    }
                    


}
