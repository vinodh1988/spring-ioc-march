package com.system;

public class LightTaskRunner implements TaskRunner{

	SubTask sub;
	
	
	
	public LightTaskRunner(SubTask sub) {
		super();
		this.sub = sub;
	}



	@Override
	public void task() {
		// TODO Auto-generated method stub
		sub.subtask();
		System.out.println("Light Task is running");
	}

}
