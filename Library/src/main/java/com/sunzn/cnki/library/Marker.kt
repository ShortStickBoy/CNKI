package com.sunzn.cnki.library

object Marker {

    const val M1 = "1"    // 已勘误
    const val M2 = "2"    // 撤回
    const val M3 = "3"    // 未勘误
    const val M4 = "4"    // 撤稿
    const val M5 = "5"    // 全文替换
    const val M6 = "6"    // 关注
    const val M7 = "7"    // 取消关注
    const val M8 = "8"    // 撤稿不留原文

    fun route(value: String): String {
        return when (value) {
            M1 -> "Erratum"
            M2 -> "Withdraw"
            M3 -> "Erratum"
            M4 -> "Retraction"
            M5 -> "Replacement"
            M6 -> "Concern"
            M7 -> "Concel"
            M8 -> "Retractionb"
            else -> Values.EMPTY
        }
    }

    fun state(value: String?): String {
        if (value != null && value.isNotEmpty()) {
            return when (value) {
                M1 -> "已勘误"
                M2 -> "撤回"
                M3 -> "未勘误"
                M4 -> "撤稿"
                M5 -> "全文替换"
                M6 -> "关注"
                M7 -> "取消关注"
                M8 -> "撤稿"
                else -> Values.EMPTY
            }
        }
        return Values.EMPTY
    }

}
