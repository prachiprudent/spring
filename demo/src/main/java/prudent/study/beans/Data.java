package prudent.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Data {

	private String name,auth;
	 
	public String getAuth() {
		return auth;
	}
	
	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Data()
	{
		name = "Learning ann config";
		auth ="prachi";
	}
}
