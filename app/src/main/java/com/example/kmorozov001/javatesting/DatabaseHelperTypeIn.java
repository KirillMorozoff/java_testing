package com.example.kmorozov001.javatesting;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

public class DatabaseHelperTypeIn extends SQLiteOpenHelper implements BaseColumns {

    // названия столбцов
    public static final String MULTY_QUESTION_COLUMN = "Question";
    public static final String ANSWER_1 = "AnswerOne";
    public static final String ANSWER_2 = "AnswerTwo";
    public static final String ANSWER_3 = "AnswerThree";

    public static final String MULTY_ARTICLE = "Article";

    // имя базы данных
    private static final String DATABASE_NAME = "mydatabase2.db";
    // версия базы данных
    private static final int DATABASE_VERSION = 1;
    // имя таблицы
    private static final String DATABASE_TABLE2 = "multyVars";


    private static final String DATABASE_CREATE_SCRIPT2 = "create table "
            + DATABASE_TABLE2 + " (" + BaseColumns._ID
            + " integer primary key autoincrement, " + MULTY_QUESTION_COLUMN
            + " text not null, " + ANSWER_1 + " integer, "  + ANSWER_2 + " integer, " + ANSWER_3 + " integer, " + MULTY_ARTICLE + " integer);";

    DatabaseHelperTypeIn(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public DatabaseHelperTypeIn(Context context, String name, SQLiteDatabase.CursorFactory factory,
                                int version) {
        super(context, name, factory, version);
    }

    public DatabaseHelperTypeIn(Context context, String name, SQLiteDatabase.CursorFactory factory,
                                int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db2) {
        db2.execSQL(DATABASE_CREATE_SCRIPT2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Запишем в журнал
        Log.w("SQLite", "Обновляемся с версии " + oldVersion + " на версию " + newVersion);

        // Удаляем старую таблицу и создаём новую
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_TABLE2);
        // Создаём новую таблицу
        onCreate(db);
    }
}