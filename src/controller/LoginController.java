/* 
 * OpenVenta v. 0.0.1
 * Controlador de acceso
 * Desarrollado por Mario García - Búho Computación
 * mariogarcia1040@yahoo.com.mx
 * 13-Julio-2025
 * 
 */
package controller;

import interfaces.IUserAuth;
import model.UserModel;
import view.LoginView;

import javax.swing.*;
import view.MainView;

/**
 *
 * @author Mario García | Búho Computación - mariogarcia1040@gmail.com
 */
public class LoginController {

    private final LoginView loginView;
    private final IUserAuth iUserAuth;

    public LoginController(LoginView loginView, IUserAuth iUserAuth) {
        this.loginView = loginView;
        this.iUserAuth = iUserAuth;

        initController();
    }

    private void initController() {
        loginView.btnLogin.addActionListener(e -> handleLogin());
    }

    private void handleLogin() {
        String userName = loginView.txtUser.getText();
        String userPassword = new String(loginView.txtPassword.getPassword());

        UserModel userModel = new UserModel(userName, userPassword);

        if (iUserAuth.acceso(userModel)) {
            SwingUtilities.invokeLater(() -> {
                loginView.dispose();
                new MainView().setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(loginView, "Credenciales incorrectas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
