package co.com.design;

import co.com.pattern.factory.IAbstractFactory;
import co.com.pattern.factory.connection.ConnectionType;
import co.com.pattern.factory.productor.ProductorFactory;
import co.com.pattern.factory.productor.ProductorType;
import co.com.pattern.factory.rest.RestType;
import co.com.pattern.type.connection.IConnection;
import co.com.pattern.factory.connection.ConnectionFactory;
import co.com.pattern.type.rest.IRest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	public static void main(String [] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		IAbstractFactory abstractFactoryDB = ProductorFactory.getFactory(ProductorType.DB);
		execute(abstractFactoryDB.getDb(ConnectionType.MYSQL));

		IAbstractFactory abstractFactoryRest = ProductorFactory.getFactory(ProductorType.REST);
		execute(abstractFactoryRest.getRest(RestType.BUY), "localhost:3030/buy");
	}

	void execute(IConnection connection){
		connection.connection();
		connection.disconnect();
	}

	void execute(IRest rest, String path){
		rest.read(path);
	}
}
