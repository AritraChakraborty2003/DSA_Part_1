//Time Complexity O(N)
//Space Complexity O(1)
package Array.RotationLeft;

public class JugglingAlgorithm {
    public static void main(String args[]){
        int a[]={3,5,7,6,4,2,1};
        JugglingAlgo(a,a.length,3);
    }
    static void JugglingAlgo(int a[], int n, int d) {
        d=d%n;
        int temp,j,k;
        int gcdVal=gcd(d,n);
        for(int i=0;i<gcdVal;i++){
            j=i;
            temp=a[i];
            while(true){
                k=j+d;
                if(k>=n)
                    k=k-n;
                if(k==i)
                    break;
                a[j]=a[k];
                j=k;
            }
            a[j]=temp;
        }
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }

    static int gcd(int a,int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}

