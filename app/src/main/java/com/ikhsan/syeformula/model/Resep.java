package com.ikhsan.syeformula.model;

import java.io.Serializable;

public class Resep implements Serializable {
    private String nama;
    private String deskripsi;
    private String bahan;
    private String cara;
    private int foto1;
    private int foto2;
    private int foto3;
    int viewType;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getCara() {
        return cara;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }

    public int getFoto1() {
        return foto1;
    }

    public void setFoto1(int foto1) {
        this.foto1 = foto1;
    }

    public int getFoto2() {
        return foto2;
    }

    public void setFoto2(int foto2) {
        this.foto2 = foto2;
    }

    public int getFoto3() {
        return foto3;
    }

    public void setFoto3(int foto3) {
        this.foto3 = foto3;
    }

    public int getViewType() {
        return viewType;
    }
}
