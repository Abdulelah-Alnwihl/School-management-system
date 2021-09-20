
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abode
 */
public class Employee extends Person{
     ArrayList <String> name  = new ArrayList<String>();
      ArrayList <String> EmployeeID  = new ArrayList<String>();
       ArrayList <String> EmployeePassword  = new ArrayList<String>();
        ArrayList <Double> Salary  = new ArrayList<Double>();
         ArrayList <String> jobName  = new ArrayList<String>();
         ArrayList <Double> Bouns  = new ArrayList<Double>();
          ArrayList <Double> Discount  = new ArrayList<Double>();
          
          
    Employee(){
       name.add("Ahmed rashed mohammed");// School manger
       name.add("Saud yousef mansour");// School agent 
       
       name.add("Mohammed abdulaziz ahmed");// teacher of computer 
         name.add("Khaled abdullah khaled");// teacher of math
         name.add("Abdulaziz yasser saleh");// teacher of physics
   
//________________________________________________________________________
   
       EmployeeID.add("1123986093");// Manger
       EmployeeID.add("1929877444");// School agent 
       
       EmployeeID.add("1663845292");// teacher of computer 
       EmployeeID.add("1984302838"); //teacher of math
       EmployeeID.add("1836483474"); //teacher of physics
       
 //________________________________________________________________________
       
       Salary.add(18432.4);// Manger
        Salary.add(10854.765);// School agent 
       
        Salary.add(7900.132);// teacher of computer 
       Salary.add(6984.765); //teacher of math
      Salary.add(6728.345);//teacher of physics
//__________________________________________________________________________
    Bouns.add(0.0);// School manger
    Bouns.add(860.3);// School agent
    
    Bouns.add(348.3);// teacher of computer science 
    Bouns.add(100.0);//teacher of math
    Bouns.add(0.0);//teacher of physics
    
 //___________________________________________________________________________
 EmployeePassword.add("563279FFFRE$$#"); // manger
 EmployeePassword.add("RtG4378r4378!*&");// School agent
 
 EmployeePassword.add("T43867WQ!$#%");//teacher of computer 
 EmployeePassword.add("43yiu*&%$52"); //teacher of math
 EmployeePassword.add("874RF934o8i#$%"); // teacher of physics
 
 jobName.add("School manger");
 jobName.add("School agent");
 
 jobName.add("Computer science teacher ");
 jobName.add("Math teacher");
 jobName.add("Physics teacher");
    
    }
    
    public  void CheckID(String id , String pass){ // check ID
    boolean check = true; // Valid input
        this.ID = id;
        this.password = pass;
        for (int i = 0; i < EmployeeID.size(); i++) {
             if(ID.equals(EmployeeID.get(i))&& password.equals(EmployeePassword.get(i))){
                print_Employee_information(i);
                 System.out.println("Equal");
                 check = true;
             break;
             }
             else
                 check = false;
             
        }
         
        if(check==false){
            System.out.println("ID or password incorrect");
        }
    }
    void print_Employee_information(int ctr){
        System.out.println("Name : " + name.get(ctr));
        System.out.println("ID : " + EmployeeID.get(ctr));
        System.out.println("Bouns : " + Bouns.get(ctr));
        //System.out.println("Discount : " + Discount.get(ctr));
        System.out.println("Basic salary : " + Salary.get(ctr));
        System.out.println("Job name : " + jobName.get(ctr));
    }
}
