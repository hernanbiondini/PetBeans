package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="vacuna")
public class Vacuna implements Cloneable, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDVACUNA", nullable = false)
    private int idVacuna;
    private String nombreVacuna;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaColocacion;
    
    
    @JoinColumn(name = "MASCOTA_ID", referencedColumnName = "IDMASCOTA")
    @ManyToOne
    private Mascota mascota;

    public Vacuna() {
        this.nombreVacuna = "";
        this.mascota = new Mascota();
    }


    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }


    public Date getFechaColocacion() {
        return fechaColocacion;
    }

    public void setFechaColocacion(Date fechaColocacion) {
        this.fechaColocacion = fechaColocacion;
    }

    public int getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

 

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vacuna other = (Vacuna) obj;
        if (this.idVacuna != other.idVacuna) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idVacuna;
        return hash;
    }

 

    @Override
    public String toString() {
        return "Vacuna{" + "nombreVacuna=" + nombreVacuna + '}';
    }

    

}
