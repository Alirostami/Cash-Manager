/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashmanager.Dao.Impl;

import cashmanager.Dto.TotalGL;
import cashmanager.Daoo.GLDao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author a.rostami
 */
public class TotalglDaoImpl implements GLDao {

    private Connection con;
    private Statement stmt;

    public TotalglDaoImpl() throws SQLException, Exception {
        con = SQLConnection.createConnection();
    }

    @Override
    public void addGL(TotalGL toalGLObj) throws SQLException, Exception {
        stmt = con.createStatement();
        String strDataQuery = "(";
        strDataQuery += toalGLObj.getCashId() + ", " + toalGLObj.getDate() + "," + toalGLObj.getRemain() + "," + toalGLObj.getTotalNeg() + "," + toalGLObj.getTotalPos() + ")";
        String strQuery = "insert into totalgl (cashid , date, remain,totalneg,totalpos ) values " + strDataQuery + ";";
        stmt.execute(strQuery);
        stmt.close();
    }

    @Override
    public List<TotalGL> reportGL(TotalGL toalGLObj, Date date) throws SQLException, Exception {
        List<TotalGL> totalGlList = null;
        stmt = con.createStatement();
        String strQuery = "select * from totalgl;";
        ResultSet rs = stmt.executeQuery(strQuery);
        while (rs.next()) {
            TotalGL totalGlObj = new TotalGL(Integer.parseInt(rs.getString("cashid")), Double.parseDouble(rs.getString("totalpos")), Double.parseDouble(rs.getString("totalneg")), Double.parseDouble(rs.getString("remain")), Date.valueOf(rs.getString("date")));
            totalGlList.add(totalGlObj);
        }
        stmt.close();
        return totalGlList;
    }

}
