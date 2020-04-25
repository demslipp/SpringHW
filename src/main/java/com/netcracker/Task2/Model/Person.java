package com.netcracker.Task2.Model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Person{
    @Size(min=2, max=30)
    private String surname;
    @Size(min=2, max=30)
    private String name;
    @Size(min=2, max=30)
    private String middlename;
    @Min(18)
    private int age;
    @Min(10000)
    private int salary;
    @Email
    private String email;
    @Size(min=2, max=30)
    private String workplace;


    @Override
    public String toString(){
        return "surname= "+surname+"\n"+
                "name= "+name+"\n"+
                "middlename= "+middlename+"\n"+
                "age= "+age+"\n"+
                "salary= "+salary+"\n"+
                "email= "+email+"\n"+
                "workplace= "+workplace+"\n";
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getMiddlename(){
        return middlename;
    }

    public void setMiddlename(String middlename){
        this.middlename=middlename;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getWorkplace(){
        return workplace;
    }

    public void setWorkplace(String workplace){
        this.workplace=workplace;
    }

}