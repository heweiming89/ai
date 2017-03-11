package com.heweiming.project.ai.controller.example;

import java.util.Collections;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.heweiming.project.ai.web.DataTablesRequest;
import com.heweiming.project.ai.web.DataTablesResponse;

@Controller
@RequestMapping(value = "/dataTables")
public class DataTablesController {

    @GetMapping(value="/orders")
    @ResponseBody
    public DataTablesResponse orders(DataTablesRequest dtRequest){
        DataTablesResponse dtResponse = new DataTablesResponse(dtRequest.getDraw());
        dtResponse.setData(Collections.EMPTY_LIST);
        dtResponse.setRecordsFiltered(178);
        dtResponse.setRecordsTotal(178);
        return dtResponse;
    }
    
    
}
