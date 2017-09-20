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
public class Customer {

    private int _id;
    private String _phoneNumber;
    private int _sex;
    private Date _date;

    public Customer(String _phoneNumber, int _sex, Date _date) {
        this._phoneNumber = _phoneNumber;
        this._sex = _sex;
        this._date = _date;
    }

    public Customer(int _sex, Date _date) {
        this._sex = _sex;
        this._date = _date;
    }

    public void setId(int id) {
        this._id = id;
    }

    public int getId() {
        return _id;
    }

    public void setPhoneNumber(String phoneNumber) {
        this._phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }

    public void setSex(int sex) {
        this._sex = sex;
    }

    public int getSex() {
        return _sex;
    }

    public void setDate(Date date) {
        this._date = date;
    }

    public Date getDate() {
        return _date;
    }

    public void createCustomer() {

    }
}
