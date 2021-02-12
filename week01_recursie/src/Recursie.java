import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recursie {


    // Oefening 1: n-de Fibonacci-getal

    public static int fibonacci(int getal) {
        if (getal <= 0)
            throw new IllegalArgumentException();
        if (getal <= 2)
            return 1;
        else
            return fibonacci(getal - 2) + fibonacci(getal - 1);
    }

    // Oefening 2 : som van cijfers

    public static int somVanCijfers(int getal) {
        if(getal < 0){
            getal = getal * -1;
        }
        if(getal == 0){
            return getal;
        }
        int rest = getal % 10;
        getal = (getal)/10;
        return (rest + somVanCijfers(getal));
    }

    // Oefening 3: keer een string om
    public static String keerOm(String s) {
        if(s == null){
            throw new IllegalArgumentException();
        }
        if(s.length() <= 1){
            return(s);
        }
        char ch = s.charAt(s.length()-1);
        return(ch + keerOm(s.substring(0, s.length() - 1)));
    }

    //oefening 4: countX

    public static int countX(String s) {
        if(s == null){
            throw new IllegalArgumentException();
        }
        if(s.length() == 0){
            return(0);
        }

        if(s.charAt(s.length()-1) == 'x'){
            return(1 + countX(s.substring(0, s.length() - 1)));
        }

        return(countX(s.substring(0, s.length() - 1)));
    }

    //oefening 5 : countHi
    public static int countHi(String s) {
        if(s == null){
            throw new IllegalArgumentException();
        }
        if(s.length() < 2){
            return(0);
        }

        if((s.charAt(s.length()-1) == 'i')&&(s.charAt(s.length()-2) == 'h')){
            return(1 + countHi(s.substring(0, s.length() - 2)));
        }
        else{
            return(countHi(s.substring(0, s.length() - 1)));
        }
    }

    // oefening 6
    public static String changeXY(String s) {
        if(s == null){
            throw new IllegalArgumentException();
        }

        if(s.length() == 0){
            return(s);
        }
        char ch = s.charAt(s.length()-1);
        if(ch == 'x'){
            return (changeXY(s.substring(0, s.length() - 1)) + 'y');
        }
        if(ch == 'y'){
            return (changeXY(s.substring(0, s.length() - 1)) + 'x');
        }

        return (changeXY(s.substring(0, s.length() - 1))+ ch);

    }

    // oefening 7

    public static String changePi(String s) {
        if(s == null){
            throw new IllegalArgumentException();
        }
        if(s.length() <= 1){
            return(s);
        }

        if((s.charAt(s.length()-1) == 'i')&&(s.charAt(s.length()-2) == 'p')){
            return(changePi(s.substring(0, s.length() - 2)) + "3.14");
        }
        else{
            return(changePi(s.substring(0, s.length() - 1)) + s.charAt(s.length()-1));
        }

    }

    // oefening 8:
    public static int tweelog(int getal) {
        if(getal <= 0){
            throw new IllegalArgumentException();
        }
        if(getal == 1){
            return(0);
        }
        return(1+ tweelog(getal/2));
    }

    // oefening 9;
    public static double findMaximum(List<Double> lijst) {
        if((lijst == null) || (lijst.isEmpty())){
            throw new IllegalArgumentException();
        }
        if(lijst.size() == 1){
            return(lijst.get(0));
        }
        double k = lijst.remove(0);
        double l = findMaximum(lijst);
        if(l > k){
            return l;
        }
        else{
            return k;
        }
    }

    // oefening 10;
    public static ArrayList<String> findSubstrings(String string) {

    }

}