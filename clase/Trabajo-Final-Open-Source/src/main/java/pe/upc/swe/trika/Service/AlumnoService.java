package pe.upc.swe.trika.Service;

import org.springframework.stereotype.Service;
import pe.upc.swe.trika.model.Alumno;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AlumnoService
{

    private List<Alumno> alumnos;

    public List<Alumno> findAll()
    {
        if (alumnos== null)
        {
            alumnos=new ArrayList<>();
            Date fn = new Date(1996,11,11);
            //alumnos.add(new Alumno(1,"72941202", "Adrian","Vela","pedro.velacc@gmail.com",fn,"Avenida Pacifico 111","1"));
        }

        return alumnos;
    }

    public Alumno findId(int id)
    {
        Alumno objA = null;
        try
        {
            for (Alumno x: findAll()) if (x.getIdAlumno() == id)  objA = x;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return objA;
    }
}
