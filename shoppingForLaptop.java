import java.util.ArrayList;
import java.util.Scanner;

public class shoppingForLaptop {

        public static void shopInterface() {
            ArrayList<laptops> lapList = new ArrayList<>();
            lapList.add(laptopsList.l1);
            lapList.add(laptopsList.l2);
            lapList.add(laptopsList.l3);
            lapList.add(laptopsList.l4);
            lapList.add(laptopsList.l5);
            lapList.add(laptopsList.l6);
            lapList.add(laptopsList.l7);
            lapList.add(laptopsList.l8);


            boolean flag = true;
            Scanner scan = new Scanner(System.in);
            while (flag) {
                System.out.println();
                System.out.println("Please choose one of the following options:");
                System.out.println();
                System.out.println("1. Show all laptops");
                System.out.println("2. Search a laptop with criteria");
                System.out.println("3. Finish the work");
                System.out.println();
                int userClick = scan.nextInt();
                if (userClick == 1) {

                    laptopsList.l1.getAllInfo();
                    System.out.println();
                    laptopsList.l2.getAllInfo();
                    System.out.println();
                    laptopsList.l3.getAllInfo();
                    System.out.println();
                    laptopsList.l4.getAllInfo();
                    System.out.println();
                    laptopsList.l5.getAllInfo();
                    System.out.println();
                    laptopsList.l6.getAllInfo();
                    System.out.println();
                    laptopsList.l7.getAllInfo();
                    System.out.println();
                    laptopsList.l8.getAllInfo();

                } else if (userClick == 2) {
                    System.out.println("Choose a criteria for search:");

                    System.out.println("1. RAM");
                    System.out.println("2. SSD");
                    System.out.println("3. Price");
                    userClick = scan.nextInt();

                    if (userClick == 1) {
                        System.out.println("Enter min RAM: ");
                        int searchValue = scan.nextInt();
                        laptops.searchByRAM(lapList, searchValue);
                    } else if (userClick == 2) {
                        System.out.println("Enter min SSD: ");
                        int searchValue = scan.nextInt();
                        laptops.searchBySSD(lapList, userClick);
                    } else if (userClick == 3) {
                        System.out.println("Enter the max price: ");
                        int searchValue = scan.nextInt();
                        laptops.searchByPrice(lapList, searchValue);
                    } else {
                        System.out.println("Incorrect input");
                        shopInterface();
                    }
                } else if (userClick == 3) {
                    flag = false;
                } 
                else {
                    System.out.println("Incorrect input");
                    shopInterface();
                }
            }
            scan.close();
        }
    }