import java.awt.Desktop;
import java.io.*; // Done
import java.awt.*; // not done
import java.net.*;
import java.io.FileWriter; // not done
import java.util.InputMismatchException; // not Done
import java.util.Scanner;  // Done
import javax.security.auth.kerberos.EncryptionKey;
import javax.swing.plaf.DesktopIconUI;
import java.io.*;
public class NewClass {

           public  static void main(String[] args) {
            
               System.out.println("Choose a letter from this list:\n");
               System.out.println("A: To register in this school");
               System.out.println("B: For the students who are registered in this school");
               System.out.println("C: For employee\n ");
               System.out.println("Letter?");
try{
               Scanner inp = new Scanner(System.in);
               
               char letter = inp.nextLine().toUpperCase().charAt(0); // convert letter to uppercase
               
               switch(letter){
                 
                  case'A':{
                   newStudent s1 = new newStudent();
                  
                  
                   System.out.println("Please enter your full name : ");
                    
                                     
                   if(s1.checkName(inp.nextLine())==true){

                           break;
                       }
                   
                   System.out.println("Please enter your ID number : ");
           
                                        
                       s1.checkID(inp.nextLine());
                       
                         
                      
                   
                     System.out.println("Your phone number : ");
                     
                   if(s1.checkPhone(inp.nextLine()) == true){
                     
                       break;
                   }
                   System.out.println("Enter your age : ");
                   s1.setAge(inp.nextInt());
                        if(s1.getAge() >24||s1.getAge()<10){
                            
        System.out.println("Sorry this age is't allowed in this school");
        break;
                        }   
                      
                   System.out.println("Enter your level : ");    
               s1.setLevel(inp.nextInt());
               if(s1.getLevel()>30){
                   System.out.println("Invalid input");
                   break;
               }
                   System.out.println("The price for one smester is = " + s1.getPrice());
                   System.out.println("\nPaied money ? ");
               double paidMoney = inp.nextDouble();
                   s1.setPaidMoney(paidMoney);
               if(s1.getPaid()>s1.getPrice()){
                   System.out.println("Invalid input");
               break;
               }
                   System.out.println("====================================================");
               s1.printNew();
                     
        
            
                   }
                  break;
                  case 'B':{
                      Students s = new Students();
                      
                      String password , idd; 
                      System.out.println("Enter your ID number ");
                      idd = inp.nextLine();
                      System.out.println("Enter your password");
                      password = inp.nextLine();
                      s.check(password,idd);
                  }
                  break;
                  case 'C':{
                      Employee e = new Employee();
                       String password , idd; 
                      System.out.println("Enter your ID number ");
                      idd = inp.nextLine();
                      System.out.println("Enter your password");
                      password = inp.nextLine();
                      e.CheckID(idd,password);
                  }
                   }
                    
                       
           }
           catch(InputMismatchException e){
               System.out.println(e.getMessage());
}

           }

           }
