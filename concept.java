package Concept;
public class concept{
    public static void main(String args[]){
     Bankacc b1 = new Bankacc();
     b1.name = "Vinayak";
     b1.accno = "Vinayak123";
     System.out.println(b1.name+" "+b1.accno+" "+b1.getpassword());
    }
}
class Bankacc{
    String name;
    String accno;
    private String password = "awdrg";
    String getpassword(){
        return this.password;
    }
    void setpassword(String newpassword){
        this.password = newpassword;
    }
}