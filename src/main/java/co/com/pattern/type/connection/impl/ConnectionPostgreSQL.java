package co.com.pattern.type.connection.impl;

import co.com.pattern.type.connection.Connection;
import co.com.pattern.type.connection.IConnection;

public class ConnectionPostgreSQL extends Connection implements IConnection {

    public ConnectionPostgreSQL(){
        super("localhost", "1522", "postgresql", "root", "postgresql");
    }

    @Override
    public void connection() {
        System.out.println("Success Connection PostgreSQL!");
        System.out.println(toString());
    }

    @Override
    public void disconnect() {
        System.out.println("Success Disconnect PostgreSQL!");
    }
}