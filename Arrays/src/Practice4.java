public class Practice4 {
    public static void main(String[]args){

        //minimum value

        int arr[] = {10,20,40,20,60,70,80,30,90,40};

        int n = arr.length;
        int minValue = arr[0];

        for(int i = 0; i<=n-1; i++){
            if(arr[i]< minValue){
                minValue = arr[i];
            }
        }
        System.out.println(minValue);
    }
}
