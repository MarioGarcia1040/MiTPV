/* 
 * OpenVenta v. 0.0.1
 * Vista de acceso
 * Desarrollado por Mario García - Búho Computación
 * mariogarcia1040@yahoo.com.mx
 * 13-Julio-2025
 * 
 */
package view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author buhos
 */
public class LoginView extends JFrame {

    public JTextField txtUser = new JTextField();
    public JPasswordField txtPassword = new JPasswordField();
    public JButton btnLogin = new JButton("Entrar");
    public JButton btnSalir = new JButton("Salir");

    public LoginView() {
        setUndecorated(true);
        setTitle("Acceso");
        setSize(260, 130);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblUser = new JLabel("Usuario:");
        lblUser.setBounds(20, 20, 80, 25);
        add(lblUser);

        txtUser.setBounds(100, 20, 150, 25);
        add(txtUser);

        JLabel lblPass = new JLabel("Contraseña:");
        lblPass.setBounds(20, 60, 80, 25);
        add(lblPass);

        txtPassword.setBounds(100, 60, 150, 25);
        add(txtPassword);

        btnSalir.setBounds(20, 100, 100, 25);
        btnSalir.setMnemonic(KeyEvent.VK_S);
        add(btnSalir);

        btnLogin.setBounds(150, 100, 100, 25);
        btnLogin.setMnemonic(KeyEvent.VK_E);
        add(btnLogin);

        btnSalir.addActionListener(e -> {
            int confirmar = JOptionPane.showConfirmDialog(
                    this,
                    "¿Deseas salir del sistema?",
                    "Confirmar salida",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirmar == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        txtUser.addActionListener(e -> txtPassword.requestFocusInWindow());
        txtPassword.addActionListener(e -> btnLogin.doClick());

        btnSalir.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnSalir.doClick();
                }
            }
        });

        txtUser.requestFocusInWindow();
    }
}
