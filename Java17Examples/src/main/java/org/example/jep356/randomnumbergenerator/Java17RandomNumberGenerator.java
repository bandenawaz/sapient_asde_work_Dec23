package org.example.jep356.randomnumbergenerator;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Java17RandomNumberGenerator {

    public static void main(String[] args) {
        RandomGenerator randomGenerator =
                RandomGeneratorFactory.of("Xoshiro256PlusPlus")
                        .create();
        int counter = 0;
        while (counter <=10){
             //0-10
            int res = randomGenerator.nextInt(11);
            System.out.println(res);
            counter++;
        }

        //lets write code to generate all the Java PRNG algos
        RandomGeneratorFactory.all()
                .map(fac -> fac.group() + " : " + fac.name())
                .sorted()
                .forEach(System.out::println);

    }
}
