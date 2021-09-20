/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;

@Entity
@Table(name = "visita")
@NamedQueries({
    @NamedQuery(name = "visita.all", query = "SELECT v FROM Visita v")
})
public class Visita implements Cloneable, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private int idVisita;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    @Transient
    private String fechaStr;
    private String temperatura;
    private String fr;
    private String fc;
    private String hidratacion;
    private String aspectogeneral;
    private String gangliosLinfaticos;
    private String respiratorio;
    private String circulatorio;
    private String piel;
    private String ojos;
    private String digestivo;
    private String musculoEsqueletico;
    private String mucosas;
    private String oidos;
    private String genitoUrinario;
    private String sistemaNervioso;
    private String anormalidades;
    private String motivoConsulta;
    private String antecedentesEnfermedad;
    private String antecedentesMedicos;
    private String antecedentesQuirurgicos;
    private String antecedentesTraumatologicos;
    private String desparasitaciones;
    private String ambientales;
    @Column(length = 1024)
    private String diagnostico;
    @Column(length = 1024)
    private String tratamiento;
    @Column(length = 1024)
    private String observaciones;
    private String peso;
    private String tipoPeso;

    @JoinColumn(name = "MASCOTA_ID", referencedColumnName = "IDMASCOTA")
    @ManyToOne
    private Mascota mascota;

    public Visita(){
        this.temperatura = "";
        this.fr = "";
        this.fc = "";
        this.hidratacion = "";
        this.aspectogeneral = "";
        this.gangliosLinfaticos = "";
        this.respiratorio = "";
        this.circulatorio = "";
        this.piel = "";
        this.ojos = "";
        this.digestivo = "";
        this.musculoEsqueletico = "";
        this.mucosas = "";
        this.oidos = "";
        this.genitoUrinario = "";
        this.sistemaNervioso = "";
        this.anormalidades = "";
        this.motivoConsulta = "";
        this.antecedentesEnfermedad = "";
        this.antecedentesMedicos = "";
        this.antecedentesQuirurgicos = "";
        this.antecedentesTraumatologicos = "";
        this.desparasitaciones = "";
        this.ambientales = "";
        this.diagnostico = "";
        this.tratamiento = "";
        this.observaciones = "";
        this.peso = "";
        this.tipoPeso = "";
        this.mascota = new Mascota();
    }


    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public String getAmbientales() {
        return ambientales;
    }

    public void setAmbientales(String ambientales) {
        this.ambientales = ambientales;
    }

    public String getAnormalidades() {
        return anormalidades;
    }

    public void setAnormalidades(String anormalidades) {
        this.anormalidades = anormalidades;
    }

    public String getAntecedentesEnfermedad() {
        return antecedentesEnfermedad;
    }

    public void setAntecedentesEnfermedad(String antecedentesEnfermedad) {
        this.antecedentesEnfermedad = antecedentesEnfermedad;
    }

    public String getAntecedentesMedicos() {
        return antecedentesMedicos;
    }

    public void setAntecedentesMedicos(String antecedentesMedicos) {
        this.antecedentesMedicos = antecedentesMedicos;
    }

    public String getAntecedentesQuirurgicos() {
        return antecedentesQuirurgicos;
    }

    public void setAntecedentesQuirurgicos(String antecedentesQuirurgicos) {
        this.antecedentesQuirurgicos = antecedentesQuirurgicos;
    }

    public String getAntecedentesTraumatologicos() {
        return antecedentesTraumatologicos;
    }

    public void setAntecedentesTraumatologicos(String antecedentesTraumatologicos) {
        this.antecedentesTraumatologicos = antecedentesTraumatologicos;
    }

    public String getAspectogeneral() {
        return aspectogeneral;
    }

    public void setAspectogeneral(String aspectogeneral) {
        this.aspectogeneral = aspectogeneral;
    }

    public String getCirculatorio() {
        return circulatorio;
    }

    public void setCirculatorio(String circulatorio) {
        this.circulatorio = circulatorio;
    }

    public String getDesparasitaciones() {
        return desparasitaciones;
    }

    public void setDesparasitaciones(String desparasitaciones) {
        this.desparasitaciones = desparasitaciones;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDigestivo() {
        return digestivo;
    }

    public void setDigestivo(String digestivo) {
        this.digestivo = digestivo;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

      public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getGangliosLinfaticos() {
        return gangliosLinfaticos;
    }

    public void setGangliosLinfaticos(String gangliosLinfaticos) {
        this.gangliosLinfaticos = gangliosLinfaticos;
    }

    public String getGenitoUrinario() {
        return genitoUrinario;
    }

    public void setGenitoUrinario(String genitoUrinario) {
        this.genitoUrinario = genitoUrinario;
    }

    public String getHidratacion() {
        return hidratacion;
    }

    public void setHidratacion(String hidratacion) {
        this.hidratacion = hidratacion;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getMucosas() {
        return mucosas;
    }

    public void setMucosas(String mucosas) {
        this.mucosas = mucosas;
    }

    public String getMusculoEsqueletico() {
        return musculoEsqueletico;
    }

    public void setMusculoEsqueletico(String musculoEsqueletico) {
        this.musculoEsqueletico = musculoEsqueletico;
    }

    public String getOidos() {
        return oidos;
    }

    public void setOidos(String oidos) {
        this.oidos = oidos;
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public String getRespiratorio() {
        return respiratorio;
    }

    public void setRespiratorio(String respiratorio) {
        this.respiratorio = respiratorio;
    }

    public String getSistemaNervioso() {
        return sistemaNervioso;
    }

    public void setSistemaNervioso(String sistemaNervioso) {
        this.sistemaNervioso = sistemaNervioso;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipoPeso() {
        return tipoPeso;
    }

    public void setTipoPeso(String tipoPeso) {
        this.tipoPeso = tipoPeso;
    }

    public String getFechaStr() {
        return fechaStr;
    }

    public void setFechaStr(String fechaStr) {
        this.fechaStr = fechaStr;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Visita other = (Visita) obj;
        if (this.idVisita != other.idVisita) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.idVisita;
        return hash;
    }

    @Override
    public String toString() {
         return "Visita";
//        return "Visita{" + "fecha=" + fecha + "mascota=" + mascota.getNombre() + '}';
    }
}
