package co.com.pattern.type.connection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Connection {
    protected String host;
    protected String port;
    protected String db;
    protected String user;
    protected String password;
}
