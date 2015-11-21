package br.com.freela.rosasmobileapp.Utilities.Components;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import br.com.freela.rosasmobileapp.Controller.LoginActivity;
import br.com.freela.rosasmobileapp.Model.User;
import br.com.freela.rosasmobileapp.Utilities.Data.Util;

/**
 * Created by claudio on 21/11/2015.
 */
public class UserControlActivity
{
    private static UserControlActivity INSTANCE = new UserControlActivity();
    public static UserControlActivity getInstance() { return INSTANCE; }

    private User user;

    public UserControlActivity()
    {
        this.user = new User();
    }

    protected void consoleLog(String message)
    {
        Util.consoleLog( message );
    }

    public void doLogin(String username, String password)
    {
        this.user = new User(username, password);
        this.user.doLogin();
    }

    public boolean isLogged() {
        return this.user.isLogged();
    }
}
