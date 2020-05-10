package com.evaluation.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IdUtil {
    public static Long getNewId(){
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String newId = dateFormat.format(new Date());
        return Long.parseLong(newId);
    }
}
