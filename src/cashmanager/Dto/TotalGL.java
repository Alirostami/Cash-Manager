/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashmanager.Dto;

import java.sql.Date;

/**
 *
 * @author a.rostami
 */
public class TotalGL {

    int _id;
    int _cashId;
    double _totalPos;
    double _totalNeg;
    double _remain;
    Date _date;

    public TotalGL(){
    }
    public TotalGL(int _cashId, double _totalPos, double _totalNeg, double _remain, Date _date) {
        this._cashId = _cashId;
        this._totalPos = _totalPos;
        this._totalNeg = _totalNeg;
        this._remain = _remain;
        this._date = _date;
    }

    public int getId() {
        return _id;
    }

    public int getCashId() {
        return _cashId;
    }

    public double getTotalPos() {
        return _totalPos;
    }

    public double getTotalNeg() {
        return _totalNeg;
    }

    public double getRemain() {
        return _remain;
    }

    public Date getDate() {
        return _date;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public void setCashId(int _cashId) {
        this._cashId = _cashId;
    }

    public void setTotalPos(double _totalPos) {
        this._totalPos = _totalPos;
    }

    public void setTotalNeg(double _totalNeg) {
        this._totalNeg = _totalNeg;
    }

    public void setRemain(double _remain) {
        this._remain = _remain;
    }

    public void setDate(Date _date) {
        this._date = _date;
    }

    public void addGL() {

    }

    public void reportGL(Date date) {
        
    }
}
