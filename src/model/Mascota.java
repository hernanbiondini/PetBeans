/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
@Table(name = "mascota")
@NamedQueries({
    @NamedQuery(name = "mascota.all", query = "SELECT m FROM Mascota m")
})
public class Mascota implements Cloneable, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDMASCOTA", nullable = false)
    private int idMascota;
    private String nombre;
    private String especie;
    private String raza;
    private String sexo;
    private String tamaño;
    private String color;
    private String señasParticulares;
    private String edad;
    private String numeroChip;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNacimiento;
    
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "foto", length = 16777215)
    private byte[] foto;
    
    @OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL)
    private Collection<Visita> visitas;
    @OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL)
    private Collection<Vacuna> vacunas;
    @OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL)
    private Collection<Desparasitacion> desparasitaciones;
    @JoinColumn(name = "PROPIETARIO_ID", referencedColumnName = "IDPROPIETARIO")
    @ManyToOne
    private Propietario propietario;

    public Mascota() {
        this.nombre = "";
        this.especie = "";
        this.raza = "";
        this.sexo = "";
        this.tamaño = "";
        this.color = "";
        this.señasParticulares = "";
        this.edad = "";
        this.numeroChip = "";
        this.propietario = new Propietario();
        this.visitas = new ArrayList<Visita>();
        this.vacunas = new ArrayList<Vacuna>();

    }

    public Collection<Desparasitacion> getDesparasitaciones() {
        return desparasitaciones;
    }

    public void setDesparasitaciones(Collection<Desparasitacion> desparasitaciones) {
        this.desparasitaciones = desparasitaciones;
    }
   
    public Collection<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(Collection<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdMascota() {
        return idMascota;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the tamaño
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the señasParticulares
     */
    public String getSeñasParticulares() {
        return señasParticulares;
    }

    /**
     * @param señasParticulares the señasParticulares to set
     */
    public void setSeñasParticulares(String señasParticulares) {
        this.señasParticulares = señasParticulares;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Collection<Visita> getVisitas() {
        return visitas;
    }

    public void setVisitas(Collection<Visita> visitas) {
        this.visitas = visitas;
    }

    public List<Visita> getVisitasList() {
        List<Visita> es = new ArrayList<Visita>();
        es.addAll(this.getVisitas());
        return es;
    }

    public void setVisitasList(List<Visita> v) {
        this.visitas.clear();
        this.visitas.addAll(v);
    }

    public String getNumeroChip() {
        return numeroChip;
    }

    public void setNumeroChip(String numeroChip) {
        this.numeroChip = numeroChip;
    }

    public boolean addVisita(Visita v) {
        return this.getVisitasList().add(v);
    }

    public boolean removeVisita(Visita v) {
        return this.getVisitas().remove(v);
    }

    public void clearVisitas() {
        this.getVisitas().clear();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascota other = (Mascota) obj;
        if (this.idMascota != other.idMascota) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.idMascota;
        return hash;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + '}';
    }
}
