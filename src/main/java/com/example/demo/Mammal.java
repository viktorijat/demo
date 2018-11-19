package com.example.demo;

import java.io.Serializable;

public class Mammal {
    protected transient String name = "Moby";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Mammal() {
        this.name = "Monstro";
    }
}

class Whale extends Mammal implements Serializable {

    {
        this.name = "Lisa";
    }

    public Whale() {
        this.name = "Roger";
    }
}

