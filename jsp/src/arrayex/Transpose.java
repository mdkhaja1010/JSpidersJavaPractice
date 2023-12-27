package arrayex;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] obj= new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		for(int i=0;i<3;i++) {
			System.out.print("[");
			for(int j=0;j<3;j++) {
				System.out.print(obj[i][j]+ " ");
			}
			System.out.println("]");
			
		}
		System.out.println("%%%%%%%%");
		for(int i=0;i<3;i++) {
			System.out.print("[");
			for(int j=0;j<3;j++) {
				System.out.print(obj[j][i]+ " ");
			}
			System.out.println("]");
		}
	}

}
