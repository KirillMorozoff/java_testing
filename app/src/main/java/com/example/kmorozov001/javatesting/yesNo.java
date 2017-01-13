package com.example.kmorozov001.javatesting;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Random;

import static com.example.kmorozov001.javatesting.MainActivity.FILENAMEALL;
import static com.example.kmorozov001.javatesting.MainActivity.FILENAMENO;
import static com.example.kmorozov001.javatesting.MainActivity.FILENAMEYES;
import static com.example.kmorozov001.javatesting.MainActivity.countAllValue;
import static com.example.kmorozov001.javatesting.MainActivity.countNoValue;
import static com.example.kmorozov001.javatesting.MainActivity.countYesValue;

public class yesNo extends AppCompatActivity implements View.OnClickListener{

    TextView question;
    Button yes;
    Button no;
    static String article;
    int cursorPosition;
    public DatabaseHelperYesNo mDatabaseHelper;
    public SQLiteDatabase mSqLiteDatabase;

    TextView countAll;
    TextView countYes;
    TextView countNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes_no);

        yes = (Button) findViewById(R.id.yes);
        yes.setOnClickListener(this);

        no = (Button) findViewById(R.id.no);
        no.setOnClickListener(this);
        question = (TextView) findViewById(R.id.question);

        mDatabaseHelper = new DatabaseHelperYesNo(this, "mydatabase3.db", null, 1);
        mSqLiteDatabase = mDatabaseHelper.getWritableDatabase();

        addYesNoInfo info = new addYesNoInfo();
        info.adding();

        // Вставляем данные в таблицу
        for(int i = 0; i < 64; i++){
            mSqLiteDatabase.insert("yesNo", null, info.array[i]);
        }

        Cursor cursor = mSqLiteDatabase.query("yesNo", new String[] {DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, DatabaseHelperYesNo.MULTY_ARTICLE},
                null, null,
                null, null, null) ;

        Random random = new Random();
        cursorPosition = random.nextInt(64);
        //cursor.moveToPosition(cursorPosition);
        cursor.moveToLast();

        String textQuestion = cursor.getString(cursor.getColumnIndex(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN));
        article = cursor.getString(cursor.getColumnIndex(DatabaseHelperYesNo.MULTY_ARTICLE));

        question = (TextView)findViewById(R.id.question);

        question.setText(Html.fromHtml(textQuestion));

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
        switch (v.getId())
        {
            case R.id.yes:

                yes.setBackgroundColor(Color.rgb(63, 81, 181));
                yes.setTextColor(Color.WHITE);

                countYesValue = String.valueOf(Integer.parseInt(countYesValue)+1);
                countAllValue = String.valueOf(Integer.parseInt(countAllValue)+1);

                writeFile(FILENAMEALL, countAllValue, countAll);
                writeFile(FILENAMEYES, countYesValue, countYes);

                Intent intent = new Intent(yesNo.this, ArticleYesNo.class);
                startActivity(intent);

                break;

            case R.id.no:
                no.setBackgroundColor(Color.rgb(169, 23, 23));
                no.setTextColor(Color.WHITE);

                countAllValue = String.valueOf(Integer.parseInt(countAllValue)+1);
                countNoValue = String.valueOf(Integer.parseInt(countNoValue)+1);

                writeFile(FILENAMEALL, countAllValue, countAll);
                writeFile(FILENAMENO, countNoValue, countNo);

                Intent intent2 = new Intent(yesNo.this, ArticleYesNo.class);
                startActivity(intent2);

                break;
        }
    }
    public void writeFile(String fileName, String value, TextView view)
    {
        try {
            OutputStream outputStream = openFileOutput(fileName, 0);
            OutputStreamWriter osw = new OutputStreamWriter(outputStream);
            osw.write(value);
            osw.close();
        } catch (Throwable t) {

        }

        try {
            InputStream inputStream = openFileInput(fileName);

            if (inputStream != null) {
                InputStreamReader isr = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(isr);
                String line;
                StringBuilder builder = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }
                view.setText(builder.toString());
                inputStream.close();

            }
        } catch (Throwable t) {

        }
    }
}
