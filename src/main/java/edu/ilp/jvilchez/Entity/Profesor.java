package edu.ilp.jvilchez.Entity;

import javax.persistence.*;

@Entity
@Table(name="profesor")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Profesor extends Persona {

    @Column(name = "salario", length = 100, nullable = false)
    private Double salario;

    //CONSTRUCTOR VACIO

    public Profesor() {
    }

    //CONSTRUCTOR

    public Profesor(Double salario) {
        this.salario = salario;
    }

    public Profesor(String nombre, String telefono, String email, Double salario) {
        super(nombre, telefono, email);
        this.salario = salario;
    }

    //GETT Y SETTERS

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
