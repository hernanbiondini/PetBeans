package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Visita;

public class VisitaController extends EntityController{

    private static VisitaController visitaController;
    private static final String QUERY_GET_ALL_VISITA = "visita.all";

    private VisitaController() {}

    public static VisitaController getInstance() {
        if (visitaController == null) {
            visitaController = new VisitaController();

        }
        return visitaController;
    }

    public void guardar(Visita v) throws Exception {
        this.persist(v);
    }

    public void borrar(Visita v) throws Exception {
        this.removeVisita(v);
    }

    public void actualizar(Visita v) throws Exception {
        this.updateVisita(v);
    }

    public List<Visita> getAllVisita() {
        return this.executeNamedQuery(QUERY_GET_ALL_VISITA);
    }

    public Visita llenarObjeto(Visita v) throws Exception {
        this.llenarVisita(v);
        return v;
    }
    
    public List<Visita> getAllVisitasMascota(int id){
        System.out.println("controller "+ id);
        EntityManager em = this.getEntityManager();
        Query q = (Query) em.createQuery("SELECT c FROM Visita c WHERE c.mascota.idMascota = ?1");
        q.setParameter(1, id);
        List <Visita> al= q.getResultList();
        
        // Recorrer coleccion y setear fecha
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        String strDate = "";   
        for(Visita v:al){
            if(v.getFecha()!= null){
                Date fc = v.getFecha();
                strDate = formatter.format(fc);   
                v.setFechaStr(strDate);
            }           
        }
        return al;
    }
    
 
}


