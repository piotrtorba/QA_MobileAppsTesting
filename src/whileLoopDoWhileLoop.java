public class whileLoopDoWhileLoop {
    public static void main(String[] args) {
        int num = 0;
        double numReversed = 10.0;
        while (num<9) {
            num++;
            System.out.println(num);
        }
        do {
            System.out.println(numReversed);
            numReversed--;
        } while (numReversed > 1);
    }
}
