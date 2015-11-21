package br.com.freela.rosasmobileapp.Controller;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.freela.rosasmobileapp.R;
import br.com.freela.rosasmobileapp.Utilities.Components.DebugActivity;
import br.com.freela.rosasmobileapp.Utilities.Components.UserControlActivity;
import br.com.freela.rosasmobileapp.Utilities.Data.Util;

public class LoginActivity extends DebugActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(actionBar.getTitle() + " - Login");

        Button btEntrar = (Button) findViewById(R.id.btLogin);
        btEntrar.setOnClickListener(getButtonListener());


    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public View.OnClickListener getButtonListener()
    {
        return new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                String username = ((EditText) findViewById(R.id.tLogin)).getText().toString();
                String password = ((EditText) findViewById(R.id.tSenha)).getText().toString();

                UserControlActivity uca = UserControlActivity.getInstance();
                uca.doLogin(username, password);

                if(uca.isLogged())
                {
                    Intent intent = new Intent(getContext(), SelectSearchActivity.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    Util.alert(getContext(), "Usuário ou senha incorretos" );
                }

            }
        };
    }

    public Context getContext() { return this; }
}
