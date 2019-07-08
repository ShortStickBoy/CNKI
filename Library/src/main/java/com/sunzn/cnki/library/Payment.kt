package com.sunzn.cnki.library

class Payment {

    class Action {
        companion object {
            const val Check = "check"  // 校验订单
            const val Pay = "pay"      // 支付订单
        }
    }

    class Channel {
        companion object {
            const val Balance = 1      // 校验订单
            const val Alipay = 4       // 支付订单
            const val WeChat = 11      // 支付订单
        }
    }

    class OrderType {
        companion object {
            const val Article = 0      // 文献
            const val Journal = 1      // 期刊单期
            const val JournalYear = 2  // 期刊单年
            const val JournalFull = 3  // 期刊全刊
            const val RefBook = 4      // 工具书
            const val Entry = 5        // 词条
            const val PinDe = 7        // 品得书院
            const val Editor = 8       // 大成编客
            const val Activity = 9     // 活动
        }
    }

}