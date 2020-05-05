package com.dayspring.study.controller;

import com.dayspring.study.service.BoardService;
import com.dayspring.study.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
                return new ResponseEntity<>(HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch(Exception e){
            throw new Exception(e.getMessage(), e);
        }
    }

    @GetMapping
    public ResponseEntity read(@PathVariable("bno") int bno) throws Exception{

        try{
            BoardVO vo = boardService.read(bno);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            throw new Exception(e.getMessage(), e);
        }
    }
}
