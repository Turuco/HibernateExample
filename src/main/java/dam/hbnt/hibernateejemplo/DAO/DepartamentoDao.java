/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.hbnt.hibernateejemplo.DAO;

import dam.hbnt.hibernateejemplo.HibernateUtil;
import dam.hbnt.modelo.Departamentos;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author alumne
 */
public class DepartamentoDao {

    private SessionFactory factory = null;
    private Session sesion = null;

    public DepartamentoDao() {
        factory = HibernateUtil.getSessionFactory();
        sesion = factory.openSession();
    }

    public void addDepartment(byte cod, String name, String loc) {
        sesion.beginTransaction();
        sesion.save(new Departamentos(cod, name, loc));
        sesion.getTransaction().commit();
    }

    public Departamentos load(byte depno) {
        return sesion.get(Departamentos.class, (byte) depno);
    }

    public void removeDepartment(byte cod) {
        sesion.beginTransaction();
        Departamentos dpt = this.load(cod);
        sesion.delete(dpt);
        sesion.getTransaction().commit();

    }

    public void removeDepartment(Departamentos dpt) {
        sesion.beginTransaction();
        sesion.delete(dpt);
        sesion.getTransaction().commit();

    }

    public void updateDepartment(byte cod, String name, String loc) {
        sesion.beginTransaction();
        Departamentos dpt = this.load(cod);
        dpt.setDnombre(name);
        dpt.setLoc(loc);
        sesion.update(dpt);
        sesion.getTransaction().commit();

    }

    public void updateDepartment(Departamentos dpt) {
        sesion.beginTransaction();
        sesion.update(dpt);
        sesion.getTransaction().commit();

    }

    public void listDepartments() {
        Query query = sesion.createQuery("Select d from Departamentos d");
        List<Departamentos> depts = query.list();
        depts.forEach((dept) -> {
            System.out.println(dept.toString());
        });

    }

    public void test() {
        System.out.println("Test...");
        addDepartment((byte) 1, "Valencia", "Valencia");
        addDepartment((byte) 2, "Barcelona", "Barcelona");
        addDepartment((byte) 3, "Madrid", "Madrid");
        addDepartment((byte) 4, "Sevilla", "Sevilla");
        addDepartment((byte) 5, "Bilbao", "Bilbao");
        listDepartments();
        updateDepartment((byte) 4, "Sevilla*", "Sevilla");
        listDepartments();
        updateDepartment((byte) 2, "Barcelona", "Barna*");
        listDepartments();
        removeDepartment((byte) 1);
        removeDepartment((byte) 2);
        removeDepartment((byte) 3);
        listDepartments();
        removeDepartment((byte) 4);
        removeDepartment((byte) 5);
        listDepartments();

    }
}
