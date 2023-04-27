// Подумать над структурой класса Ноутбук для магазина техники
//  — выделить поля и методы. Реализовать в Java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя 
// критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:

// 1 - ОЗУ
// 2 - Объём ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.ArrayList;


public class laptops {

    int itemID;
    private String brand;
    private String model;
    private String os;
    private int ssd;
    private int ram;
    private int cost;
    private String colour;

    public laptops(int itemID, String brand, String model, String os, int ssd, int ram, int cost, String colour) {
        this.itemID = itemID;
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.ssd = ssd;
        this.ram = ram;
        this.cost = cost;
        this.colour = colour;
    }

    void getAllInfo()
    {
        System.out.println("Brand - " + brand);
        System.out.println("Model - " + model);
        System.out.println("Operation system - " + os);
        System.out.println("SSD - " + ssd);
        System.out.println("RAM - " + ram);
        System.out.println("Price - " + cost);
        System.out.println("Colour - " + colour);
    }


    public static void searchByRAM(ArrayList<laptops> lapList, int param) {
        for (laptops entry : lapList) {
            if (entry.ram >= param) {
                entry.getAllInfo();
            }
        }
    }

    public static void searchBySSD(ArrayList<laptops> lapList, int param) {
        for (laptops entry : lapList) {
            if (entry.ssd >= param) {
                entry.getAllInfo();
            }
        }
    }

    public static void searchByPrice(ArrayList<laptops> lapList, int param) {
        for (laptops entry : lapList) {
            if (entry.cost <= param) {
                entry.getAllInfo();
            }
        }
    }
}
