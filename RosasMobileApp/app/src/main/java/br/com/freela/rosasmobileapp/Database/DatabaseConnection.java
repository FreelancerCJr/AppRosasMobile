package br.com.freela.rosasmobileapp.Database;

import android.database.sqlite.SQLiteDatabase;

import java.sql.Connection;

/**
 * Created by claudio on 21/11/2015.
 */
public class DatabaseConnection {
    /*
    * Its a singleton implementation
    * */
    private static DatabaseConnection dbConnection = new DatabaseConnection();
    public static DatabaseConnection getDbConnection()
    {
        return dbConnection;
    }

    private String dbPath;

    public DatabaseConnection()
    {
        this.dbPath = "";
    }

    public String getDbPath() {
        return dbPath;
    }

    public void setDbPath(String dbPath) {
        this.dbPath = dbPath;
    }

    /*
    * This Method returns database's connection.
    * You have to input databse's file path.
    * */
    public SQLiteDatabase getConnection(String filePath)
    {
        return getInternalConnection(filePath);
    }

    /**
     * This method returns the database connection
     * @return
     */
    public SQLiteDatabase getConnection()
    {
        return getInternalConnection(this.dbPath);
    }

    private SQLiteDatabase getInternalConnection(String dbPath) {
        return SQLiteDatabase.openDatabase(dbPath, null, 1);
    }
}