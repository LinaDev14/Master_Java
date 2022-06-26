package co.com.linadev.seccion_9;

import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {

        // user.name
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        // user.home
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
        
        // user.dir
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);
        
        // os.version
        String version = System.getProperty("os.version");
        System.out.println("version = " + version);
        
        // java.version
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

        // list properties
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
