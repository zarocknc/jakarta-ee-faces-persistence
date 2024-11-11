/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.snt.jakarta.usuarios;

import jakarta.ejb.Stateful;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author sebas
 */
@Stateful
public class RequestUsuarios {

    @PersistenceContext
    private EntityManager em;

    public Usuarios getUsuario(Long id) {
        Usuarios user = em.find(Usuarios.class, id);
        return user;
    }
    
    public List<Usuarios> listUsuarios() {
        List<Usuarios> usr = em.createQuery(
                "SELECT * FROM Usuarios u", Usuarios.class
        ).getResultList();
        return usr;
    }
}
