package com.dayspring.study.dao;

import com.dayspring.study.service.BoardService;
import com.dayspring.study.vo.BoardVO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardDaoTest {

    @Autowired
    BoardService boardService;

    @Test
    public void create() throws Exception {

        BoardVO vo = new BoardVO();
        vo.setTitle("글 등록 테스트");
        vo.setContent("글 내용 등록 테스트");
        vo.setWriter("admin");

        int result = boardService.regist(vo);

        Assert.assertTrue(result>0);
    }

    @Test
    public void read() throws Exception{
        int bno = 1;
        BoardVO vo = boardService.read(bno);
        Assert.assertTrue(vo.getTitle().equals("글 등록 테스트"));
        Assert.assertTrue(vo.getContent().equals("글 내용 등록 테스트"));
        Assert.assertTrue(vo.getWriter().equals("admin"));
    }
}
