package co.com.pattern.connection.impl;

import co.com.pattern.connection.Connection;
import co.com.pattern.connection.IConnection;

public class ConnectionOracle extends Connection implements IConnection {

    public ConnectionOracle(){
        super("localhost", "1523", "oracle", "root", "oracle");
    }

    @Override
    public void connection() {
        System.out.println("Success Connection Oracle!");
        System.out.println(toString());
    }

    @Override
    public void disconnect() {
        System.out.println("Success Disconnect Oracle!");
    }
}
