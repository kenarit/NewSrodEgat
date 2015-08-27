package egat.masterrit.newssrodegat;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by user on 8/27/2015.
 */
public class UserTABLE {
    // Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public UserTABLE(Context context) {

        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();

    } // Constructor
} // Main Class
