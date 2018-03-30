package cn.jyuyang.service;

import cn.jyuyang.dao.UserDao;

public class UserService {
    private UserDao userDao;
      private UserService(UserDao userDao){
           this.userDao = userDao;
       }
        public void saveUtil(){
            userDao.save();
        }

      public void setUserDao(UserDao userDao) {
           this.userDao = userDao;
       }
}
