public class SearchingExa {
    public static void main(String[]args){
//        int [] arr = {10,20,30,20,10,};
//
//        int target = 40;
//
//        for(int i=0; i<arr.length; i++){
//            if(target == arr[i]){
//                System.out.println(arr[i]);
//            }
//        }
        int [] arr ={5,12,8,20,15};
        int target = 10;

        boolean found = false;

        for(int i=0; i<arr.length; i++) {
            if (target == arr[i]) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Found");
        } else{
            System.out.println("Not Found");
        }
    }
}
