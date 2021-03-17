package com.system.version2;

import org.springframework.stereotype.Component;

@Component("mtask2")
public class SubActivityPerformer2 implements MinorTask {

	@Override
	public void subtask() {
		// TODO Auto-generated method stub
		System.out.println("Perform2 performing minor task");
	}

}
