import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

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
        //kolekcja
        //nie musza miec odrazu zdefiniowanego rozmiaru
        //listy, zbiory, set

        //wstawianie liczb z klawiatury do kolekcji

        List<Integer> listaLiczbZapisanych = new ArrayList<>();
        System.out.println("podaj 6 liczb");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbZapisanych.add(liczba);
        }
        System.out.println("wstawiono liczby");
        for (Integer Liczbawpisana:listaLiczbZapisanych) {
            System.out.println(Liczbawpisana);
        }
        for (int i = 0; i < listaLiczbZapisanych.size(); i++) {
            System.out.println(listaLiczbZapisanych.get(i));
        }
        //losowanie bez powtorzen
        ArrayList<Integer> tablicaliczblosowychbezpowtorzen = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int)(Math.random()*100+1);
            while(tablicaliczblosowychbezpowtorzen.contains(liczba)){
                liczba = (int)(Math.random()*100+1);
            }
            tablicaliczblosowychbezpowtorzen.add(liczba);
        }
        System.out.println("Wylosowana bez powtorzen");
        System.out.println(tablicaliczblosowychbezpowtorzen);
    }
}