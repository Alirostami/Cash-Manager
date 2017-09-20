/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashmanager.Daoo;

import cashmanager.Dto.TotalGL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author a.rostami
 */
public interface GLDao {
    
  public void addGL(TotalGL toalGLObj) throws SQLException, Exception;

    public List<TotalGL> reportGL(TotalGL toalGLObj, Date date) throws SQLException, Exception;
}
