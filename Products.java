package com.example.povilas.myapplication;

public class Products {

    private int _id;
    private String _productname;

    public Products(){
        // empty c-tor
    }

    public Products(String productname) {
        this._productname = productname;
    }

    public void set_id(int id) {
        this._id = id;
    }

    public void set_productname(String productname) {
        this._productname = productname;
    }

    public int get_id() {
        return _id;
    }

    public String get_productname() {
        return _productname;
    }



}
