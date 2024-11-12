package CH4StringsBasics;

public class Random3 {
    public static void main(String[] args) {
        String str ="Almas Husain";
        int count=0;
        while (str=="") {
            str=str.substring(1);
            count++;
        }
        System.out.println(count);

    }
}
