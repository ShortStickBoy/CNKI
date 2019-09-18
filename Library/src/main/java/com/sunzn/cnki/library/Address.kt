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

    /**
     * 分享-期刊节点
     */
    fun getJournalNodeShareUrl(code: String?): String {
        return when (code) {
            null -> Values.EMPTY
            else -> "https://wap.cnki.net/touch/web/Journal/Article/$code.html"
        }
    }

    /**
     * 分享-报纸节点
     */
    fun getNewspaperNodeShareUrl(code: String?): String {
        return when (code) {
            null -> Values.EMPTY
            else -> "https://wap.cnki.net/touch/web/Newspaper/Article/$code.html"
        }
    }

    /**
     * 分享-会议节点
     */
    fun getConferenceNodeShareUrl(code: String?): String {
        return when (code) {
            null -> Values.EMPTY
            else -> "https://wap.cnki.net/touch/web/Conference/Article/$code.html"
        }
    }

    /**
     * 分享-论文节点
     */
    fun getDissertationNodeShareUrl(code: String?): String {
        return when (code) {
            null -> Values.EMPTY
            else -> "https://wap.cnki.net/touch/web/Dissertation/Article/$code.html"
        }
    }

    /**
     * 协议-隐私政策
     */
    fun getLegalUrl(): String {
        return "https://wap.cnki.net/touch/web/appzhengce.html"
    }

    /**
     * 协议-帮助中心
     */
    fun getHelpUrl(): String {
        return "https://wap.cnki.net/client.html"
    }

}

