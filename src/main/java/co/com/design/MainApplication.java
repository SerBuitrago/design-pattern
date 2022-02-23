package co.com.design;

import co.com.pattern.connection.IConnection;
import co.com.pattern.factory.ConnectionFactory;
import co.com.pattern.factory.ConnectionType;
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
		ConnectionFactory connectionFactory = new ConnectionFactory();

		execute(connectionFactory.getConnection(null));
		//execute(connectionFactory.getConnection(ConnectionType.ORACLE));
		//execute(connectionFactory.getConnection(ConnectionType.POSTGRESQL));
		//execute(connectionFactory.getConnection(ConnectionType.SQLSERVER));
		//execute(connectionFactory.getConnection(ConnectionType.VOID));
	}

	void execute(IConnection connection){
		connection.connection();
		connection.disconnect();
	}
}
