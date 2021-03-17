package com.system;

public class HeavyTaskRunner implements TaskRunner{

	private SubTask sub;
	

	public SubTask getSub() {
		return sub;
	}


	public void setSub(SubTask sub) {
		this.sub = sub;
	}


	@Override
	public void task() {
		// TODO Auto-generated method stub
		sub.subtask();
		System.out.println("Heavy Task is running");
		
	}

}
