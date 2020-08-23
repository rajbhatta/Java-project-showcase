package raj.java.generic.service;

import raj.java.generic.config.PropertyService;
import raj.java.generic.dao.MySqlDao;
import raj.java.generic.dao.SqlDao;
import raj.java.generic.model.Customer;

import java.sql.SQLException;
import java.util.List;

public class HotelCustomerService implements CustomerService{

    PropertyService propertyService;
    SqlDao sqlDao;

    public HotelCustomerService(PropertyService propertyService) {
        this.propertyService = propertyService;
        sqlDao=new MySqlDao(propertyService.getMysqlHostUrl(),propertyService.getMysqlUserName(),propertyService.getMySqlPassword());
    }


    public void checkCustomerCredit(Customer customer) {
    }

    public void save(Customer customer) throws SQLException {
        sqlDao.save(customer);
    }

    public List<Customer> get() {
        return null;
    }

    public Customer getById(Customer customer) {
        return null;
    }

    public void delete(Customer customer) {

    }
}
