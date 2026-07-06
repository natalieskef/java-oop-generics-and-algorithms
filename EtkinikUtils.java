class EtkinikUtils {
    public static void herhangiListeyiYazdir(KayitListesi<?>liste){
        for (Object kayit:liste.getKayitlar()){
            System.out.println(kayit);
        }
    }
    public static double sayilariTopla(KayitListesi<? extends Number>liste){
        double toplam=0.0;
        for (Number sayi:liste.getKayitlar()){
            toplam+=sayi.doubleValue();
        }
        return toplam;
    }
}
