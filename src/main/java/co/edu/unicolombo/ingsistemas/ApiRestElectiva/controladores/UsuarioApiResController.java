package co.edu.unicolombo.ingsistemas.ApiRestElectiva.controladores;

import co.edu.unicolombo.ingsistemas.ApiRestElectiva.modelo.entidades.Usuario;
import co.edu.unicolombo.ingsistemas.ApiRestElectiva.modelo.servcio.UsuarioServiceLmp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioApiResController {
    @Autowired
    private UsuarioServiceLmp userService;
    @GetMapping
    public List<Usuario> listarTodo(){
        return userService.buscarTodo();
    }
}
