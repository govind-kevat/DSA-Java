public class SearchingExa8 {
    public static void main(String[] args) {
        int [] arr = {20,10,30,10,40,10,5};
//        int max=0;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

        int min=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
