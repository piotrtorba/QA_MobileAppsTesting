public class OdwrocenieTablicy {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int temp;

            // Reverse the array
            for (int i = 0; i < arr.length / 2; i++) {
                temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }

            // Print the reversed array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
