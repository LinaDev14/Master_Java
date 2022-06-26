package co.com.linadev.seccion_10;

public class MethodRandom {
    public static void main(String[] args) {
        
        double ram = Math.random();
        System.out.println("ram = " + ram);
        
        String[] colors = {"azul", "amarillo", "rojo", "verde", "negro", "rosado"};
        
        double random = Math.random();
        random *= colors.length;
        random = Math.floor(random);
        System.out.println("color = " + colors[(int) random]);
    }
}
