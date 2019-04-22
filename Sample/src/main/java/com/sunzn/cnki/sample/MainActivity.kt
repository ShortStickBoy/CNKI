package com.sunzn.cnki.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.sunzn.cnki.library.Format
import com.sunzn.cnki.library.Marker
import com.sunzn.cnki.library.Picture
import com.sunzn.cnki.library.Values

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val s = Format.CAJ
        val x = Marker.M1
        val c = Values.EMPTY
        val ccc = Marker.route("")
        val m = Picture.getCorpusCover("")
        val o = Picture.getJournalTermCover("YLYL", null)
        Log.e("Kotlin", o)

        var b: String? = "ABC"
        b = null
        Log.e("Kotlin", "s = " + b?.length)

        var list = listOf(1, 2, 3, 4, 5)
        list.filter { it % 3 != 0 }

        println(max(4, 5))

        sumf(1, 2)

        sumx(1, 2)

        val intArray = intArrayOf(1, 2, 3, 4)
        intArray.forEach {
            if (it == 3) return
            Log.e("Kotlin", "s = $it")
        }

        val mArray = intArrayOf(1, 2, 3, 4)
        mArray.forEach here@{
            if (it == 3) return@here
            Log.e("Kotlin", "s = $it")
        }

        val nArray = intArrayOf(1, 2, 3, 4)
        nArray.forEach {
            if (it == 3) return@forEach
            Log.e("Kotlin", "s = $it")
        }

    }

    fun fail(msg: String): Nothing {
        throw IllegalArgumentException(msg)
    }

    fun sumx(a: Int, b: Int) {
        a + b
    }

    val sumf = fun(a: Int, b: Int) = { a + b }

    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    fun max1(a: Int, b: Int): Int {
        val max = if (a > b) {
            a
        } else {
            b
        }
        return max
    }

    fun caseWhen(obj: Any?) {
        when (obj) {
            0, 2, 3, 4, 5 -> println("${obj} ==> 这是0-5的数字")
            "Hello" -> println("${obj} ==> 这是Hello")
            is Char -> print("${obj} ==>这是一个Char类型")
            else -> println("默认路径")
        }
    }

}
