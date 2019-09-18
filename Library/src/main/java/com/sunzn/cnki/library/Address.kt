package com.sunzn.cnki.library

object Address {

    /**
     * 辞典-九大专题
     */
    fun getDictTopicUrl(code: String?): String {
        return when (code) {
            null -> Values.EMPTY
            else -> "https://wap.cnki.net/touch/node/dict/topic/$code.html?sm=app"
        }
    }

    /**
     * 辞典-词条品读
     */
    fun getDictReadUrl(code: String?): String {
        return when (code) {
            null -> Values.EMPTY
            else -> "https://wap.cnki.net/touch/node/dict/read/$code.html?sm=app"
        }
    }

}