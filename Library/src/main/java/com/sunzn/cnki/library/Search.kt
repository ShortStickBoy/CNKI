package com.sunzn.cnki.library

class Search {

    class Order {
        companion object {
            const val ASC = "ASC"             // 升序排列
            const val DESC = "DESC"           // 降序排列
        }
    }

    class HandBook {
        companion object {
            const val Complex = "1000"        // 综合排序
            const val TermNum = "3000"        // 词条数量
            const val PubDate = "2000"        // 出版时间
        }
    }

    class HandTab {
        companion object {
            const val Entry = 0               // 词条搜索
            const val Image = 1               // 图片搜索
            const val Books = 2               // 辞典搜索
        }
    }

}