package ArrayAlgorithms;

public class findDuplicates {
    public static void main(String args[]) {
        int a[] = {0,2,6,7, 3, 1, 4, 5, 7};
        System.out.println(findDuplicate(a,a.length));
    }
    static int findDuplicate(int a[],int n){
        for(int i=0;i<n;i++){
            a[a[i]%n]+=n;
        }
        for(int j=0;j<n;j++){
            if(a[j]>=2*n)
                return j;
        }
        return -1;
    }
}
