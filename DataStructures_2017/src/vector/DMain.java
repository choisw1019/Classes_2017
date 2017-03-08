package vector;

public class DMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i0, i1, i2, i3, i4;
		int iArray[] = new int[5];
		iArray[4] = 0;
		
		
		for (int i=0; i<iArray.length; i++) {
			iArray[i] = i;
		}
		
		// 필요 기능
		iArray.add(0);
		iArray.remove(3);

	}
}
