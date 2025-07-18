/* 
 * OpenVenta v. 0.0.1
 * Interface para configuración del archivo properties
 * Desarrollado por Mario García - Búho Computación
 * mariogarcia1040@yahoo.com.mx
 * 17-Julio-2025
 * 
 */
package interfaces;

/**
 *
 * @author Mario García | Búho Computación - mariogarcia1040@gmail.com
 */
public interface IConfigProperties {

    boolean load();

    String get(String key);
}
