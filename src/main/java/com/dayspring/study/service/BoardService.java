package com.dayspring.study.service;

import com.dayspring.study.dao.BoardDao;
import com.dayspring.study.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardDao dao;

    public int regist(BoardVO vo) throws Exception{
        return dao.create(vo);
    }
}
