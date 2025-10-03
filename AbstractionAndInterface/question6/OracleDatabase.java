package AbstractionAndInterface.question6;

public class OracleDatabase implements DatabaseOperations{

    @Override
    public void connect() {
        System.out.println("Oracle Database connecting");
    }

    @Override
    public void disconnect() {
        System.out.println("Oracle Database disconnecting");
    }

    @Override
    public void executeQuery() {
        System.out.println("Oracle Database query is executed");
    }
}
