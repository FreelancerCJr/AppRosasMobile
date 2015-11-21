package br.com.freela.rosasmobileapp.Utilities.Data;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by claudio on 21/11/2015.
 */
public class Util {

    public static String getDefaultTAG()
    {
        return "ROSASAPP";
    }

    public static void consoleLog( String message )
    {
        Log.i(getDefaultTAG(), message);
    }

    public static void alert(Context context, String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
