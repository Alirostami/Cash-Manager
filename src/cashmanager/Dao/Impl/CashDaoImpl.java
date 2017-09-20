/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashmanager.Dao.Impl;

import cashmanager.Daoo.CashDao;
import cashmanager.Dto.Factor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author a.rostami
 */
public class CashDaoImpl implements CashDao {

    private Connection con;
    private Statement stmt;

    public CashDaoImpl() throws SQLException, Exception {
        con = SQLConnection.createConnection();
    }

    @Override
    public void CreateFactor(Factor factor) throws SQLException, Exception {
        stmt = con.createStatement();
        String strDataQuery = "('";
        strDataQuery += factor.getTotalPrice() + "', '" + factor.getCashId() + "', '" + factor.getCustomerId()  + "', " + factor.getActive() + ")";
        String strQuery = "insert into factor (totalprice,cashid,customerid,active) values " + strDataQuery + ";";
        stmt.execute(strQuery);
        stmt.close();
    }

    @Override
    public void FactorConfirmation(Factor factor) throws SQLException, Exception {
        stmt = con.createStatement();
        int activeflag = 0;
        if(factor!=null)
          activeflag =factor.getActive();
        String strQuery = "UPDATE factor set=active=" + activeflag + ";";
        stmt.execute(strQuery);
        stmt.close();
    }

    @Override
    public List<Factor> GetFactorList() throws SQLException, Exception {
        List<Factor> FactorList = null;
        stmt = con.createStatement();
        String strQuery = "select * from factor;";
        ResultSet rs = stmt.executeQuery(strQuery);
        while (rs.next()) {
            Factor factor = new Factor();
            factor.setId(Integer.parseInt(rs.getString("id")));
            factor.setTotalPrice(Integer.parseInt(rs.getString("totalprice")));
            factor.setCashId(Integer.parseInt(rs.getString("cashId")));
            factor.setCustomerId(Integer.parseInt(rs.getString("customerId")));
            factor.setActive(Integer.parseInt((rs.getString("active"))));
            FactorList.add(factor);
        }
        stmt.close();
        return FactorList;
    }

    @Override
    public List<Factor> GetFactorList(boolean flag, String date) throws SQLException, Exception {
        List<Factor> FactorList = null;
        stmt = con.createStatement();
        String strQuery = "select * from factor where active=" + flag + ", factordate=" + date;
        ResultSet rs = stmt.executeQuery(strQuery);
        while (rs.next()) {
            Factor factor = new Factor();
            factor.setId(Integer.parseInt(rs.getString("id")));
            factor.setTotalPrice(Integer.parseInt(rs.getString("totalprice")));
            factor.setCashId(Integer.parseInt(rs.getString("cashId")));
            factor.setCustomerId(Integer.parseInt(rs.getString("customerId")));
            factor.setActive(Integer.parseInt((rs.getString("active"))));
            FactorList.add(factor);
        }
        stmt.close();
        return FactorList;
    }

    @Override
    public int GetFactorSum(String date) throws SQLException, Exception {
        stmt = con.createStatement();
        int count = 0;
        String strQuery = "select sum(totalprice) as totalcount,cashid from factor where factordate=" + date + " GROUP BY  cashid";
        ResultSet rs = stmt.executeQuery(strQuery);
        count = Integer.getInteger(strQuery);
        return count;
    }

    @Override
    public List<Factor> ReportActive(String date) throws SQLException, Exception {
        List<Factor> FactorList = null;
        stmt = con.createStatement();
        String strQuery = "select * from factor where factordate=" + date;

        ResultSet rs = stmt.executeQuery(strQuery);

        while (rs.next()) {
            Factor factor = new Factor();
            factor.setId(Integer.parseInt(rs.getString("id")));
            factor.setTotalPrice(Integer.parseInt(rs.getString("totalprice")));
            factor.setCashId(Integer.parseInt(rs.getString("cashId")));
            factor.setCustomerId(Integer.parseInt(rs.getString("customerId")));
            factor.setActive(Integer.parseInt((rs.getString("active"))));
            FactorList.add(factor);
            FactorList.add(factor);
        }
        stmt.close();
        return FactorList;
    }

}
