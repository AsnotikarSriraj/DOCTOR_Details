package com.example.project;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class WordRepository {
    private WordDao mWordDao;
    private LiveData<List<Word>> mAllwords;
    WordRepository(Application application){
        WordRoomDatabase db=WordRoomDatabase.getDatabase(application);
        mWordDao=db.wordDao();
        mAllwords=mWordDao.getAllWords();
    }
    LiveData<List<Word>> getAllwords(){
        return mAllwords;
    }
        public void insert(Word word){
        new insertAsynTask(mWordDao).execute(word);
        }

        private static class insertAsynTask extends AsyncTask<Word,Void,Void>
        {
            private WordDao mAsynTaskDao;
            insertAsynTask(WordDao dao){
                mAsynTaskDao=dao;
            }
           @Override
            protected Void doInBackground(final Word... params){
                mAsynTaskDao.insert(params[0]);
                return null;
           }

        }

}
