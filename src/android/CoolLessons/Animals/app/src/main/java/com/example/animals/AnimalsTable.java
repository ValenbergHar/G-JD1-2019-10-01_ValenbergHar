package com.example.animals;

import android.database.sqlite.SQLiteDatabase;


class AnimalsTable {
    public static final String TABLE_ANIMALS = "animals";
    public static final String COLUMN_ID     = "_id";
    public static final String COLUMN_ANIMAL = "animal";

    public static final String CREATE = " create table animals ( " +
            "  _id integer primary key autoincrement , animal text not null ) ; ";

    public static void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE);
        populate(db);

    }

    private static void populate(SQLiteDatabase db) {
        db.execSQL(" insert into animals (animal) values ('cozgnw') ");
        db.execSQL(" insert into animals (animal) values ('cow') ");
        db.execSQL(" insert into animals (animal) values ('cow') ");
        db.execSQL(" insert into animals (animal) values ('cow') ");
        db.execSQL(" insert into animals (animal) values ('cmhzcbow') ");
        db.execSQL(" insert into animals (animal) values ('cow') ");
        db.execSQL(" insert into animals (animal) values ('czczfxbbow') ");
        db.execSQL(" insert into animals (animal) values ('cow') ");
        db.execSQL(" insert into animals (animal) values ('cow') ");
        db.execSQL(" insert into animals (animal) values ('czcvbow') ");
        db.execSQL(" insert into animals (animal) values ('cow') ");
        db.execSQL(" insert into animals (animal) values ('conw') ");
        db.execSQL(" insert into animals (animal) values ('cofnxvw') ");
        db.execSQL(" insert into animals (animal) values ('cogkw') ");
        db.execSQL(" insert into animals (animal) values ('cowrdg') ");
        db.execSQL(" insert into animals (animal) values ('cohl.w') ");
        db.execSQL(" insert into animals (animal) values ('cofyjgj.w') ");
        db.execSQL(" insert into animals (animal) values ('czfdbow') ");
        db.execSQL(" insert into animals (animal) values ('c,jhow') ");

    }

    public static void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
