package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Asset> assets = new ArrayList<>();

        House mainHouse = new House("Main House", "2020-10-30",
                3000000, "123 Main st", 1, 2500, 1000);
        assets.add(mainHouse);

        House summerHouse = new House("Summer House", "2023-03-15",
                250000, "456 Main st", 4, 3500, 3000);
        assets.add(mainHouse);



        Vehicle myCar = new Vehicle("My Car", "2021-10-10",
                70000, "Toyota RAV4", 2020, 50000);
        assets.add(myCar);

        Vehicle nurbuCar = new Vehicle("Nurbu's Car", "2015-10-10",
                23000, "Honda civic", 2013, 115000);
        assets.add(nurbuCar);


        for (Asset asset : assets) {
            System.out.println("\nDescription: " + asset.getDescription());
            System.out.println("\nDate Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: " + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());
            System.out.println("-".repeat(50));
        }




    }

}
