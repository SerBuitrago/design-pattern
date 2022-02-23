package co.com.pattern.connection.impl;

import co.com.pattern.connection.Connection;
import co.com.pattern.connection.IConnection;

public class ConnectionSQLServer extends Connection implements IConnection {

    public ConnectionSQLServer(){
        super("localhost", "1524", "oracle", "root", "sqlserver");
    }

    @Override
    public void connection() {
        System.out.println("Success Connection SQLServer!");
        System.out.println(toString());
    }

    @Override
    public void disconnect() {
        System.out.println("Success Disconnect SQLServer!");
    }
}