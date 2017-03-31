package json;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.PropertyFilter;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by guft on 2017/3/31.
 */
public class MyJson extends Person {
    private String name;
    private int age;
    private String body;
    private String sign;

    //一定要加上默认构造函数，否则JSONObject.toBean时候回出错。
    public MyJson(){

    }
    public MyJson(String name, int age, int num, String sex){
        this.name = name;
        this.age = age;
        super.num = num;
        super.sex = sex;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAge(){
        //return age+"";
        //return String.valueOf(age);
        return Integer.toString(age);
    }
    //重写会直接影响JSONObject.toBean解析字段是否输出。
    public void setAge(String age){
        this.age = Integer.valueOf(age);
    }

    public void setBody(String body){
        this.body = body;
    }
    public String getBody(){
        return body;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
    /* json 是int型。
    public int getAge(){
        return age;
    }*/

    public String showMyJson(){
        return "nane:"+ name +"  " + "age:"+ age + " " + "num:"+ num + " body:"+body;
    }


    public static void main(String[] args){
        MyJson mj = new MyJson("myjson",28, 1222221, "man");
        Msg_Body body = new Msg_Body("T2sss3","10000405","http://shangbin.xinyunzhibo.com/Api/notify/index/");


        ConsJson json = new ConsJson();
        String b = json.Object2Json(body);
        System.out.println(b);

        mj.setBody(b);
        mj.setSign("======");
        String jStr = json.Object2Json(mj);

        System.out.println(jStr);
        //JSONObject jsonObject  = new JSONObject().fromObject(b);
        JSONObject jsonObject  = new JSONObject().fromObject(jStr);

        //System.out.println(jsonObject .getString("body"));
        //Msg_Body msg_body = (Msg_Body)JSONObject.toBean(jsonObject,Msg_Body.class);
        //System.out.println(msg_body.getCode());
        MyJson myJson =(MyJson)JSONObject.toBean(jsonObject,MyJson.class);
        System.out.println(myJson.showMyJson());
    }
 }
