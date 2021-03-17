package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.system.TaskRunner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
         TaskRunner t=(TaskRunner)ac.getBean("ht");
         t.task();
         
         t=(TaskRunner)ac.getBean("lt");
         t.task();
	}

}
