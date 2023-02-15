import java.util.Arrays;

public class MergTwoArr {
    // this program merges two sorted arrays
    public static void main(String[] args) {
        int[] arr1 = {7,9,18,19,22};
        int[] arr2 = {1,6,9,11};
        System.out.println(Arrays.toString(mergeSorted(arr1, arr2)));

    }
    static int[] mergeSorted(int[] arr1 , int[] arr2) {
        int res[] = new int[arr1.length + arr2.length];
        int i=0, j=0, k=0;
        while(k<res.length) {
            if(i==arr1.length && j==arr2.length)
                break;
            else if(i==arr1.length) {
                while(j<arr2.length) {
                    res[k] = arr2[j];
                    j++;
                    k++;
                }
                break;
            }
            else if(j==arr2.length) {
                while(i<arr1.length) {
                    res[k] = arr1[i];
                    i++;
                    k++;
                }
            } else {
                if(arr1[i] <= arr2[j]) {
                    res[k] = arr1[i];
                    i++;
                    k++;
                } else {
                    res[k] = arr2[j];
                    j++;
                    k++;
                }
            }
        }
        return res;
    }
}