//Time Complexity:- O(n^2)
//Space Comp
package ArrayAlgorithms;

public class SelectionSort {
    public static void main(String[] args){
        int a[]={13,9,3,7,1,5};
        selectionSort(a,a.length);
        printArray(a,a.length);
    }
    static void printArray(int a[],int n){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }
    static void selectionSort(int a[],int n){
        int min=0;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min])
                    min=j;
            }

            if(min!=i)
                swap(a,min,i);
        }
    }

    private static void swap(int[] a, int min, int i) {
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
        }

}
