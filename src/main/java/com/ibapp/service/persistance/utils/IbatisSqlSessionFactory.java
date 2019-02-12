package com.ibapp.service.persistance.utils;

import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;

import static com.ibapp.utils.properties.StarChartPropertiesProvider.getProperties;

public class IbatisSqlSessionFactory {

    private static SqlSessionFactory factory;

    static {
        PooledDataSourceFactory pooledDataSourceFactory = new PooledDataSourceFactory();
        pooledDataSourceFactory.setProperties(getProperties());
        DataSource dataSource = pooledDataSourceFactory.getDataSource();
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("local", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(UserDAO.class);
        factory = new SqlSessionFactoryBuilder().build(configuration);
    }

    private IbatisSqlSessionFactory() {
        //
    }


    public static SqlSessionFactory getSessionFactory() {
        return factory;
    }


}
