public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //tablica
        //musi miec z góry określony rozmiar
        //nie mozna go pozniej zmienic
        //elementem tablicy moga byc typy proste i zlozone

        //6 elementowa tablica z wartosciami losowymi z zakresu od 1 do 100
        int tablicaLosowych[] = new int[6];
        for (int i = 0; i < tablicaLosowych.length; i++) {
            tablicaLosowych[i] = (int) (Math.random()*100+1);
        }
        //wypisywanie elementow tablicy
        for (int element:tablicaLosowych)
        {
            System.out.print(element+", ");
        }

    }
}