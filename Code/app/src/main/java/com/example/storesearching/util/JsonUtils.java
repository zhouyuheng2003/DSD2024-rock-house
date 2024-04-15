package com.example.storesearching.util;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtils {

    // 构建 JSON 对象
    public static JSONObject buildJsonObject(int interfaceId, String currentUser, String userName, String passWord) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("InterfaceId", interfaceId);
            jsonObject.put("CurrentUser", currentUser);
            jsonObject.put("UserName", userName);
            jsonObject.put("PassWord", passWord);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    // 解析 JSON 对象
    public static void parseJsonObject(JSONObject jsonObject) {
        try {
            int interfaceId = jsonObject.getInt("InterfaceId");
            String currentUser = jsonObject.getString("CurrentUser");
            String userName = jsonObject.getString("UserName");
            String passWord = jsonObject.getString("PassWord");

            System.out.println("InterfaceId: " + interfaceId);
            System.out.println("CurrentUser: " + currentUser);
            System.out.println("UserName: " + userName);
            System.out.println("PassWord: " + passWord);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
