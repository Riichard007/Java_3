package com.unitec.amil;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class TestPojos {

    public static void main(String[] args) throws Exception{
        
        System.out.println("Vamos a probar todas las operaciones SQL");
        
        //1° paso: Crear el SessionFactory        
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
                
        //2° paso: Obtenemos la apertura de sesión actual
        Session sesion = factory.openSession();
        
        //3° paso: Creamos la transacción
        Transaction tranza = sesion.beginTransaction();
        
        //4° paso: Nos apuramos a hacer una transacción
        //ESTE ES UN INSERT
        Usuario u = new Usuario();
        u.setEmail("rs.amil@outlook.com");
        u.setNombre("Ricardo");
        u.setLogin("Amil");
        u.setPassword("hola123");
        sesion.save(u);
        tranza.commit();
        sesion.close();
        /*
        //Liberar la transacción y cerrar la sesión
        tranza.commit();
        sesion.close();
        */
        
        /*
        //ESTE ES UN UPDATE
        Usuario u = new Usuario();
        u.setId(1);
        u.setLogin("micky");
        u.setPassword("mouse");
        u.setNombre("Ricardo");
        u.setEmail("rs.amil@outlook.com");
        sesion.update(u);
        tranza.commit();
        sesion.close();
        System.out.println("Registro actualizado con éxito");
        */
        
        /*
        //ESTE ES UN SELECT POR ID
        Usuario u = (Usuario) sesion.createCriteria(Usuario.class).add(Restrictions.idEq(1)).uniqueResult();
        tranza.commit();
        sesion.close();
        System.out.println("El usuario elegido se llama: " + u.getNombre());
        
        
        List<Usuario> usuarios = sesion.createCriteria(Usuario.class).list();
        tranza.commit();
        sesion.close();
        for(Usuario usu:usuarios){
        System.out.println("Usuarios encontrados: " + usu.getNombre());
                
        }*/
    }
    
}
