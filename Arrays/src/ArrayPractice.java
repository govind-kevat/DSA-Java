public class ArrayPractice {
    public static void main(String[]args){

        int arr[] = {10,20,30,40,50};
        int sum = 0;
        int n = arr.length;

        for(int i = 0; i<=n-1; i++){
            int value = arr[i];
            sum = sum + value;
            System.out.println(sum);
        }
    }
}
