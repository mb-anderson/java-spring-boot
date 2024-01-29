package com.maware.anderson.veritabani.mustafaburakveritabani.Controller;

import com.maware.anderson.veritabani.mustafaburakveritabani.Entity.Ogrenci;
import com.maware.anderson.veritabani.mustafaburakveritabani.Service.OgrenciAraci;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @AllArgsConstructor
public class OgrenciController {
    private OgrenciAraci ogrenciAraci;
    @PostMapping("/ilkkayit")
    public ResponseEntity<Ogrenci> yeniOgrenci(@RequestBody Ogrenci ogrenci){
        Ogrenci ogrenciKayit = ogrenciAraci.yeniOgrenci(ogrenci);
        return new ResponseEntity<>(ogrenciKayit, HttpStatus.CREATED);
    }

    @GetMapping("/ilkkayit/{id}")
    public ResponseEntity<Ogrenci> getirOgrenci(@PathVariable("id") Long ogrenciId){
        Ogrenci ogrenciGetir = ogrenciAraci.getirOgrenci(ogrenciId);
        return new ResponseEntity<>(ogrenciGetir, HttpStatus.OK);
    }
    @GetMapping("/ilkgetirhepsi")
    public ResponseEntity<List<Ogrenci>> getirButunOgrenciler(){
        List<Ogrenci> ogrencilerGetir = ogrenciAraci.getirOgrenciler();
        return new ResponseEntity<>(ogrencilerGetir, HttpStatus.OK);
    }
    @PutMapping("/ilkguncelle/{id}")
    public ResponseEntity<Ogrenci> guncelleOgrenci(
            @PathVariable("id") Long ogrenciId,
            @RequestBody Ogrenci ogrenci){
        ogrenci.setId(ogrenciId);
        Ogrenci ogrenciGuncelle = ogrenciAraci.guncelleOgrenci(ogrenci);
        return new ResponseEntity<>(ogrenciGuncelle, HttpStatus.OK);
    }
    @DeleteMapping("/ilksil/{id}")
    public ResponseEntity<String> silOgrenci(@PathVariable("id") Long ogrenciId){
        ogrenciAraci.silOgrenci(ogrenciId);
        return new ResponseEntity<>("Ogrenci Silindi MUSTAFA BURAK YÜCEL", HttpStatus.OK);
    }
}
