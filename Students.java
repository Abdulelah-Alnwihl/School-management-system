import java .util.ArrayList;
public class Students extends Person{
    ArrayList<String> idNumber = new ArrayList<String>();
 ArrayList<String> name = new ArrayList<String>();
 
 ArrayList<String> GPA = new ArrayList<String>();
   ArrayList<String>Password = new ArrayList<String>();
   ArrayList<String>phoneNumber = new ArrayList<String>();
Students(){

idNumber.add("1512345665");
idNumber.add("1973364783");
idNumber.add("1173344922");
idNumber.add("2177692001");

name.add("Ahmed Saleh");
name.add("Mohammed raed");
name.add("Khaled saud");
name.add("Nwaf ahmed");

GPA.add("Excellent :)");
GPA.add("Good ");
GPA.add("Very good ");
GPA.add("Good ");


Password.add("Ahmed*376569&837");
Password.add("375SC894630NM*#2");
Password.add("G48397m098##@826");
Password.add("EmS%048nbkrpps1089");

phoneNumber.add("0573772168");
phoneNumber.add("0555542189");
phoneNumber.add("0567899921");
phoneNumber.add("0544481113");

} 
 public boolean getID(){

     for (int i = 0; i < idNumber.size(); i++) {
            if(ID.equals(idNumber.get(i))){
                Print_Students_Information(i);
    return true;
    
}
     }

 System.out.println("Something went wrong");
return false;
}
 
 public boolean check(String pass, String idd){

     this.password = pass;    
    this.ID = idd;
     for (int i = 0; i < Password.size(); i++) {
         if(pass.equals(Password.get(i))){
             getID();
         return false;
         }         
                 
     }
         System.out.println("Something went wrong");
          return true;
 }
 public void Print_Students_Information(int x){
     System.out.println("Name : " + name.get(x));
     System.out.println("Phone number : " + phoneNumber.get(x));
     System.out.println("ID : " + idNumber.get(x));
     System.out.println("Academic level : " + GPA.get(x));
 }
  
}
