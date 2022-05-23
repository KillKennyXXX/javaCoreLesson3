import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        massiv1();
        massiv2();
        massiv3();
        massiv4();
        System.out.println();
        massiv5(3, 1);
        massiv6();
    }

    private static void massiv1() {
        int[] massiv = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
       for (int i=0; i < massiv.length; i++){
           if(massiv[i] == 0) massiv[i] = 1;
           else massiv[i] = 0;
        }
     System.out.println(Arrays.toString(massiv));
    }
    private static void massiv2() {
        int[] massiv = new int[100];
        for (int i=0; i < massiv.length; i++) massiv[i] = i+1;

        System.out.println(Arrays.toString(massiv));
    }


    private static void massiv3() {
        int[] massiv = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i=0; i < massiv.length; i++)  if(massiv[i] < 6) massiv[i] = massiv[i]*2;

        System.out.println(Arrays.toString(massiv));
    }

    private static void massiv4() {
        int n = 5;
        int[][] massiv = new int [n][n];
        for (int i=0; i < massiv.length; i++)
            for (int j=0; j < massiv[i].length; j++)
                if ((i == j) || (i + j + 1 == n )) System.out.printf("[%d,%d] ", i, j);
    }


    private static int[] massiv5(int len, int initialValue) {
        int[] massiv = new int[len];
        for (int i=0; i < massiv.length; i++)  massiv[i]= initialValue;
        System.out.println(Arrays.toString(massiv));
        return massiv;

    }
    private static void massiv6() {
        int[] massiv = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int minI = massiv[0];
        int maxI = massiv[0];
        for (int i=1; i < massiv.length; i++) {
            if(massiv[i] < minI) minI = massiv[i];
            if(massiv[i] > maxI) maxI = massiv[i];
        }

        System.out.printf("[%d,%d] ", minI, maxI);
    }
}
