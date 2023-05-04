package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o número de linhas da matriz: ");
		int m = scan.nextInt();
		System.out.print("Digite o númeor de colunas da matriz: ");
		int n = scan.nextInt();
		
		int[][] mat = new int[m][n];
		for(int loopl = 0; loopl < mat.length; loopl++) {
			for(int loopc = 0; loopc < mat[loopl].length; loopc++) {
				mat[loopl][loopc] = scan.nextInt();
			}
		}
		
		System.out.print("Digite um número da matriz: ");
		int x = scan.nextInt();
		for(int loopl = 0; loopl < mat.length; loopl++) {
			for(int loopc = 0; loopc < mat[loopl].length; loopc++) {
				if(mat[loopl][loopc] == x) {
					System.out.println("Position " + loopl + "," + loopc + ":");
					if(loopl > 0) {
						int left = loopc - 1;
						System.out.println("Left: " + mat[loopl][left]);
					}
					if(loopc > 0) {
						int up = loopl - 1;
						System.out.println("Up: " + mat[up][loopc]);
					}
					if(loopl < n) {
						int right = loopc - 1;
						System.out.println("Right: " + mat[loopl][right]);
					}
					if(loopc < n) {
						int down = loopl - 1;
						System.out.println("Down: " + mat[down][(loopc)]);
					}
					
				}
			}
		}
		
		scan.close();
	}

}
