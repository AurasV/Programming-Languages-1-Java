/**
 * 1211EC / Lab nr 3
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab3Ex5 {

    public static void main(String[] args) {
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
        int b[][]={{1,3,4},{2,4,3},{1,2,4}}; 
        
        int c[][]=new int[3][3];
        
        int i, j;

        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        int d[][]=new int[3][3];
        
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                d[i][j] = a[i][j] * b[i][j];
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
}