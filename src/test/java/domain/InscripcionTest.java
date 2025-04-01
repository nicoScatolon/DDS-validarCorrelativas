package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    @DisplayName("Test crear una materia con correlativas y el alumno no las tiene, da falso")
    public void CrearInscripcionFalso() {

        //ALUMNO
        Alumno alumno = new Alumno();
        alumno.setNombre("Franco");
        alumno.setApellido("Colapinto");


        //MATERIAS
        Materia fisica = new Materia();
        fisica.setNombre("Fisica");
        fisica.setCodigo(444);

        Materia analisisI = new Materia();
        analisisI.setNombre("Analisis Matematico I");
        analisisI.setCodigo(450);

        //CORRELATIVA
        Materia fisicaII = new Materia();
        fisicaII.setNombre("Fisica II");
        fisicaII.setCodigo(445);
        fisicaII.setCorrelativas(new HashSet<>(Set.of(analisisI, fisica)));

        //INSCRIPCIÓN
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setMateriasACursar(new HashSet<>(Set.of(fisicaII)));

        //VALIDACIÓN
        Assertions.assertFalse(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test crear una materia con correlativas y el alumno las tiene, da verdadero")
    public void CrearInscripcionValida(){

        //ALUMNO
        Alumno alumno = new Alumno();
        alumno.setNombre("Franco");
        alumno.setApellido("Colapinto");


        //MATERIAS
        Materia fisica = new Materia();
        fisica.setNombre("Fisica");
        fisica.setCodigo(444);

        Materia analisisI = new Materia();
        analisisI.setNombre("Analisis Matematico I");
        analisisI.setCodigo(450);

        //EL ALUMNO APRUEBA AMBAS
        alumno.agregarMateriaAprobada(analisisI);
        alumno.agregarMateriaAprobada(fisica);

        //CORRELATIVA
        Materia fisicaII = new Materia();
        fisicaII.setNombre("Fisica II");
        fisicaII.setCodigo(445);
        fisicaII.setCorrelativas(new HashSet<>(Set.of(analisisI, fisica)));

        //INSCRIPCIÓN
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setMateriasACursar(new HashSet<>(Set.of(fisicaII)));

        //VALIDACIÓN
        Assertions.assertTrue(inscripcion.aprobada());
    }
}