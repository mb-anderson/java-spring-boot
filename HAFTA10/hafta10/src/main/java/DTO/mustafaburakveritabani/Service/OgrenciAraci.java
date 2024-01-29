package DTO.mustafaburakveritabani.Service;

import DTO.mustafaburakveritabani.DTO.OgrenciDTO;
import DTO.mustafaburakveritabani.Entity.Ogrenci;

import java.util.List;

public interface OgrenciAraci {
    OgrenciDTO yeniOgrenci(OgrenciDTO ogrenci);
    OgrenciDTO getirOgrenci(Long ogrenciId);
    List<OgrenciDTO> getirOgrenciler();
    OgrenciDTO guncelleOgrenci(OgrenciDTO ogrenci);
    void silOgrenci(Long ogrenciId);
}
