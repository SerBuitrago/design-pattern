package co.com.pattern.factory;

import co.com.pattern.factory.connection.ConnectionType;
import co.com.pattern.factory.rest.RestType;
import co.com.pattern.type.connection.IConnection;
import co.com.pattern.type.rest.IRest;

public interface IAbstractFactory {

    IConnection getDb(ConnectionType connectionType);
    IRest getRest(RestType restType);
}
