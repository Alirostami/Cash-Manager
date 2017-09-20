/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashmanager.Dao.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author a.rostami
 */
class SQLConnection {

    private static String strConnection = "jdbc:mysql://127.0.0.1:3306/CashManager";
    private static String strUser = "root";
    private static String strPass = "";

    private SQLConnection() {
        //
    }

    public static Connection createConnection() throws SQLException, Exception {
        Connection Conn = DriverManager.getConnection(strConnection, strUser, strPass);
        return Conn;
    }

}
