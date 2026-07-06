//Natalı ISKEIF 240411900
public class Main {
    public static void main(String[] args){
        KayitListesi<String> kayitListesi=new KayitListesi<>("varde");
        kayitListesi.ekle("Natali");
        kayitListesi.ekle("rahaf");
        kayitListesi.ekle("aya");
        KayitListesi<Double> fiyatListesi=new KayitListesi<>("fıyat listesi");
        fiyatListesi.ekle(2.0);
        fiyatListesi.ekle(40.0);
        fiyatListesi.ekle(19.90);

        EtkinikUtils.herhangiListeyiYazdir(kayitListesi);
        EtkinikUtils.herhangiListeyiYazdir(fiyatListesi);
        System.out.println(EtkinikUtils.sayilariTopla(fiyatListesi));
    }
}