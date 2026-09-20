class SearchingExa3 {
    public static void main(String[]args){
        int [] arr = {10,20,10,30,10,40};
        int target = 10;


        boolean found = false;

        //Find the index occurance of element

        for(int i=0; i<arr.length; i++) {
            if (target == arr[i]) {
                found = true;
                System.out.println(i);
            }
        }
    }
}
