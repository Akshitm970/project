package AbstractionAndInterface.question6;

public class MySQLDatabase implements DatabaseOperations{

    @Override
    public void connect() {
        System.out.println("MySQL Database connect is executed");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL Database disconnect is executed");
    }

    @Override
    public void executeQuery() {
        System.out.println("MySQL Database query is executed");
    }
}
