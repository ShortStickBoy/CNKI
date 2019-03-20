package com.sunzn.cnki.library;

public enum Source {

    JOU("J", "期刊"), DOC("D", "博士"), MAS("M", "硕士"), CON("C", "会议"), NEW("N", "报纸"), UNK("U", "未知");

    private String code;
    private String name;

    Source(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }


    public String getName() {
        return name;
    }

    public static Source route(String value) {
        if (value != null && value.length() > 0) {
            if (value.contains(JOU.getName())) {
                return JOU;
            }
            if (value.contains(DOC.getName())) {
                return DOC;
            }
            if (value.contains(MAS.getName())) {
                return MAS;
            }
            if (value.contains(CON.getName())) {
                return CON;
            }
            if (value.contains(NEW.getName())) {
                return NEW;
            }
        }
        return UNK;
    }

}
