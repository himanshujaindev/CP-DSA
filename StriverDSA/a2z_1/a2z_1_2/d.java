package StriverDSA.a2z_1.a2z_1_2;
/*

1
22
333
4444
55555

*/

public class d {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            int j = 0;
            while (j <= i) {
                System.out.print(i + 1);
                j++;
            }

            while (j < 5) {
                System.out.print(" ");
                j++;
            }
            System.out.println();
        }

    }
}
