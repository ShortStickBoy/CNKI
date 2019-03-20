package com.sunzn.cnki.library;

public class Marker {

    public static final String M1 = "1";    // 已勘误
    public static final String M2 = "2";    // 撤回
    public static final String M3 = "3";    // 未勘误
    public static final String M4 = "4";    // 撤稿
    public static final String M5 = "5";    // 全文替换
    public static final String M6 = "6";    // 关注

    public static String route(String value) {
        switch (value) {
            case M1:
                return "Erratum";
            case M2:
                return "Withdraw";
            case M3:
                return "Erratum";
            case M4:
                return "Retraction";
            case M5:
                return "Replacement";
            case M6:
                return "Concern";
            default:
                return "";
        }
    }

}
