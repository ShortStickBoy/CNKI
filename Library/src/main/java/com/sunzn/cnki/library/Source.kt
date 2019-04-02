package com.sunzn.cnki.library

enum class Source(val code: String, val source: String) {

    JOU("J", "期刊"),
    DOC("D", "博士"),
    MAS("M", "硕士"),
    CON("C", "会议"),
    NEW("N", "报纸"),
    UNK("U", "未知");

    companion object {
        fun route(value: String?): Source {
            if (value != null && value.isNotEmpty()) {
                if (value.contains(JOU.source)) {
                    return JOU
                }
                if (value.contains(DOC.source)) {
                    return DOC
                }
                if (value.contains(MAS.source)) {
                    return MAS
                }
                if (value.contains(CON.source)) {
                    return CON
                }
                if (value.contains(NEW.source)) {
                    return NEW
                }
            }
            return UNK
        }
    }

}
