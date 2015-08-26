package egat.masterrit.newssrodegat;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 8/26/2015.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    // Explicit ประกาศตัวแปร
    private static final String DATABASE_NAME = "srod.db";
    private static final int DATABASE_VARSION = 1;
    private static final String CREATE_USER_TABLE = "create table userTABLE " +
            "(_id integer primary key, User text, Password text, Name text);";
    private static final String CREATE_NEWS_TABLE = "create table newsTABLE " +
            "(_id integer primary key, Date text, Head text, Detail text, Image text, Owner text);";


    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VARSION);
    }// Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_USER_TABLE);
        sqLiteDatabase.execSQL(CREATE_NEWS_TABLE);
        
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}// Main Class
