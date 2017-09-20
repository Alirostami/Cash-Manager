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
public class Factor {

    int _id;
    int _code;
    double _totalPrice;
    int _customerId;
    int _cashId;
    Date _setFactor;
    int _active;

    public Factor() {
    }

    public Factor(int _code, double _totalPrice, int _customerId, int _cashId, Date _setFactor, int _active) {
        this._code = _code;
        this._totalPrice = _totalPrice;
        this._customerId = _customerId;
        this._cashId = _cashId;
        this._setFactor = _setFactor;
        this._active = _active;
    }

    public int getId() {
        return _id;
    }

    public int getCode() {
        return _code;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public void setCode(int _code) {
        this._code = _code;
    }

    public void setTotalPrice(double _totalPrice) {
        this._totalPrice = _totalPrice;
    }

    public void setCustomerId(int _customerId) {
        this._customerId = _customerId;
    }

    public void setCashId(int _cashId) {
        this._cashId = _cashId;
    }

    public void setSetFactor(Date _setFactor) {
        this._setFactor = _setFactor;
    }

    public void setActive(int _active) {
        this._active = _active;
    }

    public double getTotalPrice() {
        return _totalPrice;
    }

    public int getCustomerId() {
        return _customerId;
    }

    public int getCashId() {
        return _cashId;
    }

    public Date getSetFactor() {
        return _setFactor;
    }

    public int getActive() {
        return _active;
    }

//    public void addFactorItems(FactorItems factorItems) throws SQLException, Exception{
//        FactorItemDaoImpl factorImpl = new FactorItemDaoImpl();
//        factorImpl.AddfactorItems(factorItems);
//    }
    public void factorConfirm(String cacherName) {
        Cash cashObj = new Cash(cacherName);
        cashObj.createFactor(this);
    }
}
