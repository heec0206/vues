package springboot.hc.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
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
public class BoardGalleryList {
    @ResponseBody
    @RequestMapping("/BoardGalleryList")

    public Map<String, Object> BoardGalleryList() {

        Map<String, Object> result = new HashMap<String, Object>();

         Map<String, Object> map = new HashMap<String, Object>();
         Map<String, Object> map2 = new HashMap<String, Object>();
         //Map<String, Object> map3 = new HashMap<String, Object>();

         map.put("title", "EOD 고성");
         map.put("date", "2020.06.11");
         map.put("img", "list01.jpg");
         map.put("seq", "seq01");
         map.put("No", 1);

         map2.put("title", "EOD 훗카이도");
         map2.put("date", "2020.06.11");
         map2.put("img", "list02.jpg");
         map2.put("seq", "seq01");
         map2.put("No", 2);

        List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
        dataList.add(map);
        dataList.add(map2);
        //dataList.add(map3);

        //result.put("resultCD","0");
        //result.put("msg","데이터 조회 성공");
        result.put("data",dataList);

        return result;

     }
    }
