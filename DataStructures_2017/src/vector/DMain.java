package vector;

public class DMain {
	public static void main(String[] args) {
		DVector dVector =  new DVector();
		for (int i=0; i<5; i++) {
			dVector.add(i);
		}
		for (int i=0; i<dVector.size(); i++) {
			System.out.println(dVector.get(i));
		}
		
	}
}
