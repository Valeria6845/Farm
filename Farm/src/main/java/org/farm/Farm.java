package org.farm;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString

public class Farm {
    private int animalId;
    private List<Animal> animals = new ArrayList();
    public void addAnimal(Animal animal) {
        animalId++;
        animal.setId(animalId);
        animals.add(animal);
    }
    public String countAnimals() {
        int numOfCows = 0;
        int numOfChickens = 0;
        int total = 0;
        for (Animal a: animals) {
            total++;
            Class<?> cls = a.getClass();
            if (cls.getName().equals("org.homework24.Cow")) {
                numOfCows++;
            }else {
                numOfChickens++;
            }
        }
        return "Amount of animals: "+total+"\n Cows: "+numOfCows+"\n Chickens: "+numOfChickens;
    }
    public int[] totalProductCollect() {
        int milk = 0;
        int eggs = 0;
        for (Animal a: animals) {
            Class<?> cls = a.getClass();
            if (cls.getName().equals("org.homework24.Cow")) {
               milk += a.productCollection();
            }else {
                eggs += a.productCollection();
            }
        }
        return new int[]{milk, eggs};
    }
}
