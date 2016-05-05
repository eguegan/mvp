package com.etienne.w5d4mvp.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by admin on 5/4/2016.
 */
public class FileModel {
    private String mFileName;

    public FileModel(String fileName){
        this.mFileName = fileName;
    }

    public void addFile(String inputText){
        try {
            PrintWriter writer = new PrintWriter(mFileName, "UTF-8");
            writer.println(inputText);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public String getFile() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(mFileName));
        StringBuilder sb = new StringBuilder();

        try {
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
        } finally {
            br.close();
        }
        return sb.toString();
    }
}
