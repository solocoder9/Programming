public class TestArray {
    
    static int[] arrReturn() {
        int[] arr = {1, 4 , 7, 5, 1};

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = arrReturn();

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
