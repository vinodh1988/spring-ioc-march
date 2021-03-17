package com.system.version2;

import org.springframework.stereotype.Component;

import com.system.SubTask;

@Component("mtask1")
public class SubActivityPerformer implements MinorTask {

	@Override
	public void subtask() {
		// TODO Auto-generated method stub
         System.out.println("Performer is performing sub activity");
	}

}
