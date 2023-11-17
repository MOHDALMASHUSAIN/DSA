
/*package OOPs.FUNCTION;

class Account {
    double balance;

    Account() {
        System.out.println("Account Class :: Constructor....");
    }

    void deposit() {
        System.out.println("Account Class :: Deposit....");
    }

    void withdraw() {
        System.out.println("Account Class :: WithDraw..");
    }
}

class SavingAccount extends Account {
    // No need for here
   // super.deposit() ;

    SavingAccount(){
        System.out.println("Saving Class :: Constructor....");
    }

    @Override
    void deposit() {
        
        System.out.println("SavingAccount Class :: Deposit....");
    }

    void limitOfTrans() {
        System.out.println("SavingAccount Class :: limitOfTrans..");
    }
}

class CurrentAccount extends Account {
    CurrentAccount(){
        System.out.println("CurrentClass Class :: Constructor....");
    }
 //  @Override
    void kevint(){
        System.out.println("CurrentAccount Class :: Deposit");
    }
    void odLimit() {
        System.out.println("CurrentAccount Class :: odLimit..");
    }
}

public class Class4 {
    public static void main(String[] args) {
        
         SavingAccount sa = new SavingAccount();
         sa.deposit();
         System.out.println("----------------------");
         sa.withdraw();
         sa.limitOfTrans();
        }}
        
        Account ca = new CurrentAccount();
        ca.deposit();
        System.out.println("----------------------");
        ca.withdraw();
        System.out.println("----------------------");
       
    }}

    /* 
        package OOPs.FUNCTION;

class A{
    void funct1(){
        System.out.println("A :: Hello");
    }
    void funct2(){
        System.out.println("c :: Hello");
    }
    
}
class B extends A{
    @Override
    void funct1(){
        System.out.println("B :: Hello");
    }
}
/* 

public class Class4 {
    public static void main(String[] args) {
        // A obj1 = new A();
        // obj1.funct1();
        B obj2 = new B();
        obj2.funct2();
    }
}
*/
package OOPs.FUNCTION;

// Super class
final class Shape_2{
    Shape_2(){
        System.out.println("THIS IS THE SUPER CLASS");
    }

    final void greetMessage(){
        System.out.println("HELLO BY SHAPE_2");
    }
}

// Child class
// Super class declared as final class : so cannot inherit that
// class Circle_2 extends Shape_2{
class Circle_2{
    double radius;
    final double PI = 3.14;

    double printArea(){
        return PI * radius *radius;
    }
    // Because the super class has greetMessage method declare as final
    // Thats's why u  can't override the final method
    void greetMessage(){
        System.out.println("HELLO BY CIRCLE_2");
    }
}

public class Class4 {
    public static void main(String[] args) {
        final float PI = 3.14f;
        System.out.println("Before Updation : " + PI);
        // Making a variable as final won't allow u to update the data
        // PI += 10;
        // System.out.println("After Updation : " + PI);

        Circle_2 c = new Circle_2();
        c.radius = 5;
        System.out.println("AREA OF CIRCLE IS " + c.printArea());;
        c.greetMessage();
    }
}