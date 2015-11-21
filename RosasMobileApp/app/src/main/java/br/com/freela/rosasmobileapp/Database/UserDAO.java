package br.com.freela.rosasmobileapp.Database;

import br.com.freela.rosasmobileapp.Model.User;
import br.com.freela.rosasmobileapp.Utilities.Data.Util;

/**
 * Created by claudio on 21/11/2015.
 */
public class UserDAO {
    private User user = new User();
    private boolean isLogged = false;

    public UserDAO(User user)
    {
        this.user = user;
    }


    public void doLogin()
    {

        if("SEARCH".equalsIgnoreCase(this.user.getUsername()) && "".equalsIgnoreCase(this.user.getPassword()))
        {
            this.isLogged = true;
            Util.consoleLog( "Logado" );
        }
        else
        {
            this.isLogged = false;
            Util.consoleLog( "Inválido" );
        }

    }

    public boolean isLogged() {
        return isLogged;
    }
}
