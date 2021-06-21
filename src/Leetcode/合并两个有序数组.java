package Leetcode;

public class 合并两个有序数组 {

    public static void main(String[] args) {

    }

//输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//输出：[1,2,2,3,5,6]

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result;
//        int l1 = nums1.length - 1;
//        int l2 = nums2.length - 1;

        int p = 0;
        int q = 0;
        int tempMax = 0;
        while(p < nums1.length-1){
            while (q < nums2.length-1) {
                if (nums1[p] < nums2[q]) {
                    q++;
                } else {
                    tempMax = nums2[q];
                    p++;
                    break;
                }
            }
            if (tempMax <= nums1[p]){
                insert(tempMax);
            }
        }



    }

    public static void insert(int in) {

    }

}
