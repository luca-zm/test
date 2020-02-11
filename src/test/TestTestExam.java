package test;

import static org.junit.Assert.*;

import org.junit.Test;

import prova.Main;
import prova.TestEsame;

public class TestTestExam {

	String name = "luca";
	
	String nameNot = "francesco";
	int age = 20;
	
	TestEsame ext = new TestEsame();
	
	//test che verifica l'ESISTENZA del nome "luca" all'interno dell'array
	@Test
	public void testExist(){
		
		Boolean ver = false;

		if (ext.getUserAge(name) != 0) {
			ver = true;
		}
		assertEquals(true, ver);	
	}
	
	
	//test che verifica la NON ESISTENZA della stringa "francesco" all'interno dell'array
	@Test
	public void testNotExist() {
		
		int x = ext.getUserAge(nameNot);
		
		assertEquals(0, x);
		
	}
	
	
	@Test
    public void testMain() {
        String [] args = {};
        Main.main(args);
    }
	
	@Test
    public void testErrorMain() {
		new Main();
        String [] args = {};
        Main.main(args);
    }
	
}
