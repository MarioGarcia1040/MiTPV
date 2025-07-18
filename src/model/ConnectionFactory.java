/* 
 * OpenVenta v. 0.0.1
 * Creamos la conexión a la base de datos
 * Desarrollado por Mario García - Búho Computación
 * mariogarcia1040@yahoo.com.mx
 * 17-Julio-2025
 * 
 */
package model;

import interfaces.IConfigProperties;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private final IConfigProperties config;

    public ConnectionFactory(IConfigProperties config) {
        this.config = config;
        if (!config.load()) {
            throw new RuntimeException("No se pudieron cargar las propiedades.");
        }

        try {
            Class.forName(config.get("db.driver"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("No se pudo cargar el driver", e);
        }
    }

    public Connection getConnection() throws Exception {
        return DriverManager.getConnection(
                config.get("db.url"),
                config.get("db.username"),
                config.get("db.password")
        );
    }
}
