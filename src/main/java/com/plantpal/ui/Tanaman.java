package com.plantpal.ui; // Ganti ke package data/model, bukan ui

import java.io.Serializable;
import java.sql.Date;

public class Tanaman implements Serializable {
    private static final long serialVersionUID = 1L;//serialisasi

    private String nama;
    private String jenis;
    private String deskripsi;
    private int interval;
    private Date terakhirDisiram;
    private Date jadwalBerikutnya;

    public Tanaman(String nama, String jenis, String deskripsi, int interval, Date terakhirDisiram, Date jadwalBerikutnya) {
        this.nama = nama;
        this.jenis = jenis;
        this.deskripsi = deskripsi;
        this.interval = interval;
        this.terakhirDisiram = terakhirDisiram;
        this.jadwalBerikutnya = jadwalBerikutnya;
    }

    // Getter
    public String getNama() { return nama; }
    public String getJenis() { return jenis; }
    public String getDeskripsi() { return deskripsi; }
    public int getInterval() { return interval; }
    public Date getTerakhirDisiram() { return terakhirDisiram; }
    public Date getJadwalBerikutnya() { return jadwalBerikutnya; }
}
