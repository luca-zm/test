package prova;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {

		TestEsame ex = new TestEsame();
		int age;
		String name=JOptionPane.showInputDialog("inserire nome utente");
		age = ex.getUserAge(name);
		
		if (age != 0) {
			System.out.println(name+ " ha un eta' di: "+Integer.toString(age));
		}else {
			System.out.println("utente non trovato");
		}
	}

}
