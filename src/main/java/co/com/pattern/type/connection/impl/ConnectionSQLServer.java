package co.com.pattern.type.connection.impl;

import co.com.pattern.type.connection.Connection;
import co.com.pattern.type.connection.IConnection;

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