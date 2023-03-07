/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.ingsistemas.ApiRestElectiva.modelo.servcio;

import co.edu.unicolombo.ingsistemas.ApiRestElectiva.modelo.dao.IUsuarioRepository;
import co.edu.unicolombo.ingsistemas.ApiRestElectiva.modelo.entidades.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceLmp implements IUsuarioService{
    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> buscarTodo() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarPorCedula(String id) throws Exception {
        Usuario u = usuarioRepository.findById(id).orElse(null);
        if(u==null){
            throw new Exception("Usuario cc: "+id+" no existe");
        }
            return u; 
        
    } 

    @Override
    public void guardar(Usuario usuario) throws Exception {
        Usuario u = usuarioRepository.findById(usuario.getCedula()).orElse(null);
        if(u!=null){
            throw new Exception("Usuario cc: "+usuario.getCedula()+" no existe");
        }
            usuarioRepository.save(usuario); 
        
}

    @Override
    public void editar(Usuario usuario) throws Exception {
        buscarPorCedula(usuario.getCedula());
        usuarioRepository.save(usuario);
    }

    @Override
    public void eliminar(String id) throws Exception {
        //Usuario u = buscarPorCedula(id);
        //usuarioRepository.delete(u);
        buscarPorCedula(id);
        usuarioRepository.deleteById(id);
        
        
    }

    @Override
    public List<Usuario> buscarPorNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }

    @Override
    public List<Usuario> buscarPorEmailServer(String server) {
        return  usuarioRepository.findByEmailEndigWith(server);
    }

    @Override
    public long contar() {
        return  usuarioRepository.count();
    }
    
}
