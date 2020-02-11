package prova;

public class TestEsame {

	String arrayNames[]= {"luca", "davide", "stefano"};
	int arrayAge[]= {20, 25, 30};
	
	public int getUserAge(String name) {
		for(int i = 0; i<3; i++) {
			if (name.contentEquals(arrayNames[i])) {
				return arrayAge[i];
			}
		}
		return 0;
	}
	

}
