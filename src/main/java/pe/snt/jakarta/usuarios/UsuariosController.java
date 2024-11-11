/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.snt.jakarta.usuarios;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sebas
 */
@Named
@RequestScoped
@Getter
@Setter
public class UsuariosController {

    @Inject
    private RequestUsuarios request;
    private List<Usuarios> usuariosList;
    private Usuarios selectedUsuario;

    public void loadUsuarios() {
        usuariosList = request.listUsuarios();
    }
}
