package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Alumno {
    private String nombre;
    private String apellido;
    private List<Materia> materiasAprobadas = new ArrayList<Materia>();

    public void agregarMateriaAprobada(Materia materiaNueva) {
        if (materiaNueva != null) {
            this.materiasAprobadas.add(materiaNueva);
        }
    }

}
