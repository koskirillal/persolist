package com.example.parallel;

public class Person {
    public int id;
    public String fullname;
    public String telephone;
    public String pettype;
    public String petsname;
    public Person(int id , String fullname , String telephone , String pettype , String petsname){
        this.id=id;
        this.fullname=fullname;
        this.telephone=telephone;
        this.pettype=pettype;
        this.petsname=petsname;
    }

    public int getId() {
        return id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPetsname() {
        return petsname;
    }

    public String getPettype() {
        return pettype;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPetsname(String petsname) {
        this.petsname = petsname;
    }

    public void setPettype(String pettype) {
        this.pettype = pettype;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", telephone='" + telephone + '\'' +
                ", pettype='" + pettype + '\'' +
                ", petsname='" + petsname + '\'' +
                '}';
    }
}
