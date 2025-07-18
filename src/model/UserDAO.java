/* 
 * OpenVenta v. 0.0.1
 * Data access objet Usuario - implementación
 * Desarrollado por Mario García - Búho Computación
 * mariogarcia1040@yahoo.com.mx
 * 13-Julio-2025
 * 
 */
package model;

import interfaces.IUserAuth;

/**
 *
 * @author Mario García | Búho Computación - mariogarcia1040@gmail.com
 */
public class UserDAO implements IUserAuth {

    @Override
    public boolean acceso(UserModel userModel) {
        // Lógica de conexión a la base de datos
        return "admin".equals(userModel.getUserName()) && "1234".equals(userModel.getUserPassword());
    }

}
