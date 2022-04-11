package arrays.questions;

public class PeakElement {

    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int largestLocation = 0;
        for(int i =0;i<=n-2;i++){
            if(arr[i]<arr[i+1]) largestLocation = i+1;
        }

        return largestLocation;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(peakElement(arr,3));
    }
}
