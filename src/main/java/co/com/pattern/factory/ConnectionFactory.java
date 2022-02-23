package co.com.pattern.factory;

import co.com.pattern.connection.IConnection;
import co.com.pattern.connection.impl.*;

public class ConnectionFactory {

    public IConnection getConnection(ConnectionType connectionType){
        if(connectionType == null)
            return new ConnectionVoid();
        IConnection connection = null;
        switch (connectionType){
            case MYSQL:
                connection = new ConnectionMySQL();
                break;
            case ORACLE:
                connection = new ConnectionOracle();
                break;
            case POSTGRESQL:
                connection = new ConnectionPostgreSQL();
                break;
            case SQLSERVER:
                connection = new ConnectionSQLServer();
                break;
            default:
                connection = new ConnectionVoid();
                break;
        }
        return  connection;
    }
}
