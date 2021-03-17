package com.system;

import org.springframework.beans.factory.annotation.Autowired;

import com.system.version2.MinorTask;

public class HeavyTaskRunner implements TaskRunner{

	private SubTask sub;

@Autowired			
	private MinorTask task2;

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
		task2.subtask();
		System.out.println("Heavy Task is running");
		
	}

}
