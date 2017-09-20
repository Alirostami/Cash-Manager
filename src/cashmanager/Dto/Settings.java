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
public class Settings {
    int _id;
    int _productId;
    double _price;
    int _discount;

    public Settings(int _productId, double _price, int _discount) {
        this._productId = _productId;
        this._price = _price;
        this._discount = _discount;
    }

    
    public int getId() {
        return _id;
    }

    public int getProductId() {
        return _productId;
    }

    public double getPrice() {
        return _price;
    }

    public int getDiscount() {
        return _discount;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public void setProductId(int _productId) {
        this._productId = _productId;
    }

    public void setPrice(double _price) {
        this._price = _price;
    }

    public void setDiscount(int _discount) {
        this._discount = _discount;
    }
    
}
