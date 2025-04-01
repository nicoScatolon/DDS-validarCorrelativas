package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;


@Getter
@Setter

public class Inscripcion {
    private Alumno alumno;
    private Boolean fueAprobada;
    private Set<Materia> materiasACursar;

    public Boolean aprobada(){
        return materiasACursar.stream()
                .allMatch(materia -> materia.cumpleCorrelativas(alumno.getMateriasAprobadas()));
    }
}
