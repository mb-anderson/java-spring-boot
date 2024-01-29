package com.maware.anderson.veritabani.mustafaburakveritabani.Service;

import com.maware.anderson.veritabani.mustafaburakveritabani.Entity.Ogrenci;

import java.util.List;

public interface OgrenciAraci {
    Ogrenci yeniOgrenci(Ogrenci ogrenci);
    Ogrenci getirOgrenci(Long ogrenciId);
    List<Ogrenci> getirOgrenciler();
    Ogrenci guncelleOgrenci(Ogrenci ogrenci);
    void silOgrenci(Long ogrenciId);
}
