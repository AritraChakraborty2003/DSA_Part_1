
//Time Complexity:- O(N)
//Space Complexity:- O(1)
package Array.Equilibrium_Index;

import java.util.Scanner;

public class sumFixTechnique {
    public static void main(String args[]){
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
    static int equilibriumIndex(int a[],int n){
        int sum=0;
        int leftSum=0;
        for(int i:a)
            sum+=i;
        for(int i=0;i<n;i++){
            sum=sum-a[i];
            if(sum==leftSum)
                return i;
            leftSum+=a[i];
        }
        return -1;
    }
}
