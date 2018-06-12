package com.ppdtbb.chapter2.service;

import com.ppdtbb.chapter2.helper.DatabaseHelper;
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

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList() {

        Connection conn = null;

        try {
            conn = DatabaseHelper.getConnection();
            String sql = "select * from customer";
            return DatabaseHelper.queryEntityList(Customer.class, conn, sql, null);
        } finally {
            DatabaseHelper.closeConnection(conn);
        }
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
