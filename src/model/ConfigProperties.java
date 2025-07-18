/* 
 * OpenVenta v. 0.0.1
 * Modelo para cargar el archivo properties de la base de datos
 * Desarrollado por Mario García - Búho Computación
 * mariogarcia1040@yahoo.com.mx
 * 17-Julio-2025
 * 
 */
package model;

import interfaces.IConfigProperties;
import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author Mario García | Búho Computación - mariogarcia1040@gmail.com
 */
public class ConfigProperties implements IConfigProperties {

    private final String path;
    private final Properties props;

    public ConfigProperties(String path) {
        this.path = path;
        this.props = new Properties();
    }

    @Override
    public boolean load() {
        try (FileInputStream fis = new FileInputStream(path)) {
            props.load(fis);
            return true;
        } catch (Exception e) {
            System.err.println("Error cargando propiedades: " + e.getMessage());
            return false;
        }
    }

    @Override
    public String get(String key) {
        return props.getProperty(key);
    }

}
