//Time Complexity:- O(N^2)
//Space Complexity:- O(1)
package Array.Equilibrium_Index;

import java.util.Scanner;

public class BrutForce {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();}
            int res = equilibriumIndex(a, n);
            System.out.println(res);
            t--;
        }
    }
    static  int equilibriumIndex(int a[],int n){

        for(int i=0;i<n;i++){
            int lSum=0;
            for(int j=0;j<i;j++){
                lSum+=a[j];
            }

            int rSum=0;
            for(int j=i+1;j<n;j++){
                rSum+=a[j];
            }
            if(lSum==rSum)
                return i;
        }

       return -1;
    }

}
