package test;

import static org.junit.Assert.*;

import org.junit.Test;

import prova.TestEsame;

public class TestTestExam {

	String name = "luca";
	
	int age = 20;
	
	
	@Test
	public void testExist(){
		
		TestEsame ext = new TestEsame();
		Boolean ver = false;

		if (ext.getUserAge(name) != 0) {
			ver = true;
		}
		assertEquals(true, ver);	
	}
	
}
