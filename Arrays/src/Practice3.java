public class Practice3 {
        public static void main(String[]args){

            //maximum value

            int arr[] = {10,20,40,20,60,70,80,30,90,40};

            int n = arr.length;
            int maxValue = arr[0];

            for(int i = 0; i<=n-1; i++){
                if(arr[i]> maxValue){
                    maxValue = arr[i];
                }
        }
            System.out.println(maxValue);
        }
}
