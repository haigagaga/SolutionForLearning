


public class Quick {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 7, 9, 11};
        quickSort(arr, 0, arr.length - 1);
        for(int a : arr){
            System.out.println(a + " ");
        }
    }


    public static int getMid(int[] arr, int left, int right) {
        int temp = arr[left];
        int l = left;
        int r = right;
        while (l < r) {
            while (temp < arr[r] && l < r) {
                r--;
            }
            if (l < r) {
                arr[l] = arr[r];
                l++;
            }
            while (temp > arr[l] && l < r) {
                l++;
            }
            if (l < r) {
                arr[r] = arr[l];
                r--;
            }
        }
        arr[l] = temp;
        return l;
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (arr == null || arr.length == 0 || left >= right) return;
        int mid = getMid(arr, left, right);
        quickSort(arr, left, mid);
        quickSort(arr, mid + 1, right);
    }


}
