//Creating Patient class with 4 variable along with constructor ,getters and setters and tostring method

public class Patients {
	
	private String nsme;
	private int age;
	private String disease;
	private int bill;
	
	//Default constructor
	public Patients() {
		
	}
	
	//Parameterized constructor
	public Patients(String nsme, int age, String disease, int bill) {
		super();
		this.nsme = nsme;
		this.age = age;
		this.disease = disease;
		this.bill = bill;
	}
	
	//Getters and setters

	public String getNsme() {
		return nsme;
	}

	public void setNsme(String nsme) {
		this.nsme = nsme;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Patients [nsme=" + nsme + ", age=" + age + ", disease=" + disease + ", bill=" + bill + "]";
	}

	//creating to string method for all
	

}
