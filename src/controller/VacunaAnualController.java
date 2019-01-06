package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.VacunaAnual;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class VacunaAnualController extends EntityController{
    private static VacunaAnualController vacunaAnualController;
    private static final String QUERY_GET_ALL_VACUNA_ANUAL = "vacunaAnual.all";

    private VacunaAnualController(){}

    public static VacunaAnualController getInstance(){
        if(vacunaAnualController==null){
            vacunaAnualController = new VacunaAnualController();
        }
        return vacunaAnualController;
    }


    public void guardar(VacunaAnual vacunaAnual) throws Exception{
        this.persist(vacunaAnual);
    }

     public void actualizar(VacunaAnual v) throws Exception {
     this.updateVacunaAnual(v);
    }

      public void borrar(VacunaAnual v) throws Exception{
        this.removeVacunaAnual(v);
    }

      //Retorna todas las vacunas anuales
    public List<VacunaAnual> getAllVacunaAnual(){
        return this.executeNamedQuery(QUERY_GET_ALL_VACUNA_ANUAL);
    }

       public Date calcularProximaColocacion(Date fechaColocacion) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaColocacion);
        cal.add(Calendar.YEAR, 1);
        return cal.getTime();
    }
       
       //Retorna todes las vacunas anuales de una mascota
public List<VacunaAnual> getAllVacunaAnualMascota(int id){
        System.out.println("controller "+ id);
        EntityManager em = this.getEntityManager();
        Query q = (Query) em.createQuery("SELECT c FROM VacunaAnual c WHERE c.mascota.idMascota = ?1");
        q.setParameter(1, id);
        List <VacunaAnual> al= q.getResultList();
        return al;
    }


     //Retorna todas las vacunas anuales del dia de hoy.
public List<VacunaAnual> getAllVacunaAnualDia() {
        
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
            //Query q = (Query) em.createQuery("SELECT c FROM VacunaAnual c");
            Query q = (Query) em.createQuery("SELECT c FROM VacunaAnual c WHERE c.proximaColocacion = ?1");
            q.setParameter(1, hoy);
  
            List <VacunaAnual> al= q.getResultList();
            
        
        return al;
        
    }

      //Retorna todas las vacunas anuales del dia de hoy mas dos.
public List<VacunaAnual> getAllVacunaAnualDiamasdos() {
        
            
    
    
    
            Date fechaHoy = new Date();
            Date hoy = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/DD"); 
            String fecha = formato.format(fechaHoy);
               
        try {
            hoy = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(VacunaAnualController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(hoy);
            cal.add(Calendar.HOUR, 48);
            hoy = cal.getTime();
        
        
        
            EntityManager em = this.getEntityManager();
            //Query q = (Query) em.createQuery("SELECT c FROM VacunaAnual c");
            Query q = (Query) em.createQuery("SELECT c FROM VacunaAnual c WHERE c.proximaColocacion = ?1");
            q.setParameter(1, hoy);
  
            List <VacunaAnual> al= q.getResultList();
            
        
        return al;
        
    }


















}