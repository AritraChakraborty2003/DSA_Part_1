//Sort 0s 1s and 2s
//Time Complexity :- O(N)
//Space Complexity :- O(1)
package ArrayAlgorithms;

public class DutchNationalFlag {
    public static void main(String args[]){
        int arr[]={1,1,0,2,0,0,2,1,0,0,2,2,2};
        Dnf(arr,arr.length);
        for(int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void Dnf(int a[],int n){
        int mid=0,low=0;
        int high=n-1;

            while(mid<=high){
                if(a[mid]==0)
                {
                    swap(a,mid,low);
                    mid++; low++;
                }
                else if(a[mid]==1)
                {
                    mid++;
                }
                else if(a[mid]==2){
                    swap(a,mid,high);
                    high--;
                }
            }
        }


    static void swap(int[] a, int m, int h) {
        int temp=a[m];
        a[m]=a[h];
        a[h]=temp;
    }
}
