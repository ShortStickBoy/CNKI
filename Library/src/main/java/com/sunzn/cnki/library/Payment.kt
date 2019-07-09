package com.sunzn.cnki.library

class Payment {

    class Action {
        companion object {
            const val Check = "check"        // 校验订单
            const val Pay = "pay"            // 支付订单
        }
    }

    class Channel {
        companion object {
            const val Balance = "1"          // 校验订单
            const val Alipay = "4"           // 支付订单
            const val WeChat = "11"          // 支付订单
        }
    }

    class OrderType {
        companion object {
            const val Article = "0"          // 文献
            const val Journal = "1"          // 期刊单期
            const val JournalYear = "2"      // 期刊单年
            const val JournalFull = "3"      // 期刊全刊
            const val HandBook = "4"         // 工具书
            const val Entry = "5"            // 词条
            const val PinDe = "7"            // 品得书院
            const val Editor = "8"           // 大成编客
            const val Activity = "9"         // 活动
        }
    }

    class Route {
        companion object {
            const val CAR001 = "CAR001";     // 校验文章单篇订单
            const val PAR001 = "PAR001";     // 支付文章单篇订单

            const val CJN001 = "CJN001";     // 校验期刊单期订单
            const val PJN001 = "PJN001";     // 支付期刊单期订单

            const val CJY001 = "CJY001";     // 校验期刊整年订单
            const val PJY001 = "PJY001";     // 支付期刊整年订单

            const val CJA001 = "CJA001";     // 校验期刊整刊订单
            const val PJA001 = "PJA001";     // 支付期刊整刊订单

            const val CHB001 = "CHB001"      // 校验辞典整本订单
            const val PHB001 = "PHB001"      // 支付辞典整本订单

            const val CTS001 = "CTS001"      // 校验图书整本订单
            const val PTS001 = "PTS001"      // 支付图书整本订单

            const val CWJ001 = "CWJ001"      // 校验文集整本订单
            const val PWJ001 = "PWJ001"      // 支付文集整本订单
        }
    }

}