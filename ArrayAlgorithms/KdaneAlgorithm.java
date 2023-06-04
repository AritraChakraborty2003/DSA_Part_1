package ArrayAlgorithms;

public class KdaneAlgorithm {
    public static void main(String args[]){
        int a[]={ -2, -3, 4, -1, -2, 1, 5, -3 };
        int res=maxSubArraySum(a,a.length);
        System.out.println("The maximum SubArray sum is:- "+res);
    }
    static int maxSubArraySum(int a[],int n){
        int max_till_here=0;
        int max_sub_sum=0;
        for(int i=0;i<n;i++){
            max_till_here+=a[i];
            if(max_till_here<0)
                max_till_here=0;
            if(max_till_here>max_sub_sum)
                max_sub_sum=max_till_here;
        }
        return max_sub_sum;


    }
}
