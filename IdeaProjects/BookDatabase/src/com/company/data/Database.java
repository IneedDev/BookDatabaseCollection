package com.company.data;

import com.company.model.Book;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Database {

    private List<Book> database = new LinkedList<>();
    private static Database databaseInstance = null;

    // TODO additional exceptions


    public void addBook(Book book){
        this.database.add(book);
    }

    private void printBook(){
        System.out.println(this.database);
    }

    private void sortBooks(Comparator c){
        this.database.sort(c);
    }

    // method will return object Database it will be List
    public static Database getDatabase(){
        if(Database.databaseInstance==null){
            Database.databaseInstance = new Database();
        }
        return Database.databaseInstance;
    }

    public void sortBooksByPages (){
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                //test of object o is type instance of object type Book

                if(!(o1 instanceof Book)){
                    return -1;
                }
                if(!(o2 instanceof Book)){
                    return -1;
                }
                return ((Book) o1).getPages()-((Book) o2).getPages();
            }
        };
        this.database.sort(c);
    }


}
