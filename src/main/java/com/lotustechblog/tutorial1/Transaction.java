package com.lotustechblog.tutorial1;

public class Transaction {
	private double transAmt;
	private boolean freeMembershipGiven;
	
	public Transaction(){
		
	}

	public double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
		if(transAmt >= 100){
			freeMembershipGiven = true;
		}
	}

	public boolean isFreeMembershipGiven() {
		return freeMembershipGiven;
	}

	public void setFreeMembershipGiven(boolean freeMembershipGiven) {
		this.freeMembershipGiven = freeMembershipGiven;
	}
	
	
	
}
