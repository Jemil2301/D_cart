package com.example.i.loginpage;

public class Order {
    public String ofirstname;
    public String olastname;
    public String oaddress;
    public String ocity;
    public String ostate;
    public String opincode;
    public String ophone;
    public String oemail;
    public String oquantity;
    public String oproname;
    public String oproPrice;
    public Order(){

    }

    public Order(String ofirstname, String olastname, String oaddress, String ocity, String ostate, String opincode, String ophone, String oemail, String oquantity, String oproname, String oproPrice) {
        this.ofirstname = ofirstname;
        this.olastname = olastname;
        this.oaddress = oaddress;
        this.ocity = ocity;
        this.ostate = ostate;
        this.opincode = opincode;
        this.ophone = ophone;
        this.oemail = oemail;
        this.oquantity = oquantity;
        this.oproname = oproname;
        this.oproPrice = oproPrice;
    }

    public String getOfirstname() {
        return ofirstname;
    }

    public void setOfirstname(String ofirstname) {
        this.ofirstname = ofirstname;
    }

    public String getOlastname() {
        return olastname;
    }

    public void setOlastname(String olastname) {
        this.olastname = olastname;
    }

    public String getOaddress() {
        return oaddress;
    }

    public void setOaddress(String oaddress) {
        this.oaddress = oaddress;
    }

    public String getOcity() {
        return ocity;
    }

    public void setOcity(String ocity) {
        this.ocity = ocity;
    }

    public String getOstate() {
        return ostate;
    }

    public void setOstate(String ostate) {
        this.ostate = ostate;
    }

    public String getOpincode() {
        return opincode;
    }

    public void setOpincode(String opincode) {
        this.opincode = opincode;
    }

    public String getOphone() {
        return ophone;
    }

    public void setOphone(String ophone) {
        this.ophone = ophone;
    }

    public String getOemail() {
        return oemail;
    }

    public void setOemail(String oemail) {
        this.oemail = oemail;
    }

    public String getOquantity() {
        return oquantity;
    }

    public void setOquantity(String oquantity) {
        this.oquantity = oquantity;
    }

    public String getOproname() {
        return oproname;
    }

    public void setOproname(String oproname) {
        this.oproname = oproname;
    }

    public String getOproPrice() {
        return oproPrice;
    }

    public void setOproPrice(String oproPrice) {
        this.oproPrice = oproPrice;
    }
}
