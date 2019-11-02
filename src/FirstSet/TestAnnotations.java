package FirstSet;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {

	
	
	
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("after suite");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("before test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("after test");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("after class");
	}
	
	@BeforeGroups
	public void beforeGroup(){
		System.out.println("before group");
	}
	
	@AfterGroups
	public void afterGroup(){
		System.out.println("after group");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("after method");
	}
	
	@Test(groups={"smoke_group"})
	public void firstTest(){
		System.out.println("first test");
	}
	
	@Test(groups={"smoke_group"})
	public void secondTest(){
		System.out.println("second test");
	}
	
	@Test(groups={"sanity_group"})
	public void thirdTest(){
		System.out.println("third test");
	}
	
	@Test(groups={"sanity_group"})
	public void fourthTest(){
		System.out.println("fourth test");
	}
}
