package com.example.kmorozov001.javatesting;

import android.content.ContentValues;
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
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView question;
    TextView countAll;
    TextView countYes;
    TextView countNo;

    Button answerOne;
    Button answerTwo;
    Button answerThree;
    Button answerFour;

    public static String countAllValue = "0";
    public static String countYesValue = "0";
    public static String countNoValue = "0";

    String wrongAnswer1;
    String wrongAnswer2;
    String wrongAnswer3;
    String writeAnswer;
    static String article;
    ContentValues updateCount;

    public final static String FILENAMEALL = "countAll.txt";
    public final static String FILENAMEYES = "countYes.txt";
    public final static String FILENAMENO = "countNo.txt";


    int cursorPosition;

    public DatabaseHelper mDatabaseHelper;
    public SQLiteDatabase mSqLiteDatabase;

    public DatabaseHelperCount mDatabaseHelperCount;
    public SQLiteDatabase mSqLiteDatabaseCount;

    @Override
    public void onCreate(Bundle savedInstanceState) {

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


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerOne = (Button) findViewById(R.id.button);
        answerOne.setOnClickListener(this);

        answerTwo = (Button) findViewById(R.id.button2);
        answerTwo.setOnClickListener(this);

        answerThree = (Button) findViewById(R.id.button3);
        answerThree.setOnClickListener(this);

        answerFour = (Button) findViewById(R.id.button4);
        answerFour.setOnClickListener(this);

        question = (TextView) findViewById(R.id.question);

        countAll = (TextView) findViewById(R.id.editText2);
        countYes = (TextView) findViewById(R.id.editText3);
        countNo = (TextView) findViewById(R.id.editText4);



        //Добавление счетчика____________________________________________________________________________________________________________________

        mDatabaseHelperCount = new DatabaseHelperCount(this, "mydatabase4.db", null, 1);
        mSqLiteDatabaseCount = mDatabaseHelperCount.getWritableDatabase();

        updateCount = new ContentValues();
        updateCount.put(DatabaseHelperCount.ALL, countAllValue);
        updateCount.put(DatabaseHelperCount.YES, countYesValue);
        updateCount.put(DatabaseHelperCount.NO, countNoValue);

        mSqLiteDatabaseCount.insert("count", null, updateCount);

        Cursor cursorCount = mSqLiteDatabaseCount.query("count", new String[] {DatabaseHelperCount.ALL,
                       DatabaseHelperCount.YES, DatabaseHelperCount.NO},
                null, null,
                null, null, null) ;
        cursorCount.moveToLast();

        countAll.setText(cursorCount.getString(cursorCount.getColumnIndex(DatabaseHelperCount.ALL)));
        countYes.setText(cursorCount.getString(cursorCount.getColumnIndex(DatabaseHelperCount.YES)));
        countNo.setText(cursorCount.getString(cursorCount.getColumnIndex(DatabaseHelperCount.NO)));
        // не забываем закрывать курсор
        cursorCount.close();

        //________________________________________________________________________________________________________________________________________

        mDatabaseHelper = new DatabaseHelper(this, "mydatabase.db", null, 1);
        mSqLiteDatabase = mDatabaseHelper.getWritableDatabase();

        addInfo info = new addInfo();
        info.adding();
       // Вставляем данные в таблицу
        for(int i = 0; i < 64; i++){
            mSqLiteDatabase.insert("vars", null, info.array[i]);
        }

        Cursor cursor = mSqLiteDatabase.query("vars", new String[] {DatabaseHelper.QUESTION_COLUMN,
                        DatabaseHelper.WRONG_ANSWER_1, DatabaseHelper.WRONG_ANSWER_2, DatabaseHelper.WRONG_ANSWER_3, DatabaseHelper.WRITE_ANSWER,
                        DatabaseHelper.ARTICLE},
                null, null,
                null, null, null) ;

        Random random = new Random();
        cursorPosition = random.nextInt(64);
        //cursor.moveToPosition(cursorPosition);
        cursor.moveToLast();

        String textQuestion = cursor.getString(cursor.getColumnIndex(DatabaseHelper.QUESTION_COLUMN));
        article = cursor.getString(cursor.getColumnIndex(DatabaseHelper.ARTICLE));

        question = (TextView)findViewById(R.id.question);

        question.setText(Html.fromHtml(textQuestion));

        // Добавление ответов в коллекцию и их перемешивание

        wrongAnswer1 = cursor.getString(cursor.getColumnIndex(DatabaseHelper.WRONG_ANSWER_1));
        wrongAnswer2 = cursor.getString(cursor.getColumnIndex(DatabaseHelper.WRONG_ANSWER_2));
        wrongAnswer3 = cursor.getString(cursor.getColumnIndex(DatabaseHelper.WRONG_ANSWER_3));
        writeAnswer = cursor.getString(cursor.getColumnIndex(DatabaseHelper.WRITE_ANSWER));

        ArrayList<String> answers = new ArrayList<>();
        answers.add(wrongAnswer1);
        answers.add(wrongAnswer2);
        answers.add(wrongAnswer3);
        answers.add(writeAnswer);

        Collections.shuffle(answers);

        answerOne.setText(answers.get(0));
        answerTwo.setText(answers.get(1));
        answerThree.setText(answers.get(2));
        answerFour.setText(answers.get(3));
        // не забываем закрывать курсор
        cursor.close();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button:
                if (answerOne.getText().equals(writeAnswer))
                {
                    answerOne.setBackgroundColor(Color.rgb(63, 81, 181));
                    answerOne.setTextColor(Color.WHITE);
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Верно!", Toast.LENGTH_SHORT);
                    toast.show();

                    countAllValue = String.valueOf(Integer.parseInt(countAllValue)+1);
                    countYesValue = String.valueOf(Integer.parseInt(countYesValue)+1);

                    Intent intent = new Intent(MainActivity.this, ArticleActivity.class);
                    startActivity(intent);

                    writeFile(FILENAMEALL, countAllValue, countAll);
                    writeFile(FILENAMEYES, countYesValue, countYes);



                } else {
                    answerOne.setBackgroundColor(Color.rgb(169, 23, 23));
                    answerOne.setTextColor(Color.WHITE);
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Неверно!", Toast.LENGTH_SHORT);
                    toast.show();

                    countAllValue = String.valueOf(Integer.parseInt(countAllValue)+1);
                    countNoValue = String.valueOf(Integer.parseInt(countNoValue)+1);

                    writeFile(FILENAMEALL, countAllValue, countAll);
                    writeFile(FILENAMENO, countNoValue, countNo);
                }

                break;
            case R.id.button2:
                if (answerTwo.getText().equals(writeAnswer))
                {
                    answerTwo.setBackgroundColor(Color.rgb(63, 81, 181));
                    answerTwo.setTextColor(Color.WHITE);
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Верно!", Toast.LENGTH_SHORT);
                    toast.show();
                    Intent intent = new Intent(MainActivity.this, ArticleActivity.class);
                    startActivity(intent);

                    countAllValue = String.valueOf(Integer.parseInt(countAllValue)+1);
                    countYesValue = String.valueOf(Integer.parseInt(countYesValue)+1);

                    writeFile(FILENAMEALL, countAllValue, countAll);
                    writeFile(FILENAMEYES, countYesValue, countYes);

                } else {
                    answerTwo.setBackgroundColor(Color.rgb(169, 23, 23));
                    answerTwo.setTextColor(Color.WHITE);
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Неверно!", Toast.LENGTH_SHORT);
                    toast.show();

                    countAllValue = String.valueOf(Integer.parseInt(countAllValue)+1);
                    countNoValue = String.valueOf(Integer.parseInt(countNoValue)+1);

                    writeFile(FILENAMEALL, countAllValue, countAll);
                    writeFile(FILENAMENO, countNoValue, countNo);

                }
                break;
            case R.id.button3:
                if (answerThree.getText().equals(writeAnswer))
                {
                    answerThree.setBackgroundColor(Color.rgb(63, 81, 181));
                    answerThree.setTextColor(Color.WHITE);
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Верно!", Toast.LENGTH_SHORT);
                    toast.show();
                    Intent intent = new Intent(MainActivity.this, ArticleActivity.class);
                    startActivity(intent);

                    countAllValue = String.valueOf(Integer.parseInt(countAllValue)+1);
                    countYesValue = String.valueOf(Integer.parseInt(countYesValue)+1);

                    writeFile(FILENAMEALL, countAllValue, countAll);
                    writeFile(FILENAMEYES, countYesValue, countYes);

                } else {
                    answerThree.setBackgroundColor(Color.rgb(169, 23, 23));
                    answerThree.setTextColor(Color.WHITE);
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Неверно!", Toast.LENGTH_SHORT);
                    toast.show();

                    countAllValue = String.valueOf(Integer.parseInt(countAllValue)+1);
                    countNoValue = String.valueOf(Integer.parseInt(countNoValue)+1);

                    writeFile(FILENAMEALL, countAllValue, countAll);
                    writeFile(FILENAMENO, countNoValue, countNo);
                }
                break;
            case R.id.button4:
                if (answerFour.getText().equals(writeAnswer))
                {
                    answerFour.setBackgroundColor(Color.rgb(63, 81, 181));
                    answerFour.setTextColor(Color.WHITE);


                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Верно!", Toast.LENGTH_SHORT);
                    toast.show();
                    Intent intent = new Intent(MainActivity.this, ArticleActivity.class);
                    startActivity(intent);

                    countYesValue = String.valueOf(Integer.parseInt(countYesValue)+1);
                    countAllValue = String.valueOf(Integer.parseInt(countAllValue)+1);

                    writeFile(FILENAMEALL, countAllValue, countAll);
                    writeFile(FILENAMEYES, countYesValue, countYes);

                } else {
                    answerFour.setBackgroundColor(Color.rgb(169, 23, 23));
                    answerFour.setTextColor(Color.WHITE);
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Неверно!", Toast.LENGTH_SHORT);
                    toast.show();

                    countAllValue = String.valueOf(Integer.parseInt(countAllValue)+1);
                    countNoValue = String.valueOf(Integer.parseInt(countNoValue)+1);

                    writeFile(FILENAMEALL, countAllValue, countAll);
                    writeFile(FILENAMENO, countNoValue, countNo);
                }
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
