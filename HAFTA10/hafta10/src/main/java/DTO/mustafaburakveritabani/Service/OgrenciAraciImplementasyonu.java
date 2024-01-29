package DTO.mustafaburakveritabani.Service;

import DTO.mustafaburakveritabani.DTO.OgrenciDTO;
import DTO.mustafaburakveritabani.DTO.OgrenciEsleme;
import DTO.mustafaburakveritabani.Entity.Ogrenci;
import DTO.mustafaburakveritabani.Repository.OgrenciRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service @AllArgsConstructor
public class OgrenciAraciImplementasyonu implements OgrenciAraci{
    private OgrenciRepo ogrenciRepo;
    @Override
    public OgrenciDTO yeniOgrenci(OgrenciDTO ogrenciDTO){
        Ogrenci ogr = OgrenciEsleme.ogrenciEsle(ogrenciDTO);
        Ogrenci yeniKayit = ogrenciRepo.save(ogr);
        return OgrenciEsleme.ogrenciDTOEsle(yeniKayit);
        /* OBJECT EŞLEME İLE OLMAYAN
        Ogrenci ogr1 = new Ogrenci(
                ogrenciDTO.getId(),
                ogrenciDTO.getAd(),
                ogrenciDTO.getSoyad()
                );
        Ogrenci yeniKayit = ogrenciRepo.save(ogr1);

        return new OgrenciDTO(
                yeniKayit.getId(),
                yeniKayit.getAd(),
                yeniKayit.getSoyad()
                );*/
    }
    @Override
    public OgrenciDTO getirOgrenci(Long ogrenciId){
        Optional<Ogrenci> ogrenciGet = ogrenciRepo.findById(ogrenciId);
        Ogrenci ogrenci = ogrenciGet.get();
        return OgrenciEsleme.ogrenciDTOEsle(ogrenci);
    }
    @Override
    public List<OgrenciDTO> getirOgrenciler(){
        List<Ogrenci> ogrenci = ogrenciRepo.findAll();
        return ogrenci.stream().map(OgrenciEsleme::ogrenciDTOEsle).collect(Collectors.toList());
    }
    @Override
    public OgrenciDTO guncelleOgrenci(OgrenciDTO ogrenci){
        Ogrenci ogrenciGet = ogrenciRepo.findById(ogrenci.getId()).get();
        ogrenciGet.setAd(ogrenci.getAd());
        ogrenciGet.setSoyad(ogrenci.getSoyad());
        Ogrenci guncelOgrenci = ogrenciRepo.save(ogrenciGet);
        return OgrenciEsleme.ogrenciDTOEsle(guncelOgrenci);
    }
    @Override
    public void silOgrenci(Long ogrenciId){
        ogrenciRepo.deleteById(ogrenciId);
    }
}
