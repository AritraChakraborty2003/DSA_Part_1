package Array;

public class maxElement {

    public static void main(String args[]){
        int arr[]={7,5,6,1,3,13};
        System.out.println("The maximum value in array is "+getMax(arr,arr.length));


    }
    static int getMax(int arr[],int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }

        }
        return arr[max];
    }

}
