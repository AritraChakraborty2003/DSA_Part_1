//Time Complexity O(N*d)
//Space Complexity O(1)
package Array.RotationLeft;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class OneByOneShift {
    public static void main(String args[]){
        int a[]={3,5,7,9};
        rotateLeft(a,a.length,3);
    }

    static void rotateLeft(int a[],int n,int d){

        int p=1; int temp;
        while(p<=d){
            temp=a[0];
            for(int i=0;i<n-1;i++){
                a[i]=a[i+1];
            }
            a[n-1]=temp;

            p++;
        }

        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
