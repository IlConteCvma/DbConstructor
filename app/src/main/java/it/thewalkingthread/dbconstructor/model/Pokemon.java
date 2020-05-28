package it.thewalkingthread.dbconstructor.model;

import java.util.List;

public class Pokemon {
    //local class to describe pokemon
    int id;
    String name;
    List<PokeType> types;

    public Pokemon(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<PokeType> getTypes() {
        return types;
    }

    public void setTypes(List<PokeType> types) {
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
