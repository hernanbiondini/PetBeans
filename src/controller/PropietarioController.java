package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Propietario;

public class PropietarioController extends EntityController {
private static PropietarioController propietarioController;
    private static final String QUERY_GET_ALL_PROPIETARIO = "propietario.all";

    private PropietarioController(){}

    public static PropietarioController getInstance(){
        if(propietarioController ==null){
            propietarioController = new PropietarioController();
        }
        return propietarioController;
    }

    public void guardar(Propietario p) throws Exception{
           this.persist(p);
    }

   public void borrar(Propietario p) throws Exception{
        this.removePropietario(p);
    }

    public void actualizar(Propietario p) throws Exception{
        this.updatePropietario(p);
    }
    public List<Propietario> getAllPropietario(){
        return this.executeNamedQuery(QUERY_GET_ALL_PROPIETARIO);
    }

    public Propietario llenarObjeto(Propietario propietario) throws Exception {
        this.llenarPropietario(propietario);
        return propietario;
    }

    public List<Propietario> getAllPropietarioNombre(String nombre){
        nombre = "%" +nombre.trim() +"%";
        EntityManager em = this.getEntityManager();
        Query q = (Query) em.createQuery("SELECT c FROM Propietario c WHERE c.nombreDueño LIKE ?1");
        q.setParameter(1,nombre);
        List <Propietario> al= q.getResultList();
        return al;
    }

    public List<String> getAllPropietarioNombre(){
        EntityManager em = this.getEntityManager();
        Query q = (Query) em.createQuery("SELECT c.email FROM Propietario c WHERE c.email <> ''");
        //Query q = (Query) em.createQuery("SELECT email FROM Propietario c");
        List <String> al= q.getResultList();
        return al;
    }




}

