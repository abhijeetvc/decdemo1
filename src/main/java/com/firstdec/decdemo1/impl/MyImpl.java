package com.firstdec.decdemo1.impl;

import com.firstdec.decdemo1.myinterfaces.FirstInterface;
import org.springframework.stereotype.Service;

/**
 * Created by abhi on 04/12/18.
 */

@Service
public class MyImpl implements FirstInterface {

    @Override
    public String getData() {
        return "Hi hello";
    }
}
