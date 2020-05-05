package com.dayspring.study.dao;

import com.dayspring.study.vo.BoardVO;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardDao {

    public int create(BoardVO vo);

    public BoardVO read(int bno);

}
