public class Main {
    public static void main(String[] args) {
        int pole[] = {5, 6, 5, 3, 7, 9, 5};
        int max = pole[0];
        for (int prvek :
                pole) {
            if (prvek > max) {
                max = prvek;
            }
        }
        System.out.println(max);

        /*int pole[] = {5, 6, 5, 3, 7, 9, 5};
        int min = pole[0];
        for (int prvek :
                pole) {
            if (prvek < min) {
                min = prvek;
            }
        }
        System.out.println(min);*/

        /*int[] pole = {2,6,5,9,3,1,7};
        int vysledek = 0;
        for (int prvek :
                pole) {
            vysledek += prvek;
        }
        System.out.println(vysledek);*/

        // int[] nazev = new int[velikost];
        /*int[] pole = {1, 2, 3};

        for (int i :
                pole) {
            System.out.println(i);
        }*/

        /*int vysledek = 0;
        for (int i = 100; i <= 1000; i++) {
            vysledek += i;
        }
        System.out.println(vysledek);*/
    }
}
