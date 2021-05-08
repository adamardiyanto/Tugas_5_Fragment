package com.example.tugas5_fragment;

import java.util.ArrayList;

public class OlshopData {
    private static String[] judul = new String[]{"Tokopedia","Bukalapak","Shopee","Lazada","Blibli",
            "JD ID","Bhineka","Sociolla","Zalora","Elevania"};

    private static int[] thumbnail = new int[]{R.drawable.tokopedia, R.drawable.bukalapak,
            R.drawable.shoppe, R.drawable.lazada, R.drawable.blibli, R.drawable.jdid,
            R.drawable.bhineka, R.drawable.sociolla, R.drawable.zalora, R.drawable.elevenia};

    public static ArrayList<OlshopModel> getListData(){
        OlshopModel olshopModel = null;
        ArrayList<OlshopModel> list = new ArrayList<>();
        for (int i=0; i <judul.length; i++){
            olshopModel = new OlshopModel();
            olshopModel.setNamaOlshop(judul[i]);
            olshopModel.setLogoOlshop(thumbnail[i]);
            list.add(olshopModel);
        }
        return list;

    }

}
