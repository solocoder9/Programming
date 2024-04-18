public class PrintEven {
    static void printEven() {
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    } 
    
    public static void main(String[] args) {
        printEven();
    }
}
