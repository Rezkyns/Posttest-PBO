
package com.mycompany.posttest6;

public abstract class user {
    public String namaorang;
    public String umur;
    public String alamat;

    public user(String namaorang, String umur, String alamat) {
        this.namaorang = namaorang;
        this.umur = umur;
        this.alamat = alamat;
    }                       

    public String getNamaorang() {
        return namaorang;
    }

    public void setNamaorang(String namaorang) {
        this.namaorang = namaorang;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

   public abstract void isAdded();
   public abstract void display();
}
