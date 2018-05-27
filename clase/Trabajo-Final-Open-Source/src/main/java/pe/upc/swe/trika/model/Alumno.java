package pe.upc.swe.trika.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Alumno
{
    @Id
    @GeneratedValue
    private int idAlumno;
    private String dni;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;

    @OneToOne
    @JoinColumn(name = "idCarrera")
    private Carrera carrera;


}

//genera automaticamente setes y getter