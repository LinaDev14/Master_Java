package co.com.linadev.seccion_9;

import java.io.FileInputStream;

import java.util.Properties;

public class AsignarPropiedades {
    public static void main(String[] args) {


        try{
            FileInputStream file = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(file);
            p.setProperty("mi.propiedad.personalizada","mi valor guardado en el objeto properties");
            System.setProperties(p);
            System.getProperties().list(System.out);

        }catch (Exception e){
            System.out.println("File not found" + e);
        }
    }
}
