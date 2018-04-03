package com.example.e440.lab2;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by e440 on 03-04-18.
 */


@Database(entities = {Form.class}, version = 1, exportSchema = false)
public abstract class FormDatabase extends RoomDatabase {
    public abstract DaoAccess daoAccess() ;
}