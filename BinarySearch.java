package the10th;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 7, 21, 56, 79};
        int reindex = binarySearch(arr, 0, arr.length - 1, 1);
        System.out.println("reindx   " + reindex);

    }

    public static int binarySearch(int[] arr, int left, int right, int target) {
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        int finalval = target;
        int leftval=arr[left];
        int rightval=arr[right];
        if (left > right) {
            return -1;
        }
        if(leftval==finalval){
            return left;
        }else if (rightval==finalval){
            return right;
        }
        if (midVal > finalval) {
            return binarySearch(arr, left, mid , target);
        } else if (midVal < finalval) {
            return binarySearch(arr, mid , right, target);
        } else {
            return mid;
        }

    }


}
