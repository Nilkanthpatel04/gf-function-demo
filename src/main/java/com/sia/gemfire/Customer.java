package com.sia.gemfire;

import java.io.Serializable;

public class Customer implements Serializable {
    private String acc_nbr;
    private String ini_id;
    private String cst_nbr;

    public Customer(String acc_nbr, String ini_id, String cst_nbr) {
        this.acc_nbr = acc_nbr;
        this.ini_id = ini_id;
        this.cst_nbr = cst_nbr;
    }

    public Customer(){

    }

    public void setAcc_nbr(String acc_nbr) {
        this.acc_nbr = acc_nbr;
    }

    public void setIni_id(String ini_id) {
        this.ini_id = ini_id;
    }

    public void setCst_nbr(String cst_nbr) {
        this.cst_nbr = cst_nbr;
    }

    public String getAcc_nbr() {
        return acc_nbr;
    }

    public String getIni_id() {
        return ini_id;
    }

    public String getCst_nbr() {
        return cst_nbr;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "acc_nbr=" + acc_nbr +
                ", ini_id=" + ini_id +
                ", cst_nbr=" + cst_nbr +
                '}';
    }
}
