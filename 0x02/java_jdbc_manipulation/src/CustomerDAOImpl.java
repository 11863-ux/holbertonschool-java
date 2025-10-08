import java.sql.*;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public Connection connect(String connectionUrl) {
        try {
            Connection connection = DriverManager.getConnection(connectionUrl);
            if (connection != null) {
                System.out.println("Verilənlər bazasına uğurla bağlandınız.");
            }
            return connection;
        } catch (SQLException e) {
            System.out.println("Bağlantı xətası: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void createTable(String connectionUrl) {

        String sql="Create Table If Not Exists customer(" +
                "id Integer Primary Key Autoincrement," +
                "name Text Not Null," +
                "age Integer," +
                "cpf Text," +
                "rg Text)";

        try(Connection connection=connect(connectionUrl);
            Statement statement=connection.createStatement();
        ){
            statement.executeUpdate(sql);
        }
        catch (SQLException exception){
        }

    }

    @Override
    public void insert(String connectionUrl, Customer customer) {

        String sql="Insert Into customer(name,age,cpf,rg) values(?,?,?,?)";

        try(Connection connection=connect(connectionUrl);
            PreparedStatement statement=connection.prepareStatement(sql);
        ){
            statement.setString(1, customer.name);
            statement.setInt(2, customer.age);
            statement.setString(3, customer.cpf);
            statement.setString(4, customer.rg);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Insert xətası: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public void selectAll(String connectionUrl) {
        String sql="Select * from customer";

        try(Connection connection=connect(connectionUrl);
            Statement statement= connection.createStatement();) {

            ResultSet result=statement.executeQuery(sql);

            while(result.next()){
                int id=result.getInt("id");
                String name=result.getString("name");
                int age=result.getInt("age");
                String cpf=result.getString("cpf");
                String rg=result.getString("rg");
                Customer customer=new Customer();
                customer.setId(id);
                customer.setName(name);
                customer.setAge(age);
                customer.setCpf(cpf);
                customer.setRg(rg);
                System.out.println(customer);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(String connectionUrl, int id, String name, Integer age) {
        String sql="Update customer set name=?,age=? where id=?";

        try(Connection connection=connect(connectionUrl);
            PreparedStatement statement=connection.prepareStatement(sql);) {

            statement.setString(1, name);
            statement.setInt(2, age);
            statement.setInt(3, id);
            statement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void delete(String connectionUrl, int id) {
        String sql="Delete from customer where id=?";

        try(Connection connection=connect(connectionUrl);
            PreparedStatement statement=connection.prepareStatement(sql);){

            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
