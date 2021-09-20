package com.springBasics.beans;
public class Employee {
    private int id;
    private  String name;
    private float salary;
    String designation;
  public int getId(){
      return id;
  }


  public String getName(){return name;}
  public  String getDesignation(){ return designation;}
  public  float getSalary(){return salary;}

    public void setName(String name){this.name=name;}
    public void setId(int id){this.id=id;}
    public void setSalary(float salary){this.salary=salary;}
    public void setDesignation(String name){this.name=name; }
}
