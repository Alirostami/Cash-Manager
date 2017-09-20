/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashmanager.Dao.Impl;

import cashmanager.Daoo.FactorDao;
import cashmanager.Dto.FactorItems;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author a.rostami
 */
public class FactorDaoImpl implements FactorDao{

      private Connection con;
    private Statement stmt;

    public FactorDaoImpl() throws SQLException, Exception {
        con = SQLConnection.createConnection();
    }

    @Override
    public void AddfactorItems(FactorItems factorItems) throws SQLException, Exception {
        stmt = con.createStatement();
        String strDataQuery = "(";
        strDataQuery += factorItems.getFactorId() + ", " + factorItems.getProductId() + ")";
        String strQuery = "insert into factoritme (factorid , productid ) values " + strDataQuery + ";";
        stmt.execute(strQuery);
        stmt.close();
    }
}
