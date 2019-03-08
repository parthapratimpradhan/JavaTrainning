package com.learn.java;

public class MathResult {
	
	private int result;
	private String status = "SUCCESS";

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	public void setResult(String result) {
		if(result.equals("INF"))
		this.setStatus("Can not divide by zero");
	}

	public String getStatus() {
		return status;
	}

	private void setStatus(String status) {
		this.status = status;
	}
	

}
