package com.ppdtbb.chapter2.service;

import com.ppdtbb.chapter2.model.Customer;
import com.ppdtbb.chapter2.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 提供客户数据服务
 */
public class CustomerService {

    private final static Logger logger = LoggerFactory.getLogger(CustomerService.class);

    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static {
        Properties conf = PropsUtil.loadProps("config.properties");
        DRIVER = conf.getProperty("jdbc.driver");
        URL = conf.getProperty("jdbc.url");
        USERNAME = conf.getProperty("jdbc.username");
        PASSWORD = conf.getProperty("jdbc.password");

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            logger.error("Can not load jdbc driver.", e);
        }
    }

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList() {

        Connection conn = null;

        try {
            List<Customer> customerList = new ArrayList<Customer>();
            conn = DriverManager.getConnection(URL);
            String sql = "select * from customer";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getLong("id"));
                customer.setName(rs.getString("name"));
                customer.setTelephone(rs.getString("telephone"));
                customer.setContact(rs.getString("contact"));
                customer.setEmail(rs.getString("email"));
                customer.setRemark(rs.getString("remark"));
                customerList.add(customer);
            }

            return customerList;
        } catch (SQLException e) {
            logger.error("Execute sql failure.", e);
        } finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    logger.error("Close connection failure.", e);
                }
            }
        }

        return null;
    }

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList(String keyword) {
        return null;
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id) {
        // TODO: 2018/6/11
        return null;
    }

    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        // TODO: 2018/6/11
        return false;
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        // TODO: 2018/6/11
        return false;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id) {
        // TODO: 2018/6/11
        return false;
    }

}
