package Addressbook;

public interface PersonMethod {
	public void CreatePerson();
	public void DeletePerson(String name);
	public void UpdatePerson(String name,String u);
	public void sortByName();
	public void sortByCity();
	public void sortByZip();
	public void sortByState();
	public void Display();
	public void SearchState();
	public void SearchCity();
	public void viewByCity();
	public void viewByState();

}
