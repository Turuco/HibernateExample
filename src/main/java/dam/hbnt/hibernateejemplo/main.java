/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.hbnt.hibernateejemplo;

import dam.hbnt.hibernateejemplo.DAO.DepartamentoDao;

/**
 *
 * @author alumne
 */
public class main {
    public static void main(String[] args) {
        DepartamentoDao dtest=new DepartamentoDao();
        dtest.test();
    }
    
}
