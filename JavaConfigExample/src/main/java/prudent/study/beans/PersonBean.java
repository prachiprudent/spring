package prudent.study.beans;

public class PersonBean {
	
	String name,bloodGroup;
	
	public PersonBean() {
		System.out.println("person bean default constructor");
	}
	
	public PersonBean(String name,String bg)
	{
		this.name = name;
		this.bloodGroup =bg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

}
