package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.EmailVo;

@Repository
public class EmaillistDao {

	@Autowired
	private SqlSession sqlSession;

	public void insert(EmailVo emailVo) {		
		sqlSession.insert("emaillist.insert", emailVo);
	}

	public List<EmailVo> getList() {
		List<EmailVo> eList = sqlSession.selectList("emaillist.getList");

		return eList;
	}

}
