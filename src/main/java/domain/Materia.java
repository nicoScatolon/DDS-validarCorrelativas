package domain;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Setter
@Getter
public class Materia {
    private String nombre;
    private Integer codigo;
    private Set<Materia> correlativas;

    public Boolean cumpleCorrelativas(List<Materia> materiasAprobadas) {
        return correlativas
                .stream()
                .allMatch(materiaCorrelativa ->
                        materiasAprobadas.stream()
                                .anyMatch(materiaAprobada -> materiaAprobada.codigo.equals(materiaCorrelativa.codigo))
                );
    }

    public void crearMateria(String nombre, Integer codigo, Set<Materia> correlativas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correlativas = correlativas;
    }
}
