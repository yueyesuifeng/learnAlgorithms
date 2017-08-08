package wang.sortAlog.com;

public class SortTestHelper {
	// SortTestHelper不允许产生实例
//	private void SortTestHelper(){};

	// 生成有n个元素的随机数组，每个元素的随机范围为[rangeL,rangeR]
	public static Integer[] generateRandomArray(int n, int rangeL, int rangeR) {
		assert rangeL <= rangeR;
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Integer(
					(int) (Math.random() * (rangeR - rangeL + 1) + rangeL));// 这里为什么要加1,这里的实际区间是[rangeL,rangeR+1),取整的话就是[rangeL,rangeR]
		}
		return arr;
	}

	// 打印arr数组中的所有内容
	public static void printArray(Object arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		return;
	}

	public static void main(String[] args) {
		Integer[] myArr=generateRandomArray(10,3,5);
		printArray(myArr);
	}
}
