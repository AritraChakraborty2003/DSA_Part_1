package BitManipulation;

public class oneOddOccurring {
    public static void main(String[] args){
        int a[]={3,3,5,1,1,7,7};
        int ans=one_Odd_Occurring(a);
        System.out.println(ans);
    }
   static int one_Odd_Occurring(int a[]){
    int val=0;
    for(int i:a){
        val=val^i;
    }
    return val;
   }


}
