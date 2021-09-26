package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Desparasitacion;

public class DesparasitacionController extends EntityController {

    private static DesparasitacionController desparasitacionController;
    private static final String QUERY_GET_ALL_DESPARASITACION = "desparasitacion.all";

    private DesparasitacionController() {
    }

    public static DesparasitacionController getInstance() {
        if (desparasitacionController == null) {
            desparasitacionController = new DesparasitacionController();
        }
        return desparasitacionController;
    }

    public void guardar(Desparasitacion desparasitacion) throws Exception {
        this.persist(desparasitacion);
    }

    public void actualizar(Desparasitacion d) throws Exception {
        this.updateDesparasitacion(d);
    }

    public void borrar(Desparasitacion d) throws Exception {
        this.removeDesparasitacion(d);
    }

    //Retorna todas las vacunas anuales
    public List<Desparasitacion> getAllDesparasitacion() {
        return this.executeNamedQuery(QUERY_GET_ALL_DESPARASITACION);
    }

    public Date calcularProximaColocacion(Date fechaColocacion) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaColocacion);
        cal.add(Calendar.MONTH, 3);
        return cal.getTime();
    }


    //Retorna todes las desparacitaciones anuales de una mascota
    public List<Desparasitacion> getAllDesparasitacionMascota(int id) {
        EntityManager em = this.getEntityManager();
        Query q = (Query) em.createQuery("SELECT d FROM Desparasitacion d WHERE d.mascota.idMascota = ?1");
        q.setParameter(1, id);
        List<Desparasitacion> al = q.getResultList();
        // Recorrer coleccion y setear fecha
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        String strDate = "";   
        for(Desparasitacion v:al){
            if(v.getFechaColocacion()!= null){
                Date fc = v.getFechaColocacion();
                strDate = formatter.format(fc);   
                v.setFechaColocacionStr(strDate);
                System.out.println("strDate: " + strDate);
            }
            if(v.getProximaColocacion()!= null){
                Date fc = v.getProximaColocacion();
                strDate = formatter.format(fc);   
                v.setProximaColocacionStr(strDate);
            }
            
        }
        return al;
    }

    //Retorna todas las desparasitaciones anuales del dia de hoy.
    public List<Desparasitacion> getAllDesparasitacionDia() {

        Date fechaHoy = new Date();
        Date hoy = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/DD");
        String fecha = formato.format(fechaHoy);

        try {
            hoy = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(DesparasitacionController.class.getName()).log(Level.SEVERE, null, ex);
        }


        EntityManager em = this.getEntityManager();
        //Query q = (Query) em.createQuery("SELECT c FROM VacunaAnual c");
        Query q = (Query) em.createQuery("SELECT d FROM Desparasitacion d WHERE d.proximaColocacion = ?1");
        q.setParameter(1, hoy);

        List<Desparasitacion> al = q.getResultList();


        return al;

    }

    //Retorna todas las vacunas anuales del dia de hoy mas dos.
    public List<Desparasitacion> getAllDesparasitacionDiamasdos() {

        Date fechaHoy = new Date();
        Date hoy = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/DD");
        String fecha = formato.format(fechaHoy);

        try {
            hoy = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(DesparasitacionController.class.getName()).log(Level.SEVERE, null, ex);
        }


        Calendar cal = Calendar.getInstance();
        cal.setTime(hoy);
        cal.add(Calendar.HOUR, 48);
        hoy = cal.getTime();



        EntityManager em = this.getEntityManager();
        //Query q = (Query) em.createQuery("SELECT c FROM VacunaAnual c");
        Query q = (Query) em.createQuery("SELECT d FROM Desparasitacion d WHERE d.proximaColocacion = ?1");
        q.setParameter(1, hoy);

        List<Desparasitacion> al = q.getResultList();


        return al;

    }
}
