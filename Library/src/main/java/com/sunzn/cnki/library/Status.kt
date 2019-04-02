package com.sunzn.cnki.library

class Status {

    class Page {
        companion object {
            const val Process = 0    // 加载
            const val Success = 1    // 成功
            const val Failure = 2    // 失败
            const val Nothing = 3    // 空白
        }
    }

}
