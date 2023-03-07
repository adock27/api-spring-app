/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.ingsistemas.ApiRestElectiva.modelo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.unicolombo.ingsistemas.ApiRestElectiva.modelo.entidades.Usuario;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, String>{
    // Metodo de consulta (QueryMetho = Metodos MAgicos)
    public List<Usuario> findByNombre(String nombre);
    
    // SELECT    * FROM ususario WHERE email LIKE 'emailServer';
    public List<Usuario> findByEmailEndigWith(String emailServer);
    
}
