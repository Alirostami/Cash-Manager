/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashmanager;
import cashmanager.Dao.Impl.CustomerDaoImpl;
import cashmanager.Daoo.CustomerDao;
import java.sql.SQLException;
import cashmanager.Dto.Customer;
import java.sql.Date;
/**
 *
 * @author a.rostamy
 */
public class CashManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
        try
        {
            CustomerDao customer= new CustomerDaoImpl();
            Date dt=new Date(2017,9,20);
            Customer customerDto=new Customer("0912", 1,dt);
            customer.CustomerRegister(customerDto);
        }
       catch (SQLException e) {
           System.out.println(e.getErrorCode());
        // Handle exception
        }
         catch (Exception e) {
             System.out.println(e.getMessage());;
        // Handle exception
        }
        finally{            
        }   
    }
    
}
