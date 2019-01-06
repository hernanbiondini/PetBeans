package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Nota;

public class NotaController extends EntityController {

    private static NotaController notaController;
    private static final String QUERY_GET_ALL_NOTA = "nota.all";

    private NotaController() {
    }

    public static NotaController getInstance() {
        if (notaController == null) {
            notaController = new NotaController();
        }
        return notaController;
    }

    public void guardar(Nota nota) throws Exception {
        this.persist(nota);
    }

    public void actualizar(Nota n) throws Exception {
        this.updateNota(n);
    }

    public void borrar(Nota n) throws Exception {
        this.removeNota(n);
    }

    //Retorna todas las notas anuales
    public List<Nota> getAllNota() {
        return this.executeNamedQuery(QUERY_GET_ALL_NOTA);
    }


    //Retorna todas las notas anuales del dia de hoy.
    public List<Nota> getAllNotaDia() {

        Date fechaHoy = new Date();
        Date hoy = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/DD");
        String fecha = formato.format(fechaHoy);

        try {
            hoy = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(NotaController.class.getName()).log(Level.SEVERE, null, ex);
        }


        EntityManager em = this.getEntityManager();
        //Query q = (Query) em.createQuery("SELECT c FROM VacunaAnual c");
        Query q = (Query) em.createQuery("SELECT n FROM Nota n WHERE n.fechaNota = ?1");
        q.setParameter(1, hoy);

        List<Nota> al = q.getResultList();


        return al;

    }
    
        public void eliminarNotasVencidas() throws Exception {

        Date fechaHoy = new Date();
        Date hoy = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/DD");
        String fecha = formato.format(fechaHoy);

        try {
            hoy = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(NotaController.class.getName()).log(Level.SEVERE, null, ex);
        }

        EntityManager em = this.getEntityManager();
        Query q = (Query) em.createQuery("SELECT n FROM Nota n WHERE n.fechaNota < ?1");
        q.setParameter(1, hoy);

        List<Nota> al = q.getResultList();

            for (Nota n : al) {
                borrar(n);
            }
    }
    
}

