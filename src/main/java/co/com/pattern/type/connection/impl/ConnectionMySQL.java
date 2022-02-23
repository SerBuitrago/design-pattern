package co.com.pattern.type.connection.impl;

import co.com.pattern.type.connection.Connection;
import co.com.pattern.type.connection.IConnection;

public class ConnectionMySQL extends Connection implements IConnection {

    public ConnectionMySQL(){
        super("localhost", "1521", "mysql", "root", "mysql");
    }

    @Override
    public void connection() {
        System.out.println("Success Connection MySQL!");
        System.out.println(toString());
    }

    @Override
    public void disconnect() {
        System.out.println("Success Disconnect MySQL!");
    }
}
