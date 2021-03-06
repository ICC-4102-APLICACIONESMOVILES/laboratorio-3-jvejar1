package com.example.e440.lab2;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by e440 on 03-04-18.
 */
@Dao
public interface DaoAccess {

    @Insert
    void insertOnlySingleForm(Form form);
    @Insert
    void insertMultipleForms(List<Form> formsList);
    @Query("SELECT * FROM Form WHERE FormId = :formId")
    Form fetchOneMoviesbyMovieId(int formId);


    @Update
    void updateForm(Form form);
    @Delete
    void deleteForm(Form form);
}

