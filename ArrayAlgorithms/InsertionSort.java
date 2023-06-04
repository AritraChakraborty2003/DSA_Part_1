package ArrayAlgorithms;

public class InsertionSort {
    public static void main(String args[]){
        int a[]={15,9,7,8,3,1};
        insertionSort(a,a.length);
    }
    static void insertionSort(int a[],int n){
        int temp=0;
        int j=0;
        for(int i=1 ;i<n;i++){
            temp=a[i];
            j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }

        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
