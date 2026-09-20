public class SearchingExa7 {
   public static void main(String[] args) {
        int [] arr = {20,10,30,10,40,10};
        int target = 10;

        for(int i=arr.length-1; i>=0; i--){
            if(target == arr[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
