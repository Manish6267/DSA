public class pair {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4,5,6};  // Example array
        int n = arr.length;

        System.out.println("All possible pairs:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ")");
            }
            System.out.println();
        }
        
    }
}