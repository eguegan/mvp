package com.etienne.w5d4mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.etienne.w5d4mvp.R;
import com.etienne.w5d4mvp.presenter.FilePresenter;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private FilePresenter mFilePresenter;

    private TextView mEditText;
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFilePresenter = new FilePresenter(getFilesDir() + "info.txt");

        mEditText = (EditText) findViewById(R.id.input_info);
        mTextView = (TextView) findViewById(R.id.output_info);


    }

    public void saveInfo(View view) {
        String inputString = mEditText.getText().toString();
        mFilePresenter.writeInfo(inputString);
    }

    public void showInfo(View view) {
        try {
            String outputString = mFilePresenter.getInfo();
            mTextView.setText(outputString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
