package com.example.parallel;

public class Person2 {
    public int id;
    public String fullname;
    public String telephone;
    public Person2(int id , String fullname , String telephone){
        this.id=id;
        this.fullname=fullname;
        this.telephone=telephone;
    }

    public String getFullname() {
        return fullname;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
