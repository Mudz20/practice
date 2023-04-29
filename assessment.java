package practice;

    import java.util.*;

public class assessment {

    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);

    int x;

    System.out.print("Enter a number (1-10): ");
    x = scan.nextInt();

    int y = 1;

    while (y<=x) {
        System.out.println();
        y++;

        int z = 1;

        while (z<y) {
            System.out.print(z);
            z++;
        }
    }

    }
}