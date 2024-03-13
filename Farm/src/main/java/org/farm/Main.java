package org.farm;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        //Adding 10 cows and 20 chickens to the farm
        for (int i = 0; i < 10; i++) {
            farm.addAnimal(new Cow());
        }
        for (int i = 0; i < 20; i++) {
            farm.addAnimal(new Chicken());
        }

        //Displaying the information about the number of animals
        System.out.println(farm.countAnimals());
        System.out.println("-----------------------");

        //Collection products from all animals per a week
        int[] totalForWeek = new int[2];
        for (int i = 0; i < 7; i++) {
            int[] collect = farm.totalProductCollect();
            totalForWeek[0] += collect[0];
            totalForWeek[1] += collect[1];
        }
        System.out.println("Product collected in a week: \n Milk: "
                +totalForWeek[0]+"l\n Eggs: "+totalForWeek[1]);
        System.out.println("-----------------------");

        //Adding 1 more cow and 5 more chickens to the farm
        for (int i = 0; i < 5; i++) {
            farm.addAnimal(new Chicken());
        }
        farm.addAnimal(new Cow());

        //Displaying the new information about the number of animals
        System.out.println(farm.countAnimals());
        System.out.println("-----------------------");

        //Collection products from all animals per a week again
        int[] totalForWeek2 = new int[2];
        for (int i = 0; i < 7; i++) {
            int[] collect = farm.totalProductCollect();
            totalForWeek2[0] += collect[0];
            totalForWeek2[1] += collect[1];
        }
        System.out.println("Product collected in a week: \n Milk: "
                +totalForWeek2[0]+"l\n Eggs: "+totalForWeek2[1]);
        System.out.println("-----------------------");
    }
}