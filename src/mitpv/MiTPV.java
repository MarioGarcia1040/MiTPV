/* 
 * OpenVenta v. 0.0.1
 * Sistema punto de venta básico
 * Desarrollado por Mario García - Búho Computación
 * mariogarcia1040@yahoo.com.mx
 * 13-Julio-2025
 * 
 */
package mitpv;

import controller.LoginController;
import model.UserDAO;
import view.LoginView;

/**
 *
 * @author buhos
 */
public class MiTPV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        UserDAO userDAO = new UserDAO();

        new LoginController(loginView, userDAO);

        loginView.setVisible(true);

    }

}
