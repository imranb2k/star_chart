/*
package com.ibapp.service.services;

import com.ibapp.domain.model.User;
import com.ibapp.service.persistance.UserDAO;
import org.apache.ibatis.session.SqlSession;

import static com.ibapp.service.persistance.utils.IbatisSqlSessionFactory.getSessionFactory;

// TODO: TaskDao should be injected
public class IbatisUserManagement implements UserManagement {

//    private final TaskDao taskDao;
//
//    public IbatisTasksManagement(TaskDao taskDao){
//        this.taskDao = taskDao;
//    }


    @Override
    public Long create(Long Id, String name, Integer age) {
        SqlSession sqlSession = getSessionFactory().openSession();
        try {
            UserDAO userDao = sqlSession.getMapper(UserDAO.class);
            User newUser = new User();

            newUser.setId(Id);
            newUser.setName(name);
            newUser.setAge(age);

            return userDao.create(newUser);
//            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Override
    public User findBy(Long id) {
        SqlSession sqlSession = getSessionFactory().openSession();
        try {
            UserDAO userDao = sqlSession.getMapper(UserDAO.class);
            User user = userDao.findById(id);
            return user;
        } finally {
            sqlSession.close();
        }
    }

    @Override
    public void deleteAll() {
        SqlSession sqlSession = getSessionFactory().openSession();
        try {
            UserDAO userDao = sqlSession.getMapper(UserDAO.class);
            userDao.deleteAll();
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }


    @Override
    public void update(User user) {
        SqlSession sqlSession = getSessionFactory().openSession();
        try {
            UserDAO userDao = sqlSession.getMapper(UserDAO.class);
            userDao.update(user);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

}
*/
