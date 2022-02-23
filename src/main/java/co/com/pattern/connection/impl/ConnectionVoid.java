package co.com.pattern.connection.impl;

import co.com.pattern.connection.Connection;
import co.com.pattern.connection.IConnection;

public class ConnectionVoid extends Connection implements IConnection {

    @Override
    public void connection() {
        System.out.println("Error Connection Provider!");
    }

    @Override
    public void disconnect() {
        System.out.println("Error Disconnect Provider!");
    }
}
