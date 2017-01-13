package com.example.kmorozov001.javatesting;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

public class DatabaseHelperYesNo extends SQLiteOpenHelper implements BaseColumns {

    // названия столбцов
    public static final String MULTY_QUESTION_COLUMN = "Question";
    public static final String MULTY_ARTICLE = "Article";

    // имя базы данных
    private static final String DATABASE_NAME = "mydatabase3.db";
    // версия базы данных
    private static final int DATABASE_VERSION = 1;
    // имя таблицы
    private static final String DATABASE_TABLE2 = "yesNo";


    private static final String DATABASE_CREATE_SCRIPT2 = "create table "
            + DATABASE_TABLE2 + " (" + BaseColumns._ID
            + " integer primary key autoincrement, " + MULTY_QUESTION_COLUMN
            + " text not null, " + MULTY_ARTICLE + " integer);";

    DatabaseHelperYesNo(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public DatabaseHelperYesNo(Context context, String name, SQLiteDatabase.CursorFactory factory,
                                int version) {
        super(context, name, factory, version);
    }

    public DatabaseHelperYesNo(Context context, String name, SQLiteDatabase.CursorFactory factory,
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