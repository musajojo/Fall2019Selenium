package com.cybertekShorts;

import com.github.javafaker.Faker;

public class Short_03_Maven_using_IntelliJ_Idea {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // this was a dependency that I added that makes up random info
        Faker faker = new Faker();

        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());

        System.out.println(faker.dragonBall().character());
        System.out.println(faker.chuckNorris().fact());

    }
}
