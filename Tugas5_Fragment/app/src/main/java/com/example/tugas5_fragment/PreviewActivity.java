package com.example.tugas5_fragment;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class PreviewActivity extends AppCompatActivity {

    private TextView judulPreview, isiText;
    private ImageView logoPreview;
    private String isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        judulPreview = findViewById(R.id.judul_preview);
        isiText = findViewById(R.id.isi_text);
        logoPreview = findViewById(R.id.gambar_preview);

        String judul = getIntent().getStringExtra("nama");
        int logo = getIntent().getIntExtra("lambang",0);


        if (judul.equals("Tokopedia")){
             isi = "It was founded in 2009 by William Tanuwijaya and Leontinus Alpha Edison. " +
                     "It is an Indonesian unicorn along with ride-hailing company Gojek, travel " +
                     "service firm Traveloka, e-commerce company Bukalapak and fintech company OVO.";
        }else if (judul.equals("Bukalapak")){
             isi = "salah satu perusahaan e-commerce di Indonesia. Didirikan oleh Achmad Zaky, " +
                     "Nugroho Herucahyono, dan Muhamad Fajrin Rasyid pada tahun 2010, Bukalapak " +
                     "awalnya merupakan toko daring yang memungkinkan para pelaku Usaha Kecil dan " +
                     "Menengah (UKM) untuk merambah ke dunia maya.";
        }else if (judul.equals("Shopee")){
             isi = "Shopee adalah situs elektronik komersial yang berkantor pusat di Singapura " +
                     "di bawah naungan SEA Group (sebelumnya dikenal dengan nama Garena), " +
                     "yang didirikan pada 2009 oleh Forrest Li.[1] Shopee pertama kali diluncurkan " +
                     "di Singapura pada tahun 2015, dan sejak itu memperluas jangkauannya " +
                     "ke Malaysia, Thailand, Taiwan, Indonesia, Vietnam, dan Filipina.";
        }else if (judul.equals("Lazada")){
             isi = "Lazada Group adalah sebuah perusahaan e-commerce Asia Tenggara yang " +
                     "didirikan oleh Rocket Internet dan Pierre Poignant pada 2012, dan dimiliki oleh Alibaba Group. ";
        }else if (judul.equals("Blibli")){
             isi = "Blibli.com adalah salah satu situs web perdagangan elektronik di Indonesia. " +
                     "Blibli adalah produk pertama PT Global Digital Niaga yang merupakan " +
                     "anak perusahaan Djarum di bidang digital yang didirikan pada tahun 2010. ";
        }else if (judul.equals("JD ID")){
             isi = "JD.ID mulai beroperasi di Indonesia sejak Oktober 2015. " +
                     "Pada awalnya, mereka fokus terhadap menyediakan pelanggan dengan produk " +
                     "elektronik dan gadgets yang sulit ditemukan, seperti iPad Pro dari Apple " +
                     "dan A2010 dari Lenovo yang baru launching pada akhir tahun 2015. ";
        }else if (judul.equals("Bhineka")){
             isi = "PT Bhinneka Mentari Dimensi lahir tahun 1993 dan memilih bidang teknologi" +
                     " informasi sebagai inti bisnisnya. Fokus pertama dimulai dari distribusi " +
                     "produk IT seperti PC Build Up dan PC Compatible, Peripherals, rancang bangun " +
                     "perangkat lunak jasa jaringan (Lan/Wan), solusi video editing hingga pusat servis.";
        }else if (judul.equals("Sociolla")){
             isi = "Sociolla is Indonesia's trusted and most complete online shopping destination " +
                     "offering authentic beauty products e.g. make up, skin care, hair care, " +
                     "fragrance and beauty tools serving women across Indonesia.";
        }else if (judul.equals("Zalora")){
             isi = "ZALORA adalah toko online fashion dan kecantikan yang menawarkan koleksi pakaian," +
                     " aksesoris, sepatu dan produk kecantikan untuk pria dan wanita. " +
                     "Berpusat di Singapura, ZALORA juga terdapat di Hong Kong, Singapura, " +
                     "Indonesia, Filipina, Thailand, Vietnam, Malaysia dan Brunei.";
        } else if (judul.equals("Elevania")){
             isi = "elevenia adalah situs belanja online dengan konsep open marketplace di Indonesia " +
                     "yang memberikan kemudahan dan keamanan berbelanja online. Situs ini " +
                     "menawarkan berbagai macam produk yang terbagi dalam 8 kategori antara lain: " +
                     "fashion, beauty/health, babies/kids, home/garden, gadget/komputer, elektronik, sports/hobby, service/food.";
        }

        judulPreview.setText(judul);
        Glide.with(this).load(logo).into(logoPreview);
        isiText.setText(isi);

    }
}