package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Mascota;

public class MascotaController extends EntityController {

    private static MascotaController mascotaController;
    private static final String QUERY_GET_ALL_MASCOTA = "mascota.all";

    private MascotaController() {
    }

    public static MascotaController getInstance() {
        if (mascotaController == null) {
            mascotaController = new MascotaController();
        }
        return mascotaController;
    }

    public void guardar(Mascota m) throws Exception {
        this.persist(m);
    }

    public void borrar(Mascota m) throws Exception {
        this.removeMascota(m);
    }

    public void actualizar(Mascota m) throws Exception {
        this.updateMascota(m);
    }

    public List<Mascota> getAllMascota() {
        return this.executeNamedQuery(QUERY_GET_ALL_MASCOTA);
    }

    public List<Mascota> getAllMascotas() {

        List<Mascota> al = new ArrayList();
        al = this.getAllMascota();

        for (Iterator<Mascota> it = al.iterator(); it.hasNext();) {
            Date fecha = new Date();
            Mascota m = it.next();
            fecha = m.getFechaNacimiento();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String f = formato.format(fecha);
            String edad = calcularEdad(f);
            int ed = Integer.parseInt(edad);
            if (ed < 0) {
                edad = "0";
            }
            m.setEdad(edad);
        }

        return al;
    }

    public List<Mascota> getAllMascotasDuenio(int id) {

        System.out.println("controller " + id);
        EntityManager em = this.getEntityManager();
        Query q = (Query) em.createQuery("SELECT c FROM Mascota c WHERE c.propietario.idPropietario = ?1");
        //Query q = (Query) em.createQuery("SELECT c FROM Mascota c WHERE c.propietario.idPropietario = :id");
        q.setParameter(1, id);
        List<Mascota> al = q.getResultList();
        for (Iterator<Mascota> it = al.iterator(); it.hasNext();) {
            Date fecha = new Date();
            Mascota m = it.next();
            fecha = m.getFechaNacimiento();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String f = formato.format(fecha);
            String edad = calcularEdad(f);
            int ed = Integer.parseInt(edad);
            if (ed < 0) {
                edad = "0";
            }
            m.setEdad(edad);
        }

        return al;
    }

    public List<Mascota> getAllMascotasDuenioLike(int id, String nombre) {
        nombre = "%" + nombre.trim() + "%";
        System.out.println("controller " + id);
        EntityManager em = this.getEntityManager();
        Query q = (Query) em.createQuery("SELECT c FROM Mascota c WHERE c.propietario.idPropietario = ?1 and c.nombre LIKE ?2");
        //Query q = (Query) em.createQuery("SELECT c FROM Mascota c WHERE c.propietario.idPropietario = :id");
        q.setParameter(1, id);
        q.setParameter(2, nombre);
        List<Mascota> al = q.getResultList();
        for (Iterator<Mascota> it = al.iterator(); it.hasNext();) {
            Date fecha = new Date();
            Mascota m = it.next();
            fecha = m.getFechaNacimiento();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String f = formato.format(fecha);
            String edad = calcularEdad(f);
            int ed = Integer.parseInt(edad);
            if (ed < 0) {
                edad = "0";
            }
            m.setEdad(edad);
        }

        return al;
    }

    public List<Mascota> getAllMascotasLike(String nombre) {
        nombre = "%" + nombre.trim() + "%";
        EntityManager em = this.getEntityManager();
        Query q = (Query) em.createQuery("SELECT c FROM Mascota c WHERE c.nombre LIKE ?1");
        q.setParameter(1, nombre);
        List<Mascota> al = q.getResultList();
        for (Iterator<Mascota> it = al.iterator(); it.hasNext();) {
            Date fecha = new Date();
            Mascota m = it.next();
            fecha = m.getFechaNacimiento();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String f = formato.format(fecha);
            String edad = calcularEdad(f);
            int ed = Integer.parseInt(edad);
            if (ed < 0) {
                edad = "0";
            }
            m.setEdad(edad);
        }

        return al;
    }

        public List<Mascota> getAllMascotasChip(String nombre) {
        nombre = "%" + nombre.trim() + "%";
        EntityManager em = this.getEntityManager();
        Query q = (Query) em.createQuery("SELECT c FROM Mascota c WHERE c.numeroChip LIKE ?1");
        q.setParameter(1, nombre);
        List<Mascota> al = q.getResultList();
        for (Iterator<Mascota> it = al.iterator(); it.hasNext();) {
            Date fecha = new Date();
            Mascota m = it.next();
            fecha = m.getFechaNacimiento();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String f = formato.format(fecha);
            String edad = calcularEdad(f);
            int ed = Integer.parseInt(edad);
            if (ed < 0) {
                edad = "0";
            }
            m.setEdad(edad);
        }

        return al;
    }
    
    private static String calcularEdad(String fechaNacimiento) {

        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String hoy = formato.format(fechaActual);
        String[] dat1 = fechaNacimiento.split("/");
        String[] dat2 = hoy.split("/");
        int años = Integer.parseInt(dat2[2]) - Integer.parseInt(dat1[2]);
        int mes = Integer.parseInt(dat2[1]) - Integer.parseInt(dat1[1]);
        if (mes < 0) {
            años = años - 1;
        } else if (mes == 0) {
            int dia = Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
            if (dia > 0) {
                años = años - 1;
            }
        }
        return Integer.toString(años);
    }

    public Mascota llenarObjeto(Mascota mascota) throws Exception {
        this.llenarMascota(mascota);
        return mascota;
    }
    
    
    
}
