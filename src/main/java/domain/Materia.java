package domain;


import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
public class Materia {
    private String nombre;
    private Integer codigo;
    private Set<Materia> correlativas;

    public Boolean cumpleCorrelativas(Set<Materia> materiasAprobadas) {
        return materiasAprobadas.containsAll(this.correlativas);
    }

    public void crearMateria(String nombre, Integer codigo, Set<Materia> correlativas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correlativas = correlativas;
    }
}