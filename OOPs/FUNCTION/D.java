package OOPs.FUNCTION;
interface bulb{
    void turnonn();
    void turnoff();
}
    
class L implements bulb{
    public void turnoff(){
System.out.println(" bulb is off");
    }
    public void turnonn(){
        System.out.println("bulb is onn");
    }
}
class B implements bulb{
    public void turnoff(){
System.out.println(" bulb is off");
    }
    public void turnonn(){
        System.out.println("bulb is onn");
    }
}


public class D {
    public static void main(String[] args) {
        L bi = new L();
        bi.turnoff();
        bi.turnonn();
            

        };
    }
}
