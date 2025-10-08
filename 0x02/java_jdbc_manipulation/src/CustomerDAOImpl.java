import java.sql.Connection;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public Connection connect(String connectionUrl) {
        return null;
    }

    @Override
    public void createTable(String connectionUrl) {

    }

    @Override
    public void insert(String connectionUrl, Customer customer) {

    }

    @Override
    public void selectAll(String connectionUrl) {

    }

    @Override
    public void update(String connectionUrl, int id, String name, Integer age) {

    }

    @Override
    public void delete(String connectionUrl, int id) {

    }
}
