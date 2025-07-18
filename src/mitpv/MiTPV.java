/* 
 * OpenVenta v. 0.0.1
 * Sistema punto de venta básico
 * Desarrollado por Mario García - Búho Computación
 * mariogarcia1040@yahoo.com.mx
 * 13-Julio-2025 | 17-Julio-2025
 * 
 */
package mitpv;

import controller.LoginController;
import interfaces.IConfigProperties;
import model.ConfigProperties;
import model.ConnectionFactory;
import model.UserDAO;
import view.LoginView;

/**
 *
 * @author Mario García | Búho Computación - mariogarcia1040@gmail.com
 */
public class MiTPV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "db.properties";

        IConfigProperties config = new ConfigProperties(ruta);

        ConnectionFactory connectionFactory;
        try {
            connectionFactory = new ConnectionFactory(config);
            connectionFactory.getConnection().close(); // solo para verificar
        } catch (Exception e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
            System.out.println("Verifica el archivo de configuración o la base de datos.");
            return; // o mostrar GUI para editar configuración
        }

        //UserDAO userDAO = new UserDAO(connectionFactory);
        UserDAO userDAO = new UserDAO();
        LoginView loginView = new LoginView();

        new LoginController(loginView, userDAO);

        loginView.setVisible(true);

    }

}
