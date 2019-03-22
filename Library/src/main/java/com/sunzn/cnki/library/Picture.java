package com.sunzn.cnki.library;

public class Picture {

    private static final String ROOT = "http://c61.cnki.net/CJFD/big/";

    public static String getJournalMainCover(String code) {
        return ROOT + code + ".jpg";
    }

    public static String getJournalTermCover(String code, String term) {
        return ROOT + code + "/" + code + term + ".jpg";
    }

}
