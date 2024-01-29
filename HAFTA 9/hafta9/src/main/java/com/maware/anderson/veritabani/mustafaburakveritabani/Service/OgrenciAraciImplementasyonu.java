package com.maware.anderson.veritabani.mustafaburakveritabani.Service;

import com.maware.anderson.veritabani.mustafaburakveritabani.Entity.Ogrenci;
import com.maware.anderson.veritabani.mustafaburakveritabani.Repository.OgrenciRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service @AllArgsConstructor
public class OgrenciAraciImplementasyonu implements OgrenciAraci{
    private OgrenciRepo ogrenciRepo;
    @Override
    public Ogrenci yeniOgrenci(Ogrenci ogrenci){
        return ogrenciRepo.save(ogrenci);
    }
    @Override
    public Ogrenci getirOgrenci(Long ogrenciId){
        Optional<Ogrenci> ogrenciGet = ogrenciRepo.findById(ogrenciId);
        return ogrenciGet.get();
    }
    @Override
    public List<Ogrenci> getirOgrenciler(){
        return ogrenciRepo.findAll();
    }
    @Override
    public Ogrenci guncelleOgrenci(Ogrenci ogrenci){
        Ogrenci ogrenciGet = ogrenciRepo.findById(ogrenci.getId()).get();
        ogrenciGet.setAd(ogrenci.getAd());
        ogrenciGet.setSoyad(ogrenci.getSoyad());
        Ogrenci guncelOgrenci = ogrenciRepo.save(ogrenciGet);
        return guncelOgrenci;
    }
    @Override
    public void silOgrenci(Long ogrenciId){
        ogrenciRepo.deleteById(ogrenciId);
    }
}
