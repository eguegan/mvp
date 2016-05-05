package com.etienne.w5d4mvp;

import com.etienne.w5d4mvp.model.FileModel;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import static org.junit.Assert.assertEquals;

/**
 * Created by admin on 5/4/2016.
 */
public class FileModelUnitTest {
    FileModel mFileModel;
    private String testStr = "This is a test string";

    @Before
    public void createFile(){
        mFileModel = new FileModel("info.txt");
    }

    @Test
    public void file_isWritable(){
        mFileModel.addFile(testStr);
    }

    @Test
    public void file_isReadable() throws IOException{
        assertEquals(testStr, mFileModel.getFile());
    }
}
