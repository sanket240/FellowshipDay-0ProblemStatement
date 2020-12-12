package Addressbook;
import java.util.Comparator;
import java.util.TreeSet;

public class Person {
		int id;
	    String firstName;
	    String lastName;
	    String city,state;
	    int zip;
	    String phNo;
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

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

        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Person a1=(Person)o1;
                Person a2=(Person)o2;
                if(a1.getFirstName().equalsIgnoreCase(a2.getFirstName())){
                    return 0;
                }
                return 1;
            }
        });

}
