package controller;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Desparasitacion;
import model.Mascota;
import model.Nota;
import model.Propietario;
import model.VacunaAnual;
import model.VacunaRefuerzo;
import model.Visita;
import util.Vernam;

public abstract class EntityController {

    public static final String PU = "veterinariaPU";
    private static EntityManagerFactory entityManagerFactory;
    Properties props;
    Vernam ver = new Vernam();
    String clave = "luftwaffepanzer6";

    public EntityManager getEntityManager() {
        return this.getEntityManagerFactory().createEntityManager();
    }

    private EntityManagerFactory getEntityManagerFactory() {
        //if (entityManagerFactory == null) {
        //entityManagerFactory = Persistence.createEntityManagerFactory(PU);
        conf();
        //entityManagerFactory = Persistence.createEntityManagerFactory(PU);
        entityManagerFactory = Persistence.createEntityManagerFactory(PU, props);
        //}
        return entityManagerFactory;
    }

    protected void persist(Object entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        entity = em.merge(entity);
        try {
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }

    }

    protected void persist(Object entity, EntityManager em) {
        em.persist(entity);
    }

    protected void removeMascota(Mascota entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {
            Mascota entityx = em.find(Mascota.class, entity.getIdMascota());
            em.remove(entityx);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected void removePropietario(Propietario entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {
            Propietario entityx = em.find(Propietario.class, entity.getIdPropietario());
            em.remove(entityx);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected void removeVisita(Visita entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {
            Visita entityx = em.find(Visita.class, entity.getIdVisita());
            em.remove(entityx);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected void updateMascota(Mascota entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {
            System.out.println("Id en entity controller: " + entity.getIdMascota());
            Mascota entityx = em.find(Mascota.class, entity.getIdMascota());
            entityx.setNombre(entity.getNombre());
            entityx.setEspecie(entity.getEspecie());
            entityx.setRaza(entity.getRaza());
            entityx.setSexo(entity.getSexo());
            entityx.setTamaño(entity.getTamaño());
            entityx.setColor(entity.getColor());
            entityx.setSeñasParticulares(entity.getSeñasParticulares());
            entityx.setFechaNacimiento(entity.getFechaNacimiento());
            entityx.setNumeroChip(entity.getNumeroChip());
            entityx.setFoto(entity.getFoto());
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected Propietario llenarPropietario(Propietario entity) throws Exception {
        EntityManager em = this.getEntityManager();
        Propietario entityx = (Propietario) em.find(Propietario.class, entity.getIdPropietario());
        entity.setCelular(entityx.getCelular());
        entity.setDireccion(entityx.getDireccion());
        entity.setEmail(entityx.getEmail());
        entity.setMascotas(entityx.getMascotas());
        entity.setNombreDueño(entityx.getNombreDueño());
        entity.setTelefonoFijo(entityx.getTelefonoFijo());
        em.close();
        return entity;
    }

    public Mascota llenarMascota(Mascota entity) throws Exception {
        EntityManager em = this.getEntityManager();
        Mascota entityx = (Mascota) em.find(Mascota.class, entity.getIdMascota());
        entity.setColor(entityx.getColor());
        entity.setEdad(entityx.getEdad());
        entity.setEspecie(entityx.getEspecie());
        entity.setFechaNacimiento(entityx.getFechaNacimiento());
        entity.setNombre(entityx.getNombre());
        entity.setPropietario(entityx.getPropietario());
        entity.setRaza(entityx.getRaza());
        entity.setSexo(entityx.getSexo());
        entity.setTamaño(entityx.getTamaño());
        entity.setNumeroChip(entityx.getNumeroChip());
        entity.setSeñasParticulares(entityx.getSeñasParticulares());
        if (entityx.getFoto() == null) {
            entity.setFoto(null);
        } else {
            entity.setFoto(entityx.getFoto());
        }

        em.close();
        return entity;
    }

    protected void updatePropietario(Propietario entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {

            Propietario entityx = em.find(Propietario.class, entity.getIdPropietario());
            entityx.setNombreDueño(entity.getNombreDueño());
            entityx.setDireccion(entity.getDireccion());
            entityx.setTelefonoFijo(entity.getTelefonoFijo());
            entityx.setCelular(entity.getCelular());
            entityx.setEmail(entity.getEmail());

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected void removeVacunaAnual(VacunaAnual entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {
            VacunaAnual entityx = em.find(VacunaAnual.class, entity.getIdVacuna());
            em.remove(entityx);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected void removeDesparasitacion(Desparasitacion entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {
            Desparasitacion entityx = em.find(Desparasitacion.class, entity.getIdDesparasitacion());
            em.remove(entityx);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected void removeNota(Nota entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {
            Nota entityx = em.find(Nota.class, entity.getIdNota());
            em.remove(entityx);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected void removeVacunaRefuerzo(VacunaRefuerzo entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {
            VacunaRefuerzo entityx = em.find(VacunaRefuerzo.class, entity.getIdVacuna());
            em.remove(entityx);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected void updateVacunaRefuerzo(VacunaRefuerzo entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {

            VacunaRefuerzo entityx = em.find(VacunaRefuerzo.class, entity.getIdVacuna());
            entityx.setNombreVacuna(entity.getNombreVacuna());
            entityx.setFechaColocacion(entity.getFechaColocacion());
            entityx.setPrimerRefuerzo(entity.getPrimerRefuerzo());
            entityx.setSegundoRefuerzo(entity.getSegundoRefuerzo());
            entityx.setTercerRefuerzo(entity.getTercerRefuerzo());

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected void updateVacunaAnual(VacunaAnual entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {

            VacunaAnual entityx = em.find(VacunaAnual.class, entity.getIdVacuna());
            entityx.setNombreVacuna(entity.getNombreVacuna());
            entityx.setFechaColocacion(entity.getFechaColocacion());

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected void updateDesparasitacion(Desparasitacion entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {

            Desparasitacion entityx = em.find(Desparasitacion.class, entity.getIdDesparasitacion());
            entityx.setNombreDesparasitante(entity.getNombreDesparasitante());
            entityx.setFechaColocacion(entity.getFechaColocacion());

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected void updateNota(Nota entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {
            Nota entityx = em.find(Nota.class, entity.getIdNota());
            entityx.setTitulo(entity.getTitulo());
            entityx.setDescripcion(entity.getDescripcion());
            entityx.setFechaNota(entity.getFechaNota());

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected void updateVisita(Visita entity) throws Exception {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        try {
            System.out.println("Id en entity controller: " + entity.getIdVisita());
            Visita entityx = em.find(Visita.class, entity.getIdVisita());
            entityx.setFecha(entity.getFecha());
            entityx.setTemperatura(entity.getTemperatura());
            entityx.setFr(entity.getFr());
            entityx.setFc(entity.getFc());
            entityx.setHidratacion(entity.getHidratacion());
            entityx.setAspectogeneral(entity.getAspectogeneral());
            entityx.setGangliosLinfaticos(entity.getGangliosLinfaticos());
            entityx.setRespiratorio(entity.getRespiratorio());
            entityx.setCirculatorio(entity.getCirculatorio());
            entityx.setPiel(entity.getPiel());
            entityx.setOjos(entity.getOjos());
            entityx.setDigestivo(entity.getDigestivo());
            entityx.setMusculoEsqueletico(entity.getMusculoEsqueletico());
            entityx.setMucosas(entity.getMucosas());
            entityx.setOidos(entity.getOidos());
            entityx.setGenitoUrinario(entity.getGenitoUrinario());
            entityx.setSistemaNervioso(entity.getSistemaNervioso());
            entityx.setAnormalidades(entity.getAnormalidades());
            entityx.setMotivoConsulta(entity.getMotivoConsulta());
            entityx.setAntecedentesEnfermedad(entity.getAntecedentesEnfermedad());
            entityx.setAntecedentesMedicos(entity.getAntecedentesMedicos());
            entityx.setAntecedentesQuirurgicos(entity.getAntecedentesQuirurgicos());
            entityx.setAntecedentesTraumatologicos(entity.getAntecedentesTraumatologicos());
            entityx.setDesparasitaciones(entity.getDesparasitaciones());
            entityx.setAmbientales(entity.getAmbientales());
            entityx.setDiagnostico(entity.getDiagnostico());
            entityx.setTratamiento(entity.getTratamiento());
            entityx.setObservaciones(entity.getObservaciones());
            entityx.setPeso(entity.getPeso());
            entityx.setTipoPeso(entity.getTipoPeso());

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    protected List executeNamedQuery(String queryName) {
        EntityManager em = this.getEntityManager();
        List resultList = this.executeNamedQuery(queryName, em);
        em.close();
        return resultList;
    }

    protected List executeNamedQuery(String queryName, EntityManager em) {
        javax.persistence.Query query = em.createNamedQuery(queryName);
        List resultList = query.getResultList();
        return resultList;
    }

    public Visita llenarVisita(Visita entity) throws Exception {

        EntityManager em = this.getEntityManager();
        Visita entityx = em.find(Visita.class, entity.getIdVisita());
        entity.setFecha(entityx.getFecha());
        entity.setTemperatura(entityx.getTemperatura());
        entity.setMascota(entityx.getMascota());
        entity.setFr(entityx.getFr());
        entity.setFc(entityx.getFc());
        entity.setHidratacion(entityx.getHidratacion());
        entity.setAspectogeneral(entityx.getAspectogeneral());
        entity.setGangliosLinfaticos(entityx.getGangliosLinfaticos());
        entity.setRespiratorio(entityx.getRespiratorio());
        entity.setCirculatorio(entityx.getCirculatorio());
        entity.setPiel(entityx.getPiel());
        entity.setOjos(entityx.getOjos());
        entity.setDigestivo(entityx.getDigestivo());
        entity.setMusculoEsqueletico(entityx.getMusculoEsqueletico());
        entity.setMucosas(entityx.getMucosas());
        entity.setOidos(entityx.getOidos());
        entity.setGenitoUrinario(entityx.getGenitoUrinario());
        entity.setSistemaNervioso(entityx.getSistemaNervioso());
        entity.setAnormalidades(entityx.getAnormalidades());
        entity.setMotivoConsulta(entityx.getMotivoConsulta());
        entity.setAntecedentesEnfermedad(entityx.getAntecedentesEnfermedad());
        entity.setAntecedentesMedicos(entityx.getAntecedentesMedicos());
        entity.setAntecedentesQuirurgicos(entityx.getAntecedentesQuirurgicos());
        entity.setAntecedentesTraumatologicos(entityx.getAntecedentesTraumatologicos());
        entity.setDesparasitaciones(entityx.getDesparasitaciones());
        entity.setAmbientales(entityx.getAmbientales());
        entity.setDiagnostico(entityx.getDiagnostico());
        entity.setTratamiento(entityx.getTratamiento());
        entity.setObservaciones(entityx.getObservaciones());
        entity.setPeso(entityx.getPeso());
        entity.setTipoPeso(entityx.getTipoPeso());
        em.close();
        return entity;
    }

    public VacunaRefuerzo llenarVacunaRefuerzo(VacunaRefuerzo entity) throws Exception {
        EntityManager em = this.getEntityManager();
        VacunaRefuerzo entityx = (VacunaRefuerzo) em.find(VacunaRefuerzo.class, entity.getIdVacuna());
        entity.setNombreVacuna(entityx.getNombreVacuna());
        entity.setFechaColocacion(entityx.getFechaColocacion());
        entity.setPrimerRefuerzo(entityx.getPrimerRefuerzo());
        entity.setSegundoRefuerzo(entityx.getSegundoRefuerzo());
        entity.setTercerRefuerzo(entityx.getTercerRefuerzo());
        em.close();
        return entity;
    }

    public VacunaAnual llenarVacunaAnual(VacunaAnual entity) throws Exception {
        EntityManager em = this.getEntityManager();
        VacunaAnual entityx = (VacunaAnual) em.find(VacunaAnual.class, entity.getIdVacuna());
        entity.setNombreVacuna(entityx.getNombreVacuna());
        entity.setFechaColocacion(entityx.getFechaColocacion());

        em.close();
        return entity;
    }

    public Desparasitacion llenarDesparasitacion(Desparasitacion entity) throws Exception {
        EntityManager em = this.getEntityManager();
        Desparasitacion entityx = (Desparasitacion) em.find(Desparasitacion.class, entity.getIdDesparasitacion());
        entity.setNombreDesparasitante(entityx.getNombreDesparasitante());
        entity.setFechaColocacion(entityx.getFechaColocacion());

        em.close();
        return entity;
    }

    public Nota llenarNota(Nota entity) throws Exception {
        EntityManager em = this.getEntityManager();
        Nota entityx = (Nota) em.find(Nota.class, entity.getIdNota());
        entity.setTitulo(entityx.getTitulo());
        entity.setDescripcion(entityx.getDescripcion());
        entity.setFechaNota(entityx.getFechaNota());

        em.close();
        return entity;
    }

    public void conf() {

        String url, user, password, driver, hibercacheprovider, hiberstrategygen;
        try {
            Properties p = new Properties();
            p.load(new FileInputStream("conf.ini"));
            url = ver.desencriptar(p.getProperty("Ruta"), clave);
            user = ver.desencriptar(p.getProperty("Usuario"), clave);
            password = ver.desencriptar(p.getProperty("Password"), clave);
            driver = ver.desencriptar(p.getProperty("Driver"), clave);
            hibercacheprovider = ver.desencriptar(p.getProperty("hibernate.cache.provider_class"), clave);
            hiberstrategygen = ver.desencriptar(p.getProperty("hibernate.hbm2ddl.auto"), clave);

            System.out.println(url + " - " + user + " - " + password + " - " + driver + " - " + hibercacheprovider + " - " + hiberstrategygen);

            props = new Properties();
            props.put("javax.persistence.jdbc.user", user);
            props.put("javax.persistence.jdbc.driver", driver);
            props.put("javax.persistence.jdbc.password", password);
            props.put("javax.persistence.jdbc.url", url);
            props.put("hibernate.cache.provider_class", hibercacheprovider);
            props.put("javax.persistence.schema-generation.database.action", hiberstrategygen);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void conf2() {

        String url = null, user = null, password = null, driver = null, hibercacheprovider = null, hiberstrategygen = null;
        try {

            url = "jdbc:mysql://localhost:3306/veterinaria";
            user = "root";
            password = "root";
            driver = "com.mysql.jdbc.Driver";
            hibercacheprovider = "org.hibernate.cache.NoCacheProvider";
            hiberstrategygen = "create";

            System.out.println(url + " - " + user + " - " + password + " - " + driver + " - " + hibercacheprovider + " - " + hiberstrategygen);
            
            props = new Properties();
            props.put("javax.persistence.jdbc.user", user);
            props.put("javax.persistence.jdbc.driver", driver);
            props.put("javax.persistence.jdbc.password", password);
            props.put("javax.persistence.jdbc.url", url);
            props.put("hibernate.cache.provider_class", hibercacheprovider);
            props.put("javax.persistence.schema-generation.database.action", hiberstrategygen);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
