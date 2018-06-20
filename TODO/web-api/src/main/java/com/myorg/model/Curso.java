package com.myorg.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Curso
{
    @Id
    @GeneratedValue
    private int idCurso;
    private String Nombre;
    private int creditos;
    private String descripcion;


    @OneToOne
    @JoinColumn(name="idCarrera")//porque son cursos de carrera
    private Carrera carrera;


    @OneToMany(mappedBy = "curso")
    private List<Video> videos;

}