package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;

@Entity
@Table(name = "nota")
@NamedQueries({
    @NamedQuery(name = "nota.all", query = "SELECT n FROM Nota n")
})
@PrimaryKeyJoinColumn(name = "idNota", referencedColumnName = "idNota")
public class Nota implements Cloneable, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDNOTA", nullable = false)
    private int idNota;
    private String titulo;
    private String descripcion;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNota;
    @Transient
    private String fechaNotaStr;

    public String getFechaNotaStr() {
        return fechaNotaStr;
    }

    public void setFechaNotaStr(String fechaNotaStr) {
        this.fechaNotaStr = fechaNotaStr;
    }

    public Nota() {
        this.titulo = "";
        this.descripcion = "";
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaNota() {
        return fechaNota;
    }

    public void setFechaNota(Date fechaNota) {
        this.fechaNota = fechaNota;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nota other = (Nota) obj;
        if (this.idNota != other.idNota) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.idNota;
        return hash;
    }

    public String toString() {
        return "Notas{" + "titulo=" + titulo + '}';
    }

}
