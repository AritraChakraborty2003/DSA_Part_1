//Brian Kerningham Algorithm
package BitManipulation;

public class CountSetBits {
    public static void main(String args[]){
        int n=7;
        int setBits=bka(n);
        System.out.println(setBits);

    }
    static int bka(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }

}
