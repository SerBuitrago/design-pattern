package co.com.pattern.factory.productor;

import co.com.pattern.factory.IAbstractFactory;
import co.com.pattern.factory.connection.ConnectionFactory;
import co.com.pattern.factory.rest.RestFactory;

public class ProductorFactory {

    public static IAbstractFactory getFactory(ProductorType productorType){
        if(productorType == null)
            return null;
        IAbstractFactory abstractFactory = null;
        switch (productorType){
            case DB:
                abstractFactory = new ConnectionFactory();
                break;
            case REST:
                abstractFactory = new RestFactory();
                break;
            default:
                abstractFactory = null;
                break;
        }
        return abstractFactory;
    }
}
