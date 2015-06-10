package com.unitec.amil;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAOUsuario {
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    static {
        factory = HibernateUtilidades.getSessionFactory();
        session = factory.openSession();
        tranza = session.beginTransaction();
    }
    
    public static void cerrarTodo(){
        tranza.commit();
        session.close();
    }
    
    public DAOUsuario(){
        
    }
    
    //Creamos el INSERT
    public void guardar(Usuario u) throws Exception{
        //Aquí va el código del INSERT, después invocas al método cerrarTodo
        session.save(u);
        cerrarTodo();
    }
    
    //Creamos el UPDATE
    public void actualizar(Usuario u) throws Exception{
        
    }
    
    //Creamos el buscarTodos
    public List<Usuario> buscarTodos() throws Exception{
        return null;
    }
    
    //Creamos el buscarPorId
    public Usuario buscarPorId(Integer id) throws Exception{
        return null;
    }
    
    //Creamos el de autenticar
    public boolean autenticar(Usuario u) throws Exception{
        return false;
    }
}
