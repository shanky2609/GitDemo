package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforevalidation()
	{
		System.out.println("Print Hooks");
	}
	
	
	@After("@MobileTest")
	public void aftervalidation()
	{
		System.out.println("Print Hooks After");
	}
	
	@Before("@SmokeTest")
	public void before1validation()
	{
		System.out.println("Print smokes");
	}
	
	
	@After("@SmokeTest")
	public void after1validation()
	{
		System.out.println("Print smoke After");
	}
	}

