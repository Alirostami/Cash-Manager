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
public class FactorItems {

    int _id;
    int _factorId;
    int _productId;

    public FactorItems(int _factorId, int _productId) {
        this._factorId = _factorId;
        this._productId = _productId;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public void setFactorId(int _factorId) {
        this._factorId = _factorId;
    }

    public void setProductId(int _productId) {
        this._productId = _productId;
    }

    public int getProductId() {
        return _productId;
    }

    public int getFactorId() {
        return _factorId;
    }

    public void getProducts(Product productObj) {

    }
}
