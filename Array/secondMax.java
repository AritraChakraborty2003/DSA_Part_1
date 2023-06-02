package Array;

public class secondMax {
    public static void main(String args[]){
        int arr[]={5,6,1,3,13,12};
        int arr1[]={20,20,20};
        System.out.println("The second maximum element is "+secondMax(arr,arr.length));
        System.out.println("The second maximum element is "+secondMax(arr1,arr1.length));
    }
    static int secondMax(int arr[],int n){
        int max=0;
        int res=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[max]){
                res=max;
                max=i;
            }
            else if(arr[i]!=arr[max]){
                if(res==-1 || arr[res]<arr[i]) {
                    res=i;
                }

            }
        }

        if(res!=-1) return arr[res];
        else return -1;
    }
}

