package com.lotustechblog.tutorial1.multiplier;
import org.jbehave.core.annotations.*;
import org.junit.Assert;

import com.lotustechblog.tutorial1.Multiplier;
public class MultiplierSteps{
	
	Multiplier mul;
	int result;
	
	@Then("the outcome should be $result")

	public void thenTheOutcomeShouldBe10(int result){
		 //TODO
		Assert.assertEquals(result, mul.getResult());
	}
	
	@Given("a Multiplier")

	public void givenAMultiplier(){
		 //TODO
		mul = new Multiplier();
		System.out.println("mul created");
	}
	
	@When("I multiply $num1 and $num2")

	public void whenIMultiply2And5(int num1 , int num2){
		 //TODO
		mul.multiply(num1, num2);
	}
	
}