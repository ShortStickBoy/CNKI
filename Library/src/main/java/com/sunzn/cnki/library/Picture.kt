package com.sunzn.cnki.library

object Picture {

    private const val WC_ROOT = "http://xyz.cnki.net/digest/"
    private const val BZ_ROOT = "http://xyz.cnki.net/newspaper/"
    private const val QK_ROOT = "http://c61.cnki.net/CJFD/big/"
    private const val WJ_ROOT = "http://e.bianke.cnki.net/"

    fun getDigestCover(code: String): String {
        return "$WC_ROOT$code.jpg"
    }

    fun getNewsPaperCover(code: String): String {
        return "$BZ_ROOT$code.png"
    }

    fun getJournalMainCover(code: String): String {
        return "$QK_ROOT$code.jpg"
    }

    fun getJournalTermCover(code: String, term: String): String {
        return "$QK_ROOT$code/$code$term.jpg"
    }

    fun getJournalTermCover(code: String, year: String, issue: String): String {
        return "$QK_ROOT$code/$code$year$issue.jpg"
    }

    fun getCorpusCover(code: String): String {
        return WJ_ROOT + "Home/GetCorpusPic/" + code + "?width=50&height=30"
    }

    fun getPinDeCover(code: String): String {
        return "http://qiangguo.cnki.net/Mall/Images/Book/Cover/Big/$code.jpg"
    }

}
