package com.example.project;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;

@Dao
public interface WordDao {
    @Query("SELECT * FROM word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word);
//    @Query("SELECT * FROM word_table ORDER BY mimage ASC")
//   void insert(int image);
    @Query("DELETE FROM word_table ")
   void deleteAll();

}



