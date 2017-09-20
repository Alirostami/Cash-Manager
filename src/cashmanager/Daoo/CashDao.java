/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashmanager.Daoo;

import cashmanager.Dto.Factor;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author a.rostami
 */
public interface CashDao {
    
 public void CreateFactor(Factor factor) throws SQLException, Exception;
 public void FactorConfirmation(Factor factor) throws SQLException, Exception;
 public List<Factor> GetFactorList() throws SQLException, Exception;
 public List<Factor> GetFactorList(boolean flag,String date) throws SQLException, Exception;
 public int GetFactorSum(String date) throws SQLException, Exception;
 public List<Factor> ReportActive(String date)throws SQLException, Exception;
 
}
