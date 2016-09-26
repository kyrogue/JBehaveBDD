package com.lotustechblog.tutorial1;
import org.jbehave.core.annotations.*;
import org.junit.Assert;
public class TransactionSteps{
	private static final double DELTA = 1e-15;
	Transaction trans;
	
	@Given("a transaction")

	public void givenATransaction(){
		 //TODO
		trans = new Transaction();
		System.out.println("Transaction created");
	}
	@When("the amount is at least $amt dollars")

	public void whenTheAmountIsAtLeast100Dollars(double amt){
		 //TODO
		trans.setTransAmt(amt);
		Assert.assertEquals(100,trans.getTransAmt(),DELTA);
	}
	@Then("membership will be free")

	public void thenMembershipWillBeGiven(){
		 //TODO
		Assert.assertTrue(trans.isFreeMembershipGiven());
	}
}