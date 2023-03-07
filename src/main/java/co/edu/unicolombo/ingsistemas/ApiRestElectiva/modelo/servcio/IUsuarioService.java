/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.ingsistemas.ApiRestElectiva.modelo.servcio;

import co.edu.unicolombo.ingsistemas.ApiRestElectiva.modelo.entidades.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author BRAVO
 */
public interface IUsuarioService {
    public List<Usuario > buscarTodo();
    public Usuario buscarPorCedula (String id) throws Exception;
    public void guardar(Usuario usuario) throws Exception;
    public void editar(Usuario usuario) throws Exception;
    public void eliminar(String id) throws Exception;
    public List<Usuario> buscarPorNombre(String nombre);
    public List<Usuario> buscarPorEmailServer(String server);
    public long contar();
    
    
}
