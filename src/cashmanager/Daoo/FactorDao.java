/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashmanager.Daoo;

import cashmanager.Dto.FactorItems;
import java.sql.SQLException;

/**
 *
 * @author a.rostami
 */
public interface FactorDao {
    
   public void AddfactorItems(FactorItems factoritem)throws SQLException, Exception; 
}
