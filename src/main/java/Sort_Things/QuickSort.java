package Sort_Things;

/**
 * 快速排序的 java 代码实现
 */
public class QuickSort {

    public void quickSort(int[] arr) {
        //使用 quickSort 给 arr 重新排序
        process(arr, 0, arr.length - 1);
    }

    private void process(int[] arr, int startIndex, int endIndex) {
        //首先输入递归的结束条件
        if (startIndex >= endIndex) {
            return;
        }
        int pivotIndex = partition(arr, startIndex, endIndex);
        process(arr, startIndex, pivotIndex - 1);
        process(arr, pivotIndex + 1, endIndex);
    }

    private int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex]; //基准元素

        int left = startIndex;
        int right = endIndex;

        while (left != right) {
            while (left < right && pivot < arr[right]) {
                right--;
            }
            while (left < right && pivot >= arr[left]) {
                left++;
            }
            if (left < right) {
                int p = arr[left];
                arr[right] = arr[left];
                arr[left] = p;
            }
        }

        //left 和 right 的重合点
        arr[startIndex] = arr[left];
        arr[left] = pivot;//交换基准元素和当前值

        return left;
    }
}
