package springboot.hc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:8088")
public class BoardGalleryView {
    @ResponseBody
    @RequestMapping("/BoardGalleryView/seq01")

    public Map<String, Object> BoardGalleryView() {

        Map<String, Object> result = new HashMap<String, Object>();

         Map<String, Object> map = new HashMap<String, Object>();


         map.put("title", "EOD 고성1");
         map.put("date", "2020.06.11");
         map.put("img", "list01.jpg");
         map.put("contents", "EOD 고성1 상세 페이지");
         map.put("No", 1);


        List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
        dataList.add(map);
        //result.put("resultCD","0");
        //result.put("msg","데이터 조회 성공");
        result.put("BoardGalleryView",dataList);

        return result;

     }
    }
