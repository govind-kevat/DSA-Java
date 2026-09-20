class SearchingExa4 {
    public static void main(String[]args){
        int [] arr = {10,20,10,30,10,40};
        int target = 10;

        //Find the occurrence of element

        for(int i=0; i<arr.length; i++) {
            if(target == arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
}
