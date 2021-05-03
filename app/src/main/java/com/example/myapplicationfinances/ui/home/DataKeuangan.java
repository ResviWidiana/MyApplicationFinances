package com.example.myapplicationfinances.ui.home;

import android.os.Parcel;
import android.os.Parcelable;

public class DataKeuangan implements Parcelable {
    String kategori;
    String tanggal;
    String nama;
    String jumlah;
    String catatan;


    public DataKeuangan(String kategori, String tanggal, String nama, String jumlah, String catatan) {
        this.kategori = kategori;
        this.tanggal = tanggal;
        this.nama = nama;
        this.jumlah = jumlah;
        this.catatan = catatan;
    }

    protected DataKeuangan(Parcel in) {
        kategori = in.readString();
        tanggal = in.readString();
        nama = in.readString();
        jumlah = in.readString();
        catatan = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(kategori);
        dest.writeString(tanggal);
        dest.writeString(nama);
        dest.writeString(jumlah);
        dest.writeString(catatan);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<DataKeuangan> CREATOR = new Creator<DataKeuangan>() {
        @Override
        public DataKeuangan createFromParcel(Parcel in) {
            return new DataKeuangan(in);
        }

        @Override
        public DataKeuangan[] newArray(int size) {
            return new DataKeuangan[size];
        }
    };

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }


}
