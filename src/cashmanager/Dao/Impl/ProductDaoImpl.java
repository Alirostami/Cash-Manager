/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashmanager.Dao.Impl;

import cashmanager.Dto.Product;
import cashmanager.Daoo.ProductDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author a.rostami
 */
public class ProductDaoImpl implements ProductDao {

     private Connection con;
    private Statement stmt;

    public ProductDaoImpl() throws SQLException, Exception {
        con = SQLConnection.createConnection();
    }

    @Override
    public void ProductRegister(Product product) throws SQLException, Exception{
        stmt = con.createStatement();
        String strDataQuery = "('";
        //   strDataQuery += product.getCode() + "', '" + product.getName() + "', '" + product.getPrimaryPrice()+ ")";
        String strQuery = "insert into product (code,name,primaryprice) values " + strDataQuery + ";";
        stmt.execute(strQuery);
        stmt.close();
    }

    @Override
    public Product GetProduct(Product product) throws SQLException, Exception{
       stmt = con.createStatement();
//        String strQuery = "select * from factor where id=" + product.getId() + ";";
//        ResultSet rs = stmt.executeQuery(strQuery);
//
//        product.setId(Integer.parseInt(rs.getString("id")));
//        product.setName(rs.getString("name"));
//        product.setCode(rs.getString("code"));
//        product.setPrimaryPrice(Integer.parseInt(rs.getString("primaryprice")));

        stmt.close();
        return product;
    }
    
}
