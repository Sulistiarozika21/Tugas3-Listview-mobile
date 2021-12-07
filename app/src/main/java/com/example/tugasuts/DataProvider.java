package com.example.tugasuts;

import android.content.Context;

import com.example.tugasuts.model.Durian;
import com.example.tugasuts.model.Ikan;
import com.example.tugasuts.model.Kaktus;
import com.example.tugasuts.model.Tumbuhan;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Tumbuhan> tumbuhans = new ArrayList<>();


    private static List<Kaktus> initDataKaktus(Context ctx) {
        List<Kaktus> kaktuses = new ArrayList<>();
        kaktuses.add(new Kaktus("Kaktus mini Ariocarpus", "Amerika Utara",
                "Pada umumnya, kaktus memiliki duri pada daunnya. Namun, kaktus hias jenis Ariocarpus ini justru tidak memiliki duri sama sekali.", R.drawable.kaktus1));
        kaktuses.add(new Kaktus("Kaktus mini Astrophytum", "Amerika Utara",
                "Kaktus mini jenis Astrophytum ini bentuknya menyerupai bintang atau buah belimbing. Bunganya ada yang berwarna kuning, merah, dan pink.", R.drawable.kaktus2));
        kaktuses.add(new Kaktus("Kaktus mini Cereus tetragonus", "Amerika Selatan",
                "Kaktus mini berikutnya yang bisa kamu pelihara di rumah adalah kaktus mini jenis Cereus tetragonous. Kaktus mini ini berasal dari Amerika dan bisa tumbuh tinggi.", R.drawable.kaktus3));
        kaktuses.add(new Kaktus("Kaktus mini Cephalocereus senilis", "Amerika",
                "Kaktus mini jenis Cephalocereus senilis sering juga disebut sebagai kaktus orang tua. Seluruh bagian kaktus mini ini dipenuhi rambut panjang berwarna putih", R.drawable.kaktus4));
        kaktuses.add(new Kaktus("Kaktus mini Ferocactus", "Amerika Utara",
                "Kaktus mini jenis Ferocactus ini tampilannya cukup mengerikan untuk orang awam, namun cantik di mata pecinta tanaman. Kaktus ini bentuknya bulat dengan batang berlekuk.", R.drawable.kaktus5));
        kaktuses.add(new Kaktus("Kaktus mini Gymnocalycium", "Amerika Selatan",
                "Kaktus mini jenis Gymnocalycium ini memiliki bentuk yang menyerupai buah labu dengan tanduk sebagai tempat tumbuhnya bunga.", R.drawable.kaktus6));
        return kaktuses;
    }

    private static List<Durian> initDataDurian(Context ctx) {
        List<Durian> durians = new ArrayList<>();
        durians.add(new Durian("Durian Merah", "Banyuwangi",
                "Durian dari Banyuwangi ini punya warna merah terang yang khas. Ukurannya lebih kecil dari jenis lainnya, tetapi dagingnya sangat tebal", R.drawable.durian1));
        durians.add(new Durian("Durian Montong", "Jawa Tengah",
                "Durian montong berukuran sangat besar ini jadi favorit banyak orang. Dagingnya tebal, isinya tidak terlalu besar, dan manisnya khas", R.drawable.durian2));
        durians.add(new Durian("Durian Pelangi", "Manokwari, Papua Barat",
                "Durian pelangi asal Manokwari, Papua Barat, berwarna unik, yakni campuran merah dan kuning", R.drawable.durian3));
        durians.add(new Durian("Durian Tembaga", "Sumatera Selatan",
                "Durian tembaga berasal dari Sumatera Selatan. Rasa dagingnya manis-pahit. Ukurannya lebih kecil dari jenis lainnya, dan warna kulitnya hijau", R.drawable.durian4));
        durians.add(new Durian("Durian Mimang", "Banjarnegara",
                "Durian mimang dari Banjarnegara, Jawa Tengah, berukuran sangat kecil. Dagingnya manis, agak berserat, tebal, dan kadar alkoholnya agak tinggi", R.drawable.durian5));
        durians.add(new Durian("Durian Udang Merah", "Malaysia",
                "Durian udang merah berasal dari Malaysia, sering disebut sebagai bibit paling unggul setelah musang king. Tekstur dagingnya sangat lembut dan tebal", R.drawable.durian6));
        return durians;
    }

    private static List<Ikan> initDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan("Ikan Kurumoi", "Papua",
                "Warna tubuhnya indah bak pelangi, ramah dan cantik, menjadi ciri khas ikan hias rainbow atau ikan pelangi. Ikan hias air tawar asli Indonesia ini hanya ditemukan di Danau Kurumoi, Papua.", R.drawable.ikan1));
        ikans.add(new Ikan("Mono Argenteus", "Pasifik barat",
                "mono argenteus memiliki warna dasar silver dengan garis hitam pada bagian kepala dan menganai matanya, badan pipih, warna kuning pada sirip bagian atas, dan memiliki sirip yang lebih pendek ", R.drawable.ikan2));
        ikans.add(new Ikan("Mugilogobius adeia", "Danau Matano, Sulawesi",
                "Mugilogobius adeia adalah spesies ikan dari keluarga Gobiidae. Ditemukan di Danau Matano, Sulawesi, ikan ini merupakan ikan endemik di Indonesia. Di alam bebas panjang tubuh Mugilogobius adeia dapat mencapai 5 cm.", R.drawable.ikan3));
        ikans.add(new Ikan("Cupang Api-api", "Sumatera",
                "ikan cupang api-api sangat langkah dan harus dibudidayakan untuk tetap menjaga kelestariannya. ", R.drawable.ikan4));
        ikans.add(new Ikan("Ikan Betta channoides", " Sungai Mahakam, kalimantan timur",
                "Cupang kepala-ular (Betta channoides) adalah sejenis ikan cupang dalam grup Albimarginata; dalam perdagangan dikenal sebagai Snakehead Betta.", R.drawable.ikan5));
        ikans.add(new Ikan("Ikan Puntang", "Kalimantan",
                "Ikan yang bertubuh kecil, memanjang, di wilayah Kepulauan Indo-Australia tercatat mencapai panjang 160 mm; bagian depan tubuh membulat, bagian belakangnya memipih tegak. T", R.drawable.ikan6));
        return ikans;
    }
    private static void initAllTumbuhans(Context ctx) {
        tumbuhans.addAll(initDataKaktus(ctx));
        tumbuhans.addAll(initDataDurian(ctx));
        tumbuhans.addAll(initDataIkan(ctx));
    }
    public static List<Tumbuhan> getAllTumbuhan(Context ctx) {
        if (tumbuhans.size() == 0) {
            initAllTumbuhans(ctx);
        }
        return  tumbuhans;
    }

    public static List<Tumbuhan> getTumbuhansByTipe(Context ctx, String jenis) {
        List<Tumbuhan> tumbuhansByType = new ArrayList<>();
        if (tumbuhans.size() == 0) {
            initAllTumbuhans(ctx);
        }
        for (Tumbuhan t : tumbuhans) {
            if (t.getJenis().equals(jenis)) {
                tumbuhansByType.add(t);
            }
        }
        return tumbuhansByType;
    }







}
