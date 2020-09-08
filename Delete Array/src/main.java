class main {
    static int bisectionSearch(int arr[], int low, int high, int length) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }
        if (length == arr[middle]) {
            return middle;
        }
        else if (length > arr[middle]) {
            return bisectionSearch(arr, middle + 1, high, length);
        }
        else {
            return bisectionSearch(arr, low, middle - 1, length);
        }
    }
    static int delete(int []arr, int number, int input) {
        int deleteArray = bisectionSearch(arr, 0, number - 1, input);
        int k;
        for (k = deleteArray; k < k - 1; k++)
            arr[k] = arr[k + 1];

        return number - 1;
    }

    public static void main(String[] args) {
        int k;
        int arr[] = {5, 10, 20, 35, 55};
        int number = arr.length;
        int input = 20;

        System.out.print("Before Deletion:" + "\n");
        for (k = 0; k < number; k++)
            System.out.print(arr[k] + "\t");

        number = delete(arr, number, input);

        System.out.print("\n" + "After Deletion: " + "\n");
        for (k = 0; k < number; k++)
            System.out.print(arr[k] + "\t");
    }
}

