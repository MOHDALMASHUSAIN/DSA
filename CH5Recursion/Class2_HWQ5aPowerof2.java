package CH5Recursion;

public class Class2_HWQ5aPowerof2 {
    static boolean power(int n){
        if(n/2==1){
           return true;
        }
       if(n%2==1){
        return false;
       }
       return power(n/2);
        
    }
    public static void main(String[] args) {
        if(power(16)){
            System.out.println("power of 2");
        }
       // System.out.println(power(16)==true);
    }
}
