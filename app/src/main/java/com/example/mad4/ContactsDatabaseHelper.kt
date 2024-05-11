package com.example.mad4
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class ContactsDatabaseHelper(context: Context) : SQLiteOpenHelper(context, "contacts.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_TABLE_QUERY = "CREATE TABLE my_table (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, number TEXT, email TEXT)"
        db.execSQL(CREATE_TABLE_QUERY)    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Handle database upgrades
    }
}



