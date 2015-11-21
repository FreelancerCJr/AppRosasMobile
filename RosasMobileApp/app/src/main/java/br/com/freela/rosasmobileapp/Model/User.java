package br.com.freela.rosasmobileapp.Model;

import br.com.freela.rosasmobileapp.Database.UserDAO;
import br.com.freela.rosasmobileapp.Utilities.Data.Util;

/**
 * Created by claudio on 21/11/2015.
 */
public class User {
    private String username;
    private String password;
    private boolean logged;
    private UserDAO userDAO;

    public User(String usename, String password)
    {
        this.username       = usename;
        this.password       = password;
        this.userDAO        = new UserDAO(this);
    }

    public void doLogin() {
        this.userDAO.doLogin();
        Util.consoleLog( "Logando" );
    }

    public User()
    {
        this.username       = "";
        this.password       = "";
        this.logged         = false;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLogged() {
        return this.userDAO.isLogged();
    }
}
