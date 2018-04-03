package com.example.e440.lab2;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by e440 on 03-04-18.
 */


@Entity
public class Form {
    @NonNull
    public int getFormId() {
        return formId;
    }


    public void setFormName(String formName) {
        this.formName = formName;
    }

    public void setFormCategory(String formCategory) {
        this.formCategory = formCategory;
    }

    public void setFormId(@NonNull int formId) {
        this.formId = formId;
    }

    @NonNull
    @PrimaryKey
    private int formId;

    public String getFormName() {
        return formName;
    }

    public String getFormCategory() {
        return formCategory;
    }

    private String formName;
    private String formCategory;

    public String getFormComment() {
        return formComment;
    }


    private String formComment;

    public Form() {
    }
    public void setFormComment(String formComment) {
        this.formComment = formComment;
    }

}