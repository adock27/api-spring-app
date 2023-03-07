/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.ingsistemas.ApiRestElectiva.modelo.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usuario {
    @Id
    private String cedula;
    private String clave;
    private String nombre;
    private String email;
    private String telefono;
    @OneToMany(mappedBy = "usuarios")
    private List<Gasto> gastos;
    
}
