package BitManipulation;

public class Kth_Bit_Set {
    public static void main(String args[]){
        int n=5; int k=3;
        System.out.println(kthBitSet(n,k));
    }
    static boolean kthBitSet(int n,int k){
        if((n&(1<<(k-1)))>0) //can be k also
            return true;
        return false;
    }

}
