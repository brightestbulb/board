package com.dayspring.study.controller;

import com.dayspring.study.service.BoardService;
import com.dayspring.study.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/board/")
public class BoardApiController {

    private final BoardService boardService;

    @PostMapping
    public ResponseEntity insert(@RequestBody BoardVO vo) throws Exception{

        try{
            int result = boardService.regist(vo);

            if(result>0){
                return new ResponseEntity(HttpStatus.OK);
            }else{
                return new ResponseEntity(HttpStatus.NOT_FOUND);
            }
        }catch(Exception e){
            throw new Exception(e.getMessage(), e);
        }
    }
}
