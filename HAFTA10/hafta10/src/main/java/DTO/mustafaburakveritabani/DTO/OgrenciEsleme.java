package DTO.mustafaburakveritabani.DTO;

import DTO.mustafaburakveritabani.Entity.Ogrenci;

public class OgrenciEsleme {
    public static OgrenciDTO ogrenciDTOEsle(Ogrenci ogrenci){
        return new OgrenciDTO(
                ogrenci.getId(),
                ogrenci.getAd(),
                ogrenci.getSoyad()
        );
}
    public static Ogrenci ogrenciEsle(OgrenciDTO ogrenciDTO){
        return new Ogrenci(
                ogrenciDTO.getId(),
                ogrenciDTO.getAd(),
                ogrenciDTO.getSoyad()
        );
    }
}
