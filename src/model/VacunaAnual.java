package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "vacunaAnual")
@NamedQueries({
    @NamedQuery(name="vacunaAnual.all",query="SELECT va FROM VacunaAnual va")
})
@PrimaryKeyJoinColumn(name = "idVacunaAnual", referencedColumnName = "idVacuna")
public class VacunaAnual extends Vacuna implements Cloneable, Serializable {

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date proximaColocacion;

    public VacunaAnual() {
        super();
    }

    public Date getProximaColocacion() {
        return proximaColocacion;
    }

    public void setProximaColocacion(Date proximacolocacion) {
        this.proximaColocacion = proximacolocacion;
    }
}
