package the10th;

public class BinarySearchNorecursion {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 12, 17, 21, 25, 41, 61, 71};
        int reindex = binarySerachNorec(arr, 25);
        System.out.println("reinx  " + reindex);
    }

    public static int binarySerachNorec(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int leftval = arr[left];
        int rightval = arr[right];


        while (left <= right) {
            int mid = (left + right) / 2;
            int midval = arr[mid];

            if (leftval == target) {
                return left;
            } else if (rightval == target) {
                return right;
            }else if (midval < target) {
                left = mid;
            }else if (midval > target) {
                right = mid;

            } else if (midval == target) {
                return mid;
            }
        }
        return -1;
    }
}






