public class SearchingExa1 {
    public static void main(String[]args){
        int [] arr = {10,20,30,40,50};
        int target = 40;

        boolean found = false;

        //Find the index

        for(int i=0; i<arr.length; i++) {
            if (target == arr[i]) {
                found = true;
                System.out.println(i);
            }
        }
    }
}
