package co.com.linadev.seccion_10;

public class ClaseMath {
    public static void main(String[] args) {

        // calculating the absolute value of a number
        int absolute = Math.abs(-5);
        System.out.println("absolute value = " + absolute);

        double max = Math.max(3.7, 7.6);
        System.out.println("max value= " + max);
        
        double min = Math.min(4.7, 5.6);
        System.out.println("min = " + min);

        double roundCeil = Math.ceil(3.89684);
        System.out.println("round = " + roundCeil);
        
        double roundFloor = Math.floor(3.86775);
        System.out.println("roundFloor = " + roundFloor);

        long constPi = Math.round(Math.PI);
        System.out.println("constPi = " + constPi);
        
    }
}
