/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashmanager.Dto;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author a.rostami
 */
public class Cash {

    private int _id;
    private String _casherName;

    public Cash(String _casherName) {
        this._casherName = _casherName;
    }

    public void setId(int id) {
        this._id = id;
    }

    public int getId() {
        return _id;
    }

    public void setCasherName(String casherName) {
        this._casherName = casherName;
    }

    public String getCasherName() {
        return _casherName;
    }

    public void createFactor(Factor factor) {

    }

    public void factorConfirm(Factor factor) {

    }

    private List<Factor> factorList(int flagActive, Date date) {
        return null;
    }

    public List<Factor> factorActive(Date date) {
        return null;
    }

    public long sum(Date date) {
        long sum = 0;
        List<Factor> factorList = factorActive(date);
        for (Factor factorObj : factorList) {
            sum += factorObj.getTotalPrice();
        }
        return sum;
    }

}
