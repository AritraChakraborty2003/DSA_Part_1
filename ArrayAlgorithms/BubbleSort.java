//Time Complexity:- O(N^2)
//Space Complexity:- O(1)
package ArrayAlgorithms;

public class BubbleSort {
    public static void main(String args[]){
        int a[]={15,9,10,7,5,3,1,21};
        BubbleSort(a,a.length);
    }

    static void BubbleSort(int a[],int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
