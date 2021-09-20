/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java .util.ArrayList;
/**
 *
 This class is responsible for new student
 This class will inherit from person class
 * @author Abode
 */
public class newStudent extends Person{
    ArrayList<String> idnum = new ArrayList<String>();
    private String phoneNumber;
    private double price;
    private double paidMoney;
    private int level;
     newStudent() {
    phoneNumber = "085749832";
    price = 0; 
    paidMoney = 0;
    }

    public newStudent(int agee,String id,String namm,String phoneNumber, double price, double paidMoney,int level) {
    super(namm,agee,id);
        this.phoneNumber = phoneNumber;
        this.price = price;
        this.paidMoney = paidMoney;
    this.level = level;
    }
    
//___________________________________________________________________________________________________________
// Setters
    public void setLevel(int levl){
        this.level = levl;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPaidMoney(double paidMoney) {
        this.paidMoney = paidMoney;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
        
//___________________________________________________________________________________________________________
// Getters
    public String getPhoneNum(){
        return phoneNumber;
    }
   
    public double getPaidMoney(){
            return paidMoney;
    }
public int getAge(){
    
       
    return age;
}
public String getName(){
    return this.name;
}
public String getID(){
    return ID;
}
public int getLevel(){
    return level;
}
public double getPrice(){
      
    if(age>=10 && age<=16){
        price = 3430.34;
        return price;
    }
    else if(age>=17 && age<=24){
        price = 5894.34;
        return price;
    }
        return price;
}
public double getPaid(){
    return paidMoney;
}

//___________________________________________________________________________________________________________
// check if the charchter contain specific value

public boolean checkID(String s){
    String buf = s;
    ID = s;
    for (int i = 0; i < buf.length(); i++) {
           if((buf.charAt(i)>=33&&buf.charAt(i)<=47)
             ||(buf.charAt(i)>=58&&buf.charAt(i)<=126)){
                      System.out.println("Invalid input");    
                 return true;
                    }
           else if(buf.length()<10){
               System.out.println("ID number is to short");
               return true;
           }
           else if (buf.length()>10)
              System.out.println("ID number is too long ");
    return true;            
    }
    return false;
}

public boolean checkName(String n){
   name = n;
     for (int i = 0; i < name.length(); i++) {
        if(name.charAt(i) >'1' && name.charAt(i) <'9'){
                  System.out.println("Numbers is't allowed");                               
            return true;
             
        }
        else if(name.isEmpty()){
            System.out.println("Invalid name");
            break;
        }
        }
return false;
}

public boolean checkPhone(String phone){
    this.phoneNumber = phone;
    
    for (int i = 0; i < phoneNumber.length(); i++) {
        if(phoneNumber.length()>10){
            System.out.println("The phone number is too long");
            return true;
        }
        else if(phoneNumber.length()<10){
            System.out.println("The phone number is too short");
        return true; 
        }
        else if((phoneNumber.charAt(i)>=58&&phoneNumber.charAt(i)<=126)||
                (phoneNumber.charAt(i)>=33&&phoneNumber.charAt(i)<=47)){
            System.out.println("Invalid input");
            return true;
        }
    }
return false; 
}

//____________________________________________________________________________________________________________
// print information
public void printNew(){
    System.out.println("Name : " + getName());
    System.out.println("Age : " + getAge());
    System.out.println("ID : " + getID());
    System.out.println("Level : " + level);
    System.out.println("Phone number : " + phoneNumber);
    System.out.println("Price : " + price);
    System.out.println("Paid money : " + paidMoney);
    System.out.println("Remaining money : " + (float)(price-paidMoney));
    System.out.println("\nThank you for using our service :) ");
}
}
