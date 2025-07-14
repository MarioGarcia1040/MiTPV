/* 
 * OpenVenta v. 0.0.1
 * Interface de autorización de usuarios
 * Desarrollado por Mario García - Búho Computación
 * mariogarcia1040@yahoo.com.mx
 * 13-Julio-2025
 * 
 */
package interfaces;

import model.UserModel;

/**
 *
 * @author buhos
 */
public interface IUserAuth {

    boolean acceso(UserModel userModel);
}
