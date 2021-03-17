package com.system;

import org.springframework.beans.factory.annotation.Autowired;

import com.system.version2.MinorTask;

public class LightTaskRunner implements TaskRunner{

	SubTask sub;
	
	@Autowired
	MinorTask mtask2;
	
	
	
	public LightTaskRunner(SubTask sub) {
		super();
		this.sub = sub;
	}



	@Override
	public void task() {
		// TODO Auto-generated method stub
		sub.subtask();
		mtask2.subtask();
		System.out.println("Light Task is running");
	}

}
