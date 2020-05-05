package com.dayspring.study.service;

import com.dayspring.study.dao.BoardDao;
import com.dayspring.study.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardDao dao;

    public int regist(BoardVO vo) throws Exception{
        return dao.create(vo);
    }

    public BoardVO read(int bno){
        return dao.read(bno);
    }

}
