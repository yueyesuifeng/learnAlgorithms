/**
 * 作者：匠心
 * 选择排序：一种简单地排序算法，就像我们排手中的扑克牌一样
 * 时间复杂度:O(n^2)
 * 空间复杂度：O(1)
 * 步骤：
 * 1. 在第一个元素之后为排序的部分设置一个标记
 * 2. 重复以下操作直到未排序的部分为空
 * 	(1). 选择第一个未排序的元素
 * 	(2). 根据比较向右移动已排序的元素，以便空出一个正确的位置，将第一个未排序的元素插入其中
 * 	(3). 将标记更新成右边一个元素（相对于（1）中选择的第一个未排序的元素）
 * 使用：当数据量小的时候，可以使用插入排序，或者当数组几乎是已经排好序的，只有一些元素的位置不正确时，可以使用插入排序
 */
package wang.sortAlog.com;

class InsertionSort {
	void sort(int arr[]){
		int n=arr.length;
		for(int i=1;i<n;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key){//比当前这个要插入的元素(key)大的话，就往后移动一位
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	static void printArray(int arr[]){
		int n=arr.length;
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int arr[]={12,11,13,5,6};
		InsertionSort ob=new InsertionSort();
		ob.sort(arr);
		printArray(arr);
	}
}
