package springboot.hc.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:8088")
public class BoardController {
    @ResponseBody
    @RequestMapping("/board")

    public Map<String, Object> boardInfo() {

        Map<String, Object> map = new HashMap<String, Object>();
        //map.put("img", "list01.jpg");
        map.put("title", "EOD 고성");
        map.put("date", 2020.06.11);
        map.put("No", 1);


        return map;
    }
        /*
        public static void main(String[] args) {
            // JsonObject 생성
            JSONObject jsonObject = new JSONObject();
            //person의 JSON정보를 담을 Array 선언
            JSONArray personArray = new JSONArray();
            //person의 한명 정보가 들어갈 JSONObject 선언
            JSONObject personInfo = new JSONObject();

            personInfo.put("No", "1");
            personInfo.put("title", "EOD 고성 Traverls");
            personInfo.put("date", "2019.06.23");
            personInfo.put("img", "@/assets/images/list02.jpg");
            personArray.add(personInfo);

            personInfo = new JSONObject();
            personInfo.put("No", "2");
            personInfo.put("title", "EOD Japan Travels");
            personInfo.put("date", "2019.09.22");
            personInfo.put("img", "@/assets/images/list01.jpg");

            personArray.add(personInfo);

            //System.out.println("JsonObject 생성 : " + jsonObject.toString() + "\n");

            // Parse Pretty
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonOutput = gson.toJson(personArray);

            clearScreen();
            System.out.println(jsonOutput);
        }

        public static void clearScreen() {
            for (int i = 0; i < 80; i++)
                System.out.println("");
        }
        */




    }


