/**
 * 1211EC / Homework nr 5
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.*;


class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            String enemy1 = in.next(); // name of enemy 1
            int dist1 = in.nextInt(); // distance to enemy 1
            String enemy2 = in.next(); // name of enemy 2
            int dist2 = in.nextInt(); // distance to enemy 2
            if (dist1 < dist2) {
                System.out.println(enemy1);
            } else {
                System.out.println(enemy2);
            }
            // Write an action using System.out.println()

            // Enter the code here

        }
    }
}
