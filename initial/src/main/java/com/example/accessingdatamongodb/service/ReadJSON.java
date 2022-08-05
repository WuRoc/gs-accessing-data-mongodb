package com.example.accessingdatamongodb.service;

import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadJSON {
    public static void main(String args[]) {
        try {

            JsonParser parser = new JsonParser();  //创建JSON解析器
            JsonObject object = (JsonObject) parser.parse(new FileReader("D:\\IdeaProjects\\gs-accessing-data-mongodb\\initial\\src\\main\\resources\\test.json"));  //创建JsonObject对象
//            System.out.println("queryId=" + object.get("queryId").getAsString()); //将json数据转为为String型的数据
//            System.out.println("state=" + object.get("state").getAsBoolean()); //将json数据转为为boolean型的数据

            JsonArray array = object.get("json").getAsJsonArray();    //得到为json的数组
            for (int i = 0; i < array.size(); i++) {
                System.out.println("---------------");
                JsonObject subObject = array.get(i).getAsJsonObject();
                System.out.println("id=" + subObject.get("id").getAsInt());
                System.out.println("name=" + subObject.get("name").getAsString());
                System.out.println("ide=" + subObject.get("ide").getAsString());
            }

        } catch (JsonIOException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}