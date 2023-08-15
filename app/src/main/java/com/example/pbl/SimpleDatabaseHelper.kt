package com.example.pbl

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SimpleDatabaseHelper(context: Context?): SQLiteOpenHelper(context, DBNAME, null, version) {
    companion object {
        private const val DBNAME = "DBSample.sqlite"
        private const val version = 1
    }

    // まだ未完成
    override fun onCreate(db: SQLiteDatabase?) {
        db?.let {
            it.execSQL("create table signup (id integer primary key, name text, password text)")
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.let {
            it.execSQL("DROP TABLE IF EXISTS signup")
            onCreate(it)
        }
    }

    override fun onOpen(db: SQLiteDatabase?) {
        super.onOpen(db)
    }
}