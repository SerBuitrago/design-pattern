package co.com.pattern.factory.connection;

import co.com.pattern.factory.IAbstractFactory;
import co.com.pattern.factory.rest.RestType;
import co.com.pattern.type.connection.IConnection;
import co.com.pattern.type.connection.impl.*;
import co.com.pattern.type.rest.IRest;

public class ConnectionFactory implements IAbstractFactory {

    @Override
    public IConnection getDb(ConnectionType connectionType) {
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

    @Override
    public IRest getRest(RestType restType) {
        return null;
    }
}
