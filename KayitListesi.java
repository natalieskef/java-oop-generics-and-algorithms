import java.util.ArrayList;

class KayitListesi<T> {
    private String listeAdi;
    private ArrayList <T> kayitlar;
    public KayitListesi(String listeAdi){
        this.listeAdi=listeAdi;
        this.kayitlar=new ArrayList<>();
    }

    public String getListeAdi() {
        return listeAdi;
    }

    public ArrayList<T> getKayitlar() {
        return kayitlar;
    }
    public void ekle(T kayit){
        kayitlar.add(kayit);
    }
    public void yazdir(){
        for (T kayit  : kayitlar){
            System.out.println(kayit);
        }
    }
}
