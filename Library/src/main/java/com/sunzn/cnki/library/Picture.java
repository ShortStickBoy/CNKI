package com.sunzn.cnki.library;

public class Picture {

    private static final String ROOT = "http://c61.cnki.net/CJFD/big/";

    public static String getJournalMainCover(String code) {
        return ROOT + code + ".jpg";
    }

    public static String getJournalTermCover(String code, String term) {
        return ROOT + code + "/" + code + term + ".jpg";
    }

    public static String getJournalTermCover(String code, String year, String issue) {
        return ROOT + code + "/" + code + year + issue + ".jpg";
    }

    public static String getPinDeCover(String code) {
        return "http://qiangguo.cnki.net/Mall/Images/Book/Cover/Big/" + code + ".jpg";
    }

}
