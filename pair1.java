public class pair1 {
    public static void findPairs(int arr[], int target) {
        System.out.println("Pairs with sum = " + target + " are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 7, 1, 5};
        int target = 6;
        findPairs(arr, target);
    }
}

