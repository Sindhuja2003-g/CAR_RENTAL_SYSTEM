package application;

public class Employee {
	
	    private int emp_id;
	    private String username;
	    private String password;
	    private String first_name;
	    private String last_name;
	    private String contact_No;
	    private String street;
	    private String city;
	    private String country;

	    public Employee(int emp_id, String username, String password, String first_name, String last_name,
	                    String contact_No, String street, String city, String country) {
	        this.emp_id = emp_id;
	        this.username = username;
	        this.password = password;
	        this.first_name = first_name;
	        this.last_name = last_name;
	        this.contact_No = contact_No;
	        this.street = street;
	        this.city = city;
	        this.country = country;
	    }

	    // Getter methods
	    public int getEmp_id() {
	        return emp_id;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public String getFirst_name() {
	        return first_name;
	    }

	    public String getLast_name() {
	        return last_name;
	    }

	    public String getContact_No() {
	        return contact_No;
	    }

	    public String getStreet() {
	        return street;
	    }

	    public String getCity() {
	        return city;
	    }

	    public String getCountry() {
	        return country;
	    }

	    // Setter methods
	    public void setEmp_id(int emp_id) {
	        this.emp_id = emp_id;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public void setFirst_name(String first_name) {
	        this.first_name = first_name;
	    }

	    public void setLast_name(String last_name) {
	        this.last_name = last_name;
	    }

	    public void setContact_No(String contact_No) {
	        this.contact_No = contact_No;
	    }

	    public void setStreet(String street) {
	        this.street = street;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }
	}

