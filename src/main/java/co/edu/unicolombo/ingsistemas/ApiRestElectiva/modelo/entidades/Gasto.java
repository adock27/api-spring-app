/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.ingsistemas.ApiRestElectiva.modelo.entidades;


    
    
    
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name= "Gastos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Gasto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cedula;
    
    @DateTimeFormat(pattern = "yyy-mm-dd")
    private Date fecha;
    private String nombre;
    private String valor;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private String detalles;
}
