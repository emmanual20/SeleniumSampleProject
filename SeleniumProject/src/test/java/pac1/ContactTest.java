package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
public void createcontactTest() {
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		String username=System.getProperty("login");
		String password=System.getProperty("password");
		System.out.println(url+","+browser+","+username+","+password);
	System.out.println("execute create contact Test");
}

@Test
public void modifycontactTest() {
	System.out.println("execute modify contact");
}
@Test
public void deletecontactTest() {
	System.out.println("execute delete contact");
}
}
