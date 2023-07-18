package com.example.demo.dao;


import com.example.demo.db.DBManager;
import com.example.demo.vo.AccountVO;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAO {

    public AccountVO findMyPage(int a_no){
        return DBManager.getProfile(a_no);
    }
    public int updateProfileImg(AccountVO a){
        return DBManager.updateProfile(a);
    }
}
