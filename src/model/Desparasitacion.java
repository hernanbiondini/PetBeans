package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "desparasitacion")
@NamedQueries({
    @NamedQuery(name="desparasitacion.all",query = "SELECT d FROM Desparasitacion d")
})
@PrimaryKeyJoinColumn(name = "idDesparasitacion", referencedColumnName = "idDesparasitacion")
public class Desparasitacion implements Cloneable, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDDESPARASITACION", nullable = false)
    private int idDesparasitacion;
    private String nombreDesparasitante;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaColocacion;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date proximaColocacion;
    
        
    @JoinColumn(name = "MASCOTA_ID", referencedColumnName = "IDMASCOTA")
    @ManyToOne
    private Mascota mascota;
    
    public Desparasitacion() {
        this.nombreDesparasitante = "";
        this.mascota = new Mascota();
    }

    public int getIdDesparasitacion() {
        return idDesparasitacion;
    }

    public void setIdDesparasitacion(int idDesparasitacion) {
        this.idDesparasitacion = idDesparasitacion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public Date getProximaColocacion() {
        return proximaColocacion;
    }

    public void setProximaColocacion(Date proximacolocacion) {
        this.proximaColocacion = proximacolocacion;
    }

    public Date getFechaColocacion() {
        return fechaColocacion;
    }

    public void setFechaColocacion(Date fechaColocacion) {
        this.fechaColocacion = fechaColocacion;
    }

    public String getNombreDesparasitante() {
        return nombreDesparasitante;
    }

    public void setNombreDesparasitante(String nombreDesparasitante) {
        this.nombreDesparasitante = nombreDesparasitante;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Desparasitacion other = (Desparasitacion) obj;
        if (this.idDesparasitacion != other.idDesparasitacion) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idDesparasitacion;
        return hash;
    }

    @Override
    public String toString() {
        return "Desparasitacion{" + "nombreDesparasitante=" + nombreDesparasitante + '}';
    }
   
}
