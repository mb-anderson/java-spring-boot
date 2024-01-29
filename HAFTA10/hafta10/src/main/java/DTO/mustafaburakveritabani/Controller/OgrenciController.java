package DTO.mustafaburakveritabani.Controller;

import DTO.mustafaburakveritabani.DTO.OgrenciDTO;
import DTO.mustafaburakveritabani.Entity.Ogrenci;
import DTO.mustafaburakveritabani.Service.OgrenciAraci;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController @AllArgsConstructor
public class OgrenciController {
    private OgrenciAraci ogrenciAraci;
    @PostMapping("/ilkkayit")
    public ResponseEntity<OgrenciDTO> yeniOgrenci(@RequestBody OgrenciDTO ogrenci){
        OgrenciDTO ogrenciKayit = ogrenciAraci.yeniOgrenci(ogrenci);
        return new ResponseEntity<>(ogrenciKayit, HttpStatus.CREATED);
    }

    @GetMapping("/ilkGetir/{id}")
    public ResponseEntity<OgrenciDTO> getirOgrenci(@PathVariable("id") Long ogrenciId){
        OgrenciDTO ogrenciGetir = ogrenciAraci.getirOgrenci(ogrenciId);
        return new ResponseEntity<>(ogrenciGetir, HttpStatus.OK);
    }
    @GetMapping("/ilkgetirhepsi")
    public ResponseEntity<List<OgrenciDTO>> getirButunOgrenciler(){
        List<OgrenciDTO> ogrencilerGetir = ogrenciAraci.getirOgrenciler();
        return new ResponseEntity<>(ogrencilerGetir, HttpStatus.OK);
    }
    @PutMapping("/ilkguncelle/{id}")
    public ResponseEntity<OgrenciDTO> guncelleOgrenci(
            @PathVariable("id") Long ogrenciId,
            @RequestBody OgrenciDTO ogrenci){
        ogrenci.setId(ogrenciId);
        OgrenciDTO ogrenciGuncelle = ogrenciAraci.guncelleOgrenci(ogrenci);
        return new ResponseEntity<>(ogrenciGuncelle, HttpStatus.OK);
    }
    @DeleteMapping("/ilksil/{id}")
    public ResponseEntity<String> silOgrenci(@PathVariable("id") Long ogrenciId){
        ogrenciAraci.silOgrenci(ogrenciId);
        return new ResponseEntity<>("Ogrenci Silindi MUSTAFA BURAK YÜCEL", HttpStatus.OK);
    }
}
