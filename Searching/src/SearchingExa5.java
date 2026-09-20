public class SearchingExa5 {
    public static void main(String[]args){
        int [] arr ={5,10,5,20,5,30};

        int target = 5;
        int count = 0;

        for(int i = 0; i<arr.length; i++){
            if(target == arr[i]){
                count++;
            }
        }
        System.out.println(count);

    }
}
