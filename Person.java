/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Super class
 * @author Abode
 */
public abstract class  Person { 
    
    protected String name ; 
    protected int age;
    protected String ID; 
    protected String password;
    Person(){
        name = "Empty";
        age = 0; 
        ID = "1010101010";
    }

    public Person(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }
    
    
}
