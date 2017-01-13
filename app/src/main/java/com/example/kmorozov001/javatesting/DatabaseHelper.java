package com.example.kmorozov001.javatesting;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper implements BaseColumns {

    // названия столбцов
    public static final String QUESTION_COLUMN = "Question";
    public static final String WRONG_ANSWER_1 = "AnswerOne";
    public static final String WRONG_ANSWER_2 = "AnswerTwo";
    public static final String WRONG_ANSWER_3 = "AnswerThree";
    public static final String WRITE_ANSWER = "AnswerWrite";
    public static final String ARTICLE = "Article";


    // имя базы данных
    private static final String DATABASE_NAME = "mydatabase.db";
    // версия базы данных
    private static final int DATABASE_VERSION = 1;
    // имя таблицы
    private static final String DATABASE_TABLE = "vars";


    private static final String DATABASE_CREATE_SCRIPT = "create table "
            + DATABASE_TABLE + " (" + BaseColumns._ID
            + " integer primary key autoincrement, " + QUESTION_COLUMN
            + " text not null, " + WRONG_ANSWER_1 + " integer, "  + WRONG_ANSWER_2 + " integer, " + WRONG_ANSWER_3 + " integer, " + WRITE_ANSWER
            + " integer, " + ARTICLE + " integer);";


    DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,
                          int version) {
        super(context, name, factory, version);
    }

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,
                          int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE_SCRIPT);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Запишем в журнал
        Log.w("SQLite", "Обновляемся с версии " + oldVersion + " на версию " + newVersion);

        // Удаляем старую таблицу и создаём новую
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_TABLE);
        // Создаём новую таблицу
        onCreate(db);
    }
}