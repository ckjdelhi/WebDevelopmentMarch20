package com.array;

public class Array3DDemo {

	public static void main(String[] args) {
		
		//int [][][]arr3d=new int[3][3][4]; //2x3x1=6(dimensions x rows x columns)
		
		int [][][]arr3d= {
				{
					{2,3,4},
					{2,3,4},
					{2},
					{2,3}
				},
				{
					{2,3,4},
					{2,3,4}
				},
				{
					{2,3,4},
					{2,3,4}
				},
		};
		
		/*for(int i=0;i<arr3d.length;i++) {//dimension
			for(int j=0;j<arr3d[i].length;j++) {//rows
				for(int k=0;k<arr3d[i][j].length;k++) { //columns
					System.out.print(arr3d[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}*/
		
		/*int []arr= {10,20,30,40};
		for(int a:arr) {
			System.out.println(a);
		}*/
		/*int[][]arr2d= {
				{20,30,40},
				{10,20}
		};
		for(int []arr: arr2d) {
			for(int a:arr) {
				System.out.println(a);
			}
		}*/
		
		for(int [][]arr2d: arr3d) {
			for(int []arr1d:arr2d) {
				for(int a: arr1d) {
					System.out.print(a+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
