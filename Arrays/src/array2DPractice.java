class array2DPractice{
    public static void main(String []args){
        int[][] arr = new int[3][4];

        int[] [] brr = { {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
        };
        int m = brr.length;
        int n = brr[0].length;

        for(int i = 0; i<=m-1; i++){
            for(int j = 0; j<=n-1; j++){
                System.out.println(brr[m][n] + " ");
            }
            System.out.println();
        }
    }
}
