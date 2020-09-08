class main {
    static int insert (int arr[], int number, int input, int length) {
        if (number >= length)
            return number;

        int k;
        for (k = number - 1; (k >= 0 && arr[k] > input); k--)
            arr[k + 1] = arr[k];

        arr[k + 1] = input;
        return (number + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 20;
        arr[3] = 45;
        arr[4] = 65;
        int length = arr.length;
        int number = 5;
        int input = 36;

        System.out.print("Before Insertion: " + "\n");
        for (int k = 0; k < number; k++)
            System.out.print(arr[k] + "\t");

        number = insert(arr, number, input, length);

        System.out.print("\n" + "After Insertion: " + "\n");
        for (int k = 0; k < number; k++)
            System.out.print(arr[k] + "\t");
    }
}