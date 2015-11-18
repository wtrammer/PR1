
public class Matrix {

	public static void main(String[] args) 
	{
			double[][] idMat4 = generateIdentityMatrix(4);
			
			printMatrix(idMat4);
			
			double[][] idMat7 = generateIdentityMatrix(7);
			
			printMatrix(idMat7);
			
			double[][] matrixY = {{1,2},{3,4},{5,6}};
			printMatrix(matrixY);
			
		
	}
	
	public static void printMatrix(double[][] matrix) {
		
		for (int i=0;i<matrix.length;i++) {
			for (int n=0;n<matrix[i].length;n++) {
				System.out.print(matrix[i][n]+"\t");
			}
			System.out.println();
		}
		
		
	}
	
	public static double [][] generateIdentityMatrix(int size)
	{
		
		double [][] idMat = new double [size][size];
			
		for (int z=0;z<size;z++) {			
			idMat[z][z] = 1.0;
		
	}
		
		return idMat;
			
	}

}
