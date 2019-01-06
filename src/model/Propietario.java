package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "propietario")
@NamedQueries({
    @NamedQuery(name = "propietario.all", query = "SELECT p FROM Propietario p")
})
public class Propietario implements Cloneable, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDPROPIETARIO", nullable = false)
    private int idPropietario;
    private String nombreDueño;
    private String direccion;
    private String telefonoFijo;
    private String celular;
    private String email;
    @OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL)
    private Collection<Mascota> mascotas;

    public Propietario() {
        this.nombreDueño = "";
        this.direccion = "";
        this.telefonoFijo = "";
        this.celular = "";
        this.email = "";
        this.mascotas = new ArrayList<Mascota>();
    }

    public Collection<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(Collection<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    
    public int getIdPropietario() {
        return idPropietario;
    }

    public String getCelular() {
        return celular;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }


    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Propietario other = (Propietario) obj;
        if (this.idPropietario != other.idPropietario) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.idPropietario;
        return hash;
    }

    @Override
    public String toString() {
        return nombreDueño;
    }
}
