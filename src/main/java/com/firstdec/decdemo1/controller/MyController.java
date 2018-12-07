package com.firstdec.decdemo1.controller;

import com.firstdec.decdemo1.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abhi on 04/12/18.
 */

@RestController
@RequestMapping(value="/first")
public class MyController {

   // @Autowired
    private MyImpl myImpl;

//    public MyController(MyImpl myImpl){
//        this.myImpl=myImpl;
//    }

    @Autowired
    public void setMyImpl(MyImpl myImpl) {
        this.myImpl = myImpl;
    }

    @RequestMapping(value="/getdata")
    public String sendData(){
        return myImpl.getData();
    }
}
