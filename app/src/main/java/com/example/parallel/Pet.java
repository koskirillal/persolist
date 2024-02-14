package com.example.parallel;

public class Pet {
    public int id;
    public String type;
    public String name;
    public Pet(int id , String type , String name){
        this.id=id;
        this.name=name;
        this.type=type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
