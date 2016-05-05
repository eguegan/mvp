package com.etienne.w5d4mvp.presenter;

import com.etienne.w5d4mvp.model.FileModel;

import java.io.IOException;

/**
 * Created by admin on 5/4/2016.
 */
public class FilePresenter {
    private FileModel mFileModel;

    public FilePresenter(String fileName){
        mFileModel = new FileModel(fileName);
    }

    public void writeInfo(String text){
        mFileModel.addFile(text);
    }

    public String getInfo()throws IOException{
        return mFileModel.getFile();
    }
}
