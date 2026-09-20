public class SearchingExa9 {
    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 10, 40, 10, 5};

        int largest = arr[0];
        int secondlargest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                secondlargest = largest;

                largest = arr[i];
            }
        }
        System.out.println(secondlargest);
    }
}