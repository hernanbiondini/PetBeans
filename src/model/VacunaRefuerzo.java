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
@Table(name = "vacunaRefuerzo")
@NamedQueries({
    @NamedQuery(name="vacunaRefuerzo.all",query="SELECT vr FROM VacunaRefuerzo vr")
})
@PrimaryKeyJoinColumn(name="idVacunaRefuerzo", referencedColumnName="idVacuna")

public class VacunaRefuerzo extends Vacuna implements Cloneable, Serializable{

    private String primerRefuerzo;
    private String segundoRefuerzo;
    private String tercerRefuerzo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date proxColPrimerRef;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date proxColSegundoRef;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date proxColTercerRef;

    public VacunaRefuerzo() {
        super();
        this.primerRefuerzo = "No";
        this.segundoRefuerzo = "No";
        this.tercerRefuerzo = "NO";
    }

    public String getPrimerRefuerzo() {
        return primerRefuerzo;
    }

    public void setPrimerRefuerzo(String PrimerRefuerzo) {
        this.primerRefuerzo = PrimerRefuerzo;
    }

    public String getSegundoRefuerzo() {
        return segundoRefuerzo;
    }

    public void setSegundoRefuerzo(String SegundoRefuerzo) {
        this.segundoRefuerzo = SegundoRefuerzo;
    }

    public String getTercerRefuerzo() {
        return tercerRefuerzo;
    }

    public void setTercerRefuerzo(String TercerRefuerzo) {
        this.tercerRefuerzo = TercerRefuerzo;
    }

    public Date getProxColPrimerRef() {
        return proxColPrimerRef;
    }

    public void setProxColPrimerRef(Date proxColPrimerRef) {
        this.proxColPrimerRef = proxColPrimerRef;
    }

    public Date getProxColSegundoRef() {
        return proxColSegundoRef;
    }

    public void setProxColSegundoRef(Date proxColSegundoRef) {
        this.proxColSegundoRef = proxColSegundoRef;
    }

    public Date getProxColTercerRef() {
        return proxColTercerRef;
    }

    public void setProxColTercerRef(Date proxColTercerRef) {
        this.proxColTercerRef = proxColTercerRef;
    }

}
