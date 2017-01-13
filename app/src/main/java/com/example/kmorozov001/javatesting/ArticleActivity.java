package com.example.kmorozov001.javatesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import static com.example.kmorozov001.javatesting.MainActivity.FILENAMEALL;
import static com.example.kmorozov001.javatesting.MainActivity.FILENAMENO;
import static com.example.kmorozov001.javatesting.MainActivity.FILENAMEYES;
import static com.example.kmorozov001.javatesting.MainActivity.countAllValue;
import static com.example.kmorozov001.javatesting.MainActivity.countNoValue;
import static com.example.kmorozov001.javatesting.MainActivity.countYesValue;

public class ArticleActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text;
    Button ok;

    TextView countAll;
    TextView countYes;
    TextView countNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        text = (TextView)findViewById(R.id.textview);
        // загружаем текст
        text.setText(Html.fromHtml(MainActivity.article));

        ok = (Button) findViewById(R.id.ok);
        ok.setOnClickListener(this);

        countAll =(TextView)findViewById(R.id.editText2);
        countYes =(TextView)findViewById(R.id.editText3);
        countNo =(TextView)findViewById(R.id.editText4);


        try {
            InputStream inputStream = openFileInput(FILENAMEALL);

            if (inputStream != null) {
                InputStreamReader isr = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(isr);
                String line;
                StringBuilder builder = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }

                inputStream.close();

                countAllValue = builder.toString();

                countAll.setText(builder.toString());


            }
        } catch (Throwable t) {

        }

        //1_______________________________________________________________________________________________________

        try {
            InputStream inputStream = openFileInput(FILENAMEYES);

            if (inputStream != null) {
                InputStreamReader isr = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(isr);
                String line;
                StringBuilder builder = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }

                inputStream.close();

                countYesValue = builder.toString();

                countYes.setText(builder.toString());

            }
        } catch (Throwable t) {

        }

        //2_______________________________________________________________________________________________________

        try {
            InputStream inputStream = openFileInput(FILENAMENO);

            if (inputStream != null) {
                InputStreamReader isr = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(isr);
                String line;
                StringBuilder builder = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }

                inputStream.close();

                countNoValue = builder.toString();

                countNo.setText(builder.toString());

            }
        } catch (Throwable t) {

        }

        //3_______________________________________________________________________________________________________



    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ArticleActivity.this, typeInActivity.class);
        startActivity(intent);
    }
}
