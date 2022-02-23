package co.com.pattern.factory.rest;

import co.com.pattern.factory.IAbstractFactory;
import co.com.pattern.factory.connection.ConnectionType;
import co.com.pattern.type.connection.IConnection;
import co.com.pattern.type.rest.IRest;
import co.com.pattern.type.rest.impl.RestBuy;
import co.com.pattern.type.rest.impl.RestNoArea;
import co.com.pattern.type.rest.impl.RestSale;

public class RestFactory implements IAbstractFactory {

    @Override
    public IConnection getDb(ConnectionType connectionType) {
        return null;
    }

    @Override
    public IRest getRest(RestType restType) {
        if(restType == null)
            return new RestNoArea();
        IRest rest = null;
        switch (restType){
            case SALE:
                rest = new RestSale();
                break;
            case BUY:
                rest = new RestBuy();
                break;
            default:
                rest = new RestNoArea();
                break;
        }
        return rest;
    }
}
