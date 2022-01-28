
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = new int[20][20];
		int rowSum = 0;
		int rowOfSum = 0;
		int colSum = 0;
		int colOfSum = 0;
		
		
		
		
		for (int row = 0; row < matrix.length; row++) {
		    for (int col = 0; col < matrix[row].length; col++) {
		        matrix[row][col] = (int) ((Math.random() * 100)+ 1) ;
		    }
		}
		
		for (int row = 0; row < matrix.length; row++) {
		    for (int col = 0; col < matrix[row].length; col++)
		        System.out.print(matrix[row][col] + "  ");

		    System.out.println();
		}
		
		for(int i = 0; i < matrix.length; i++) {
			int sum = 0;
			int [] temp = matrix[i];
			
			for(int j = 0; j< matrix.length; j++) {
				sum += temp[j];
			}
			if(sum > rowSum) {
				rowSum = sum; 
				rowOfSum = i;
			}
		
		}
		
		
		
		for(int i = 0; i <  matrix.length; i++) {
			int sumTwo = 0;
			for(int j = 0; j<  matrix.length; j++){
				sumTwo += matrix[j][i];
			}
			
			if(sumTwo > colSum){
				colSum = sumTwo;
				colOfSum = i;
			}
			
		}
			
		
		System.out.println("Row of sum is " + rowSum + " at row " + rowOfSum);
		System.out.println("Col of sum is " + colSum + " at row " + colOfSum);
		
		
		
		
		
	}
}
