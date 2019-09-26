package com.example.project;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class  Word {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

//    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
//    public int[] mimage;
//
//    public Word(@NonNull int[] image)
//    {
//        this.mimage= image;
//    }
    public Word(@NonNull String word) {
        this.mWord = word;
    }
    @NonNull
    public String getWord(){return this.mWord;}
}
