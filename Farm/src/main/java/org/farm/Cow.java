package org.farm;

import lombok.Setter;
import lombok.ToString;

import java.util.Random;
@ToString

public class Cow extends Animal{
    @Setter
    private int id;
    @Override
    public int productCollection() {
        Random rand = new Random();
        return rand.nextInt(12-8)+8;
    }
}
