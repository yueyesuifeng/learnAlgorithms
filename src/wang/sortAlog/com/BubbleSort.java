/*
 * 冒泡排序：相邻的两个比较大小，时间复杂度是o(n^2),空间复杂度是O(1)
 * 双重循环时间复杂度
 */
package wang.sortAlog.com;

public class BubbleSort {
	public static int[] bubbleSort(int[] A,int n){
		int temp=0;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				if(A[j]>A[j+1]){
					temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			}
		}
		return A;
	}
	public static void main(String[] args) {
		int [] B={1,2,3,5,2,3,10,9,2,6,12,67,34};
		int len=B.length;
		B=bubbleSort(B,len);
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+" ");
		}
	}

}