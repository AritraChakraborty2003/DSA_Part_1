package ArrayAlgorithms;

public class MooreVotingAlgorithm {
    public static void main(String args[]){
        int a[]={2,3,9,2,2};
        int res=maxOccurElement(a,a.length);
        System.out.println(res);
    }
    static int maxOccurElement(int a[],int n){
        int ele=0,cnt=0;
        for(int i=0;i<n;i++){
            if(cnt==0)
            {
                cnt=1;
                ele=a[i];
            }

            if(ele==a[i])
                cnt++;
            else
                cnt--;

        }

        int resCounter=0;
        for(int i=0;i<n;i++) {
            if (a[i] == ele)
                resCounter++;
        }

        if(resCounter>(n/2)) return ele;
        return -1;
    }
}
