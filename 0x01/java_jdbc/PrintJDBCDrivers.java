import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class PrintJDBCDrivers {
    public static void main(String[] args) {

        Enumeration<Driver> drivers=DriverManager.getDrivers();

        while (drivers.hasMoreElements()) {
            Driver driver=drivers.nextElement();
            String driverName=driver.getClass().getName();
            String driverVersion=driver.getClass().getPackage().getImplementationVersion();

            System.out.println(driverName+" "+driverVersion);
        }
    }
}
