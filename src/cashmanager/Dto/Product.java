/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashmanager.Dto;

/**
 *
 * @author a.rostami
 */
public class Product {

    private int _id;
    private int _code;
    private String _name;
    private double _primaryPrice;

    public Product(int _code, double _primaryPrice) {
        this._code = _code;
        this._primaryPrice = _primaryPrice;
    }
     
    public void setId(int id) {
        this._id = id;
    }

    public int getId() {
        return _id;
    }

    public void setCode(int code) {
        this._code = code;
    }

    public int getCode() {
        return _code;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getName() {
        return _name;
    }

    public void setPrimaryPrice(double primaryPrice) {
        this._primaryPrice = primaryPrice;
    }

    public double getPrimaryPrice() {
        return _primaryPrice;
    }

    public void productRegister() {
        
    }
}
