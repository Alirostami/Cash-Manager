/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashmanager.Dao.Impl;

import cashmanager.Dto.Customer;
import cashmanager.Daoo.CustomerDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author a.rostami
 */
public class CustomerDaoImpl implements CustomerDao {
   private Connection con;
   private Statement stmt;

    public CustomerDaoImpl() throws SQLException, Exception {
        con = SQLConnection.createConnection();
    }

    @Override
    public void CustomerRegister(Customer customer) throws SQLException, Exception {
        stmt = con.createStatement();
        String strDataQuery = "('";
        strDataQuery += customer.getPhoneNumber() + "', '" + customer.getSex() + "', " + customer.getDate()+ ")";
        String strQuery = "insert into Customer (phonenumber,sex,birthdate) values " + strDataQuery + ";";
        stmt.execute(strQuery);
        stmt.close();
        }  
}
