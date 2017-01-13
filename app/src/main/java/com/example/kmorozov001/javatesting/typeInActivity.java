package com.example.kmorozov001.javatesting;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

import static com.example.kmorozov001.javatesting.MainActivity.FILENAMEALL;
import static com.example.kmorozov001.javatesting.MainActivity.FILENAMENO;
import static com.example.kmorozov001.javatesting.MainActivity.FILENAMEYES;
import static com.example.kmorozov001.javatesting.MainActivity.countAllValue;
import static com.example.kmorozov001.javatesting.MainActivity.countNoValue;
import static com.example.kmorozov001.javatesting.MainActivity.countYesValue;

public class typeInActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text;
    Button button5;
    EditText editText;

    TextView countAll;
    TextView countYes;
    TextView countNo;

    String answer1;
    String answer2;
    String answer3;

    static String article;


    int cursorPosition;

    public DatabaseHelperTypeIn mDatabaseHelper;
    public SQLiteDatabase mSqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_in);

        text = (TextView)findViewById(R.id.question);
        button5 = (Button) findViewById(R.id.button5);
        editText = (EditText) findViewById(R.id.editText);

        countAll = (TextView)findViewById(R.id.editText2);
        countYes = (TextView)findViewById(R.id.editText3);
        countNo = (TextView)findViewById(R.id.editText4);

        button5.setOnClickListener(this);

        mDatabaseHelper = new DatabaseHelperTypeIn(this, "mydatabase2.db", null, 1);
        mSqLiteDatabase = mDatabaseHelper.getWritableDatabase();

        addTypeInInfo info = new addTypeInInfo();
        info.adding();
        // Вставляем данные в таблицу
        for(int i = 0; i < 47; i++){
            mSqLiteDatabase.insert("multyVars", null, info.array[i]);
        }

        Cursor cursor = mSqLiteDatabase.query("multyVars", new String[] {DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN,
                        DatabaseHelperTypeIn.ANSWER_1, DatabaseHelperTypeIn.ANSWER_2, DatabaseHelperTypeIn.ANSWER_3,
                        DatabaseHelperTypeIn.MULTY_ARTICLE},
                null, null,
                null, null, null) ;

        cursor.moveToLast();

        String textQuestion = cursor.getString(cursor.getColumnIndex(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN));
        article = cursor.getString(cursor.getColumnIndex(DatabaseHelperTypeIn.MULTY_ARTICLE));

        text.setText(Html.fromHtml(textQuestion));

        answer1 = cursor.getString(cursor.getColumnIndex(DatabaseHelperTypeIn.ANSWER_1));
        answer2 = cursor.getString(cursor.getColumnIndex(DatabaseHelperTypeIn.ANSWER_2));
        answer3 = cursor.getString(cursor.getColumnIndex(DatabaseHelperTypeIn.ANSWER_3));

        // не забываем закрывать курсор
        cursor.close();



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

                    if (answer1.equals(editText.getText().toString().toLowerCase()) || answer2.equals(editText.getText().toString().toLowerCase()) || answer3.equals(editText.getText().toString().toLowerCase()))
                    {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Верно!", Toast.LENGTH_SHORT);
                        toast.show();

                        countYesValue = String.valueOf(Integer.parseInt(countYesValue)+1);
                        countAllValue = String.valueOf(Integer.parseInt(countAllValue)+1);

                        writeFile(FILENAMEALL, countAllValue, countAll);
                        writeFile(FILENAMEYES, countYesValue, countYes);

                        Intent intent = new Intent(typeInActivity.this, ArticleActivityTypeIn.class);
                        startActivity(intent);
                    } else
                    {
                        Toast toast = Toast.makeText(getApplicationContext(),
                               "Неверно", Toast.LENGTH_SHORT);
                        toast.show();
                        countAllValue = String.valueOf(Integer.parseInt(countAllValue)+1);
                        countNoValue = String.valueOf(Integer.parseInt(countNoValue)+1);

                        writeFile(FILENAMEALL, countAllValue, countAll);
                        writeFile(FILENAMENO, countNoValue, countNo);


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
