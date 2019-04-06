package com.company.gui;

import com.company.data.Database;
import com.company.model.Book;

import java.util.Scanner;

public class menu {

        /*
    1. Dodaj ksiazke
    2. Wyswietl ksiazki
    3. sortuj po nazwie
    4. po cenie
    5. po stronach
         */

        public static void helloMenu(){
            do{
                System.out.println("1. Dodaj książkę");
                System.out.println("2. Wyświetl książki");
                System.out.println("3. Sortuj po nazwie");
                System.out.println("4. Sortuj po cenie");
                System.out.println("5. Sortuj po ilości stron");
                System.out.println("6. Koniec");

                Scanner scanner = new Scanner(System.in);
                int choose = Integer.parseInt(scanner.nextLine());

                switch (choose){
                    case 1:
                        menu.loadBook();

                }

            }
            while(true);
        }

        //TODO exception for loadBook method

    public static void loadBook(){
        System.out.println("Podaj tytuł:");

        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        System.out.println("Podaj liczbę stron:");
        int pages = Integer.parseInt(scanner.nextLine());

        System.out.println("Podaj cenę:");
        double price = Double.parseDouble(scanner.nextLine());

        Database.getDatabase().addBook(new Book(title,pages,price));


    }




}
