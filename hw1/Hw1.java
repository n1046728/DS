
public class Hw1 {
	public static void main(String[] args) {
		//Homework 矩陣轉置、矩陣相乘
		int [][]m1={{1,2,3},{4,5,6}};
		int [][]m2={{1,2},{3,4},{5,6}};
		System.out.println("==========執行結果(a)");
		System.out.println("原始矩陣m1 :");
		printMatrix(m1);
		System.out.println("原始矩陣m2 :");
		printMatrix(m2);
		System.out.println("m1之轉置矩陣m1t :");
		printMatrix(matrixTranspose(m1));
		System.out.println("m2之轉置矩陣m2t :");
		printMatrix(matrixTranspose(m2));
		System.out.println("m3=m1t*m2t :");
		printMatrix(productMatrix(matrixTranspose(m1),matrixTranspose(m2)));
		
		int [][]k1={{1,2,3},{4,5,6},{7,8,9}};
		int [][]k2={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println("==========執行結果(b)");
		System.out.println("原始矩陣k1 :");
		printMatrix(k1);
		System.out.println("原始矩陣k2 :");
		printMatrix(k2);
		System.out.println("k1之轉置矩陣k1t :");
		printMatrix(matrixTranspose(k1));
		System.out.println("k2之轉置矩陣k2t :");
		printMatrix(matrixTranspose(k2));
		System.out.println("m3=k1t*k2t :");
		printMatrix(productMatrix(matrixTranspose(k1),matrixTranspose(k2)));
		
		
	}	
	
	//矩陣轉置方法
	static int[][] matrixTranspose(int array[][]){
	int m = array.length;
	int n = array[0].length;
	int transposeArray[][]= new int [n][m]; 
	
	for (int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			transposeArray[i][j] = array[j][i];
			}
		}
	return transposeArray;
	}
	
	//矩陣相乘方法
	static int[][] productMatrix(int arrayA[][],int arrayB[][]){
		int m =arrayA.length;		//乘積矩陣為mxn階矩陣，確認乘積陣之m
		int p =arrayA[0].length;	//確認乘積矩陣元素所需相加個數，矩陣A32*B23=矩陣C33，元素c11=a11*b11+a12*b21
		int n =arrayB[0].length;	//確認乘積距陣之n
		int productMatrix[][] = new int[m][n];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<p;k++){
					productMatrix[i][j]+=arrayA[i][k]*arrayB[k][j];
				}
			}
		}
		return productMatrix;
	}
	
	//矩陣列印方法
	static void printMatrix(int array[][]){
		int m = array.length;
		int n = array[0].length;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
