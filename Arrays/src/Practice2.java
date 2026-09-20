public class Practice2 {
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5,6};
        int multiply = 1;
        int n = arr.length;

        for(int i = 0; i<=n-1; i++){
            int value = arr[i];
            multiply = multiply * value;
        }
        System.out.println(multiply);

    }
}
