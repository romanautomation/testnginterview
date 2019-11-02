package FirstSet;

import org.testng.annotations.Test;



public class TestBelongToSingleGroup {

	
	
	@Test(groups="sanity_group")
	public void testOne(){
		
		System.out.println("Sanity test");
	}
	
	@Test(groups={"smoke_group","sanity_group"})
	public void testTwo(){
		System.out.println("Normal test");
	}
	
	@Test(groups="sanity_group")
	public void testThree(){
		System.out.println("Sanity test");
	}
}
