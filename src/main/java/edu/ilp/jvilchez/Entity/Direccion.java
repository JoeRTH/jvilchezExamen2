package edu.ilp.jvilchez.Entity;

import javax.persistence.*;

@Entity
@Table(name="direccion")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Direccion extends Persona {

    @Column(name = "calle")
    private String calle;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "estado")
    private String estado;

    @Column(name = "codigoPostal")
    private String codigoPostal;

    @Column(name = "pais")
    private String pais;

    //CONSTRUCTOR VACIO

    public Direccion() {
    }

    //CONSTRUCTOR

    public Direccion(String calle, String ciudad, String estado, String codigoPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public Direccion(String nombre, String telefono, String email, String calle, String ciudad, String estado, String codigoPostal, String pais) {
        super(nombre, telefono, email);
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    //GETT Y SETT

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
