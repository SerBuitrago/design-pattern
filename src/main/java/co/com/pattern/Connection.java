package co.com.pattern;

public class Connection {

    private static Connection connection;

    private  Connection(){
    }

    public static Connection getConnection(){
        if(connection == null)
            connection = new Connection();
        return connection;
    }

    public void connection(){
        System.out.println("Success Connection!");
    }

    public void disconnect(){
        connection = null;
        System.out.println("Success Disconnect!");
    }
}
