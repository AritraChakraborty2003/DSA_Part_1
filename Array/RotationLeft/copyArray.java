//Time Complexity :- O(N)
//Space Complexity:- O(N)
package Array.RotationLeft;

public class copyArray {
    public static void main(String args[]){
        int a[]={3,5,7,6,4,2,1};
        leftRotate(a,a.length,3);
    }
    static void leftRotate(int a[],int n,int d){
        int temp[]=new int[n];
        int counter=0;

        for(int i=d;i<n;i++){
            temp[counter++]=a[i];
        }
        for(int j=0;j<d;j++){
            temp[counter++]=a[j];
        }

        for(int k=0;k<n;k++){
            a[k]=temp[k];
        }

        for(int m: a){
            System.out.print(m+" ");
        }
        System.out.println();

    }
}
