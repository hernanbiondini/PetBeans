package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.VacunaRefuerzo;

public class VacunaRefuerzoController extends EntityController {

    private static VacunaRefuerzoController vacunaRefuerzoController;
    private static final String QUERY_GET_ALL_VACUNA_REFUERZO = "vacunaRefuerzo.all";

    private VacunaRefuerzoController() {
    }

    public static VacunaRefuerzoController getInstance() {
        if (vacunaRefuerzoController == null) {
            vacunaRefuerzoController = new VacunaRefuerzoController();
        }
        return vacunaRefuerzoController;
    }

    public void guardar(VacunaRefuerzo vacunaRefuerzo) throws Exception {
        this.persist(vacunaRefuerzo);
    }

    public void actualizar(VacunaRefuerzo v) throws Exception {
        this.updateVacunaRefuerzo(v);
    }

    public void borrar(VacunaRefuerzo v) throws Exception {
        this.removeVacunaRefuerzo(v);
    }

    //Retorna todas las vacunas con refuerzo
    public List<VacunaRefuerzo> getAllVacunaRefuerzo() {
        return this.executeNamedQuery(QUERY_GET_ALL_VACUNA_REFUERZO);
    }

    public Date calcularPrimerRefuerzo(Date fechaColocacion) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaColocacion);
        cal.add(Calendar.DAY_OF_YEAR, 21);
        return cal.getTime();
    }

    public Date calcularSegundoRefuerzo(Date fechaColocacion) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaColocacion);
        cal.add(Calendar.DAY_OF_YEAR, 42);
        return cal.getTime();
    }

    public Date calcularTercerRefuerzo(Date fechaColocacion) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaColocacion);
        cal.add(Calendar.DAY_OF_YEAR, 63);
        return cal.getTime();
    }
    
    //Retorna todas las vacunas con refuerzo de una mascota
    public List<VacunaRefuerzo> getAllVacunaRefuerzoMascota(int id){
        System.out.println("controller "+ id);
        EntityManager em = this.getEntityManager();
        Query q = (Query) em.createQuery("SELECT c FROM VacunaRefuerzo c WHERE c.mascota.idMascota = ?1");
        q.setParameter(1, id);
        List <VacunaRefuerzo> al= q.getResultList();
        return al;
    }
    
    
    //Retorna todas las vacunas con refuerzo: primer refuerzo, de todas las mascotas de hoy
    public List<VacunaRefuerzo> getAllVacunaRefuerzoDia1() {
        //Primer refuerzo
            Date fechaHoy = new Date();
            Date hoy = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/DD"); 
            String fecha = formato.format(fechaHoy);
               
        try {
            hoy = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(VacunaAnualController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            EntityManager em = this.getEntityManager();
            Query q = (Query) em.createQuery("SELECT c FROM VacunaRefuerzo c WHERE c.proxColPrimerRef = ?1");
            q.setParameter(1, hoy);
            List <VacunaRefuerzo> al= q.getResultList();
            
        
        return al;
        
    }
    
    
           //Retorna todas las vacunas con refuerzo: segundo refuerzo, de todas las mascotas de hoy
    public List<VacunaRefuerzo> getAllVacunaRefuerzoDia2() {
        //Segundo refuerzo
            Date fechaHoy = new Date();
            Date hoy = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/DD"); 
            String fecha = formato.format(fechaHoy);
               
        try {
            hoy = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(VacunaAnualController.class.getName()).log(Level.SEVERE, null, ex);
        }
             
            EntityManager em = this.getEntityManager();
            Query q = (Query) em.createQuery("SELECT c FROM VacunaRefuerzo c WHERE c.proxColSegundoRef = ?1");
            q.setParameter(1, hoy);
            List <VacunaRefuerzo> al= q.getResultList();
            
        
        return al;
        
    }
    
    
         //Retorna todas las vacunas con refuerzo: tercer refuerzo, de todas las mascotas de hoy
    public List<VacunaRefuerzo> getAllVacunaRefuerzoDia3() {
        //Tercer refuerzo
            Date fechaHoy = new Date();
            Date hoy = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/DD"); 
            String fecha = formato.format(fechaHoy);
               
        try {
            hoy = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(VacunaAnualController.class.getName()).log(Level.SEVERE, null, ex);
        }
              
            EntityManager em = this.getEntityManager();
            Query q = (Query) em.createQuery("SELECT c FROM VacunaRefuerzo c WHERE c.proxColTercerRef = ?1");
            q.setParameter(1, hoy);
            List <VacunaRefuerzo> al= q.getResultList();
            
        
        return al;
        
    }
    
    
    
    
}
