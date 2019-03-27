package com.sunzn.cnki.library;

public class Picture {

    private static final String WC_ROOT = "http://xyz.cnki.net/digest/";
    private static final String BZ_ROOT = "http://xyz.cnki.net/newspaper/";
    private static final String QK_ROOT = "http://c61.cnki.net/CJFD/big/";

    public static String getDigestCover(String code) {
        return WC_ROOT + code + ".jpg";
    }

    public static String getNewsPaperCover(String code) {
        return BZ_ROOT + code + ".png";
    }

    public static String getJournalMainCover(String code) {
        return QK_ROOT + code + ".jpg";
    }

    public static String getJournalTermCover(String code, String term) {
        return QK_ROOT + code + "/" + code + term + ".jpg";
    }

    public static String getJournalTermCover(String code, String year, String issue) {
        return QK_ROOT + code + "/" + code + year + issue + ".jpg";
    }

    public static String getPinDeCover(String code) {
        return "http://qiangguo.cnki.net/Mall/Images/Book/Cover/Big/" + code + ".jpg";
    }

}
