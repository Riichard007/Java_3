package com.unitec.amil;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DAOUsuario {

    static SessionFactory factory;
    static Session session;
    static Transaction tranza;

    public static void abrirSesion() {
        factory = HibernateUtilidades.getSessionFactory();
        session = factory.openSession();
        tranza = session.beginTransaction();
    }

    public static void cerrarSesion() {
        tranza.commit();
        session.close();
    }

    public DAOUsuario() {

    }

    //Creamos el INSERT
    public void guardar(Usuario u) throws Exception {
        //Aquí va el código del INSERT, después invocas al método cerrarTodo
        abrirSesion();
        session.save(u);
        cerrarSesion();
    }

    //Creamos el UPDATE
    public void actualizar(Usuario u) throws Exception {
        abrirSesion();
        session.update(u);
        cerrarSesion();
    }

    //Creamos el buscarTodos
    public List<Usuario> buscarTodos() throws Exception {
        abrirSesion();
        List<Usuario> usuarios = session.createCriteria(Usuario.class).list();
        return usuarios;
    }

    //Creamos el buscarPorId
    public Usuario buscarPorId(Integer id) throws Exception {
        Usuario u = (Usuario) session.createCriteria(Usuario.class).add(Restrictions.idEq(1)).uniqueResult();
        cerrarSesion();
        System.out.println("El usuario buscado es: " + u.getNombre());
        return null;
    }

    //Creamos el de autenticar
    public boolean autenticar(Usuario u) throws Exception {
        return false;
    }
}
