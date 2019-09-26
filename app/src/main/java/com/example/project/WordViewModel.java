package com.example.project;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {
    private WordRepository mResository;
    private LiveData<List<Word>> mAllWords;
    public WordViewModel(Application application){
        super(application);
        mResository=new WordRepository(application);
        mAllWords=mResository.getAllwords();
    }
    LiveData<List<Word>> getAllWords(){
        return mAllWords;
    }
    public void insert(Word word){
        mResository.insert(word);
    }
}
