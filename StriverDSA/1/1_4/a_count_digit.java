public class a_count_digit {
    public static void main(String[] args) {
        int n = -1;
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Number of digits = " + count);
    }
}
