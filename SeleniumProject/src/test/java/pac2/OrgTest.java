package pac2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test
public void createorgTest() {
	System.out.println("execute create Org Test");
	String url=System.getProperty("url");
	String browser=System.getProperty("browser");
	String username=System.getProperty("login");
	String password=System.getProperty("password");
	System.out.println(url+","+browser+","+username+","+password);
}

@Test
public void modifyOrgTest() {
	System.out.println("execute modify Org");
}
}
