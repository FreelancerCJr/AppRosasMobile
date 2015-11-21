package br.com.freela.rosasmobileapp.Utilities.Components;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.freela.rosasmobileapp.Model.User;
import br.com.freela.rosasmobileapp.Utilities.Data.Util;

/**
 * Created by claudio on 21/11/2015.
 */
public class DebugActivity extends AppCompatActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Util.consoleLog(getClassName() + ".onCreate() chamado: " + savedInstanceState);
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Util.consoleLog(getClassName() + ".onStop() chamado.");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Util.consoleLog(getClassName() + ".onDestroy() chamado.");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Util.consoleLog(getClassName() + ".onPause() chamado.");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Util.consoleLog(getClassName() + ".onResume() chamado.");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Util.consoleLog(getClassName() + ".onStart() chamado.");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Util.consoleLog(getClassName() + ".onRestart() chamado.");
    }

    protected String getClassName()
    {
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }
}
