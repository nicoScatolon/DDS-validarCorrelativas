package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class Alumno {
    private String nombre;
    private String apellido;
    private Set<Materia> materiasAprobadas;

    public void agregarMateriaAprobada(Materia materiaNueva) {
        if (materiaNueva != null) {
            this.materiasAprobadas.add(materiaNueva);
        }
    }
}
