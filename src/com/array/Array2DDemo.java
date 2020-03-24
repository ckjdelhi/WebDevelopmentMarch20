package com.array;

public class Array2DDemo {

	public static void main(String[] args) {
		String[] arr[]=new String[3][2]; // row x column
		arr[0][0]="A";
		arr[0][1]="B";
		arr[1][0]="C";
		arr[1][1]="D";
		arr[2][0]="E";
		arr[2][1]="F";
		
		String [][]arr2d= {
				{"A", "B"},
				{"C", "D"},
				{"E", "F","G"}
		};
		System.out.println("Rows: "+arr.length);
		System.out.println("Columns: "+arr[0].length);
		
		for(int i=0;i<arr2d.length;i++) { //rows
			for(int j=0;j<arr2d[i].length;j++) {//columns
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
