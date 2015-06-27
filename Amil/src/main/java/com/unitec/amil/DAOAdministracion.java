package com.unitec.amil;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAOAdministracion {
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    
    public static void abrirSesion() {
        factory = HibernateUtilidades.getSessionFactory();
        session = factory.openSession();
        tranza = session.beginTransaction();
    }
    
    public static void cerrarTodo(){
        tranza.commit();
        session.close();
    }
    
    public DAOAdministracion(){
        
    }
    
    //Creamos el INSERT
    public void guardar(Administracion u) throws Exception{
        //Aquí va el código del INSERT, después invocas al método cerrarTodo
        abrirSesion();
        session.save(u);
        cerrarTodo();
    }
    
    //Creamos el UPDATE
    public void actualizar(Administracion u) throws Exception{
        abrirSesion();
        session.update(u);
        cerrarTodo();
    }
    
    //Creamos el buscarTodos
    public List<Administracion> buscarTodos() throws Exception{
        return null;
    }
    
    //Creamos el buscarPorId
    public Administracion buscarPorId(Integer id) throws Exception{
        return null;
    }
    
    //Creamos el de autenticar
    public boolean autenticar(Administracion u) throws Exception{
        return false;
    }
}
