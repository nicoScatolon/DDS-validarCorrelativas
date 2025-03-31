package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter

public class Inscripcion {
    private Alumno alumno;
    private Boolean fueAprobada;
    private List<Materia> materiasACursar;

    public Boolean aprobada(){
        return materiasACursar.stream()
                .allMatch(materia -> materia.cumpleCorrelativas(alumno.getMateriasAprobadas()));
    }
}
