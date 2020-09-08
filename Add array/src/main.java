class main {
        static int[] addValue(int[] arr, int input, int i) {
            int k;
            int nArray[] = new int [ i + 1 ];
            for (k = 0; k < i; k++)
                nArray[k] = arr[k];
            nArray[i] = input;
            return nArray;
        }


    public static void main(String[] args) {
            int i = 4;
            int arr[] = { 5, 10 ,15, 20};

        System.out.println("Before Addition: ");
        for (int k = 0; k < arr.length; k++)
            System.out.print(arr[k] + "\t");

        int input = 25;
        arr = addValue(arr, input, i);

        System.out.println("\n" + "After Addition: ");
        for (int k = 0; k < arr.length; k++)
            System.out.print(arr[k] + "\t");
    }
}






