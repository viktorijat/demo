package com.example.demo;


class CharacterName {
    private String givenName, surname;

    private CharacterName(String givenName) {
        this.givenName = givenName;
        printName();
    }



    protected CharacterName(String givenName, String surname) {
        this(givenName);
        this.surname = surname;
        printName();
    }

    protected void printName() {
        System.out.println(givenName + " " + surname);
    }
}


public class PlayerCharacterName extends CharacterName {

    private String playerName;
    public PlayerCharacterName(String playerName, String givenName, String surname) {
        super(givenName, surname);
        this.playerName = playerName;
        printName();
    }

    public static void main(String[] args) {
        new PlayerCharacterName("Bill", "Ash", "Williams");
    }
}
