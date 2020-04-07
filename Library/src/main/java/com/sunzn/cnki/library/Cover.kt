package com.sunzn.cnki.library

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import java.io.File
import java.io.FileOutputStream

object Cover {

    fun gainCover(context: Context, name: String): File {
        return File(context.getDir("cover", Context.MODE_PRIVATE), "$name.jpg")
    }

    fun saveCover(context: Context, drawable: Drawable, name: String) {
        val file: File = File(context.getDir("cover", Context.MODE_PRIVATE), "$name.jpg")
        saveCover(drawable, file, Bitmap.CompressFormat.JPEG)
    }

    fun saveCover(drawable: Drawable, file: File, format: Bitmap.CompressFormat) {
        var out: FileOutputStream? = null
        try {
            if (file.exists()) {
                file.delete()
                file.createNewFile()
            }
            out = FileOutputStream(file)
            if (drawable is BitmapDrawable) {
                drawable.bitmap.compress(format, 100, out)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            out?.close()
        }
    }

}