package pe.upc.swe.trika.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Video
{
    @Id
    @GeneratedValue
    private int idVideo;
    private String titulo;
    private String descripcion;
    private String link;
    private String miniatura;

    @OneToOne
    @JoinColumn(name="idCurso")
    private Curso curso;

}
