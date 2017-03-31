package json;

/**
 * Created by guft on 2017/3/31.
 */
public class Msg_Body {

    private String code;
    private String ins_id_cd;
    private String url;

    Msg_Body(){

    }
    Msg_Body(String code, String ins_id_cd, String url){
        this.code = code;
        this.ins_id_cd = ins_id_cd;
        this.url = url;
    }
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code = code;
    }

    public String getSign() {
        return ins_id_cd;
    }

    public void setSign(String sign) {
        this.ins_id_cd = sign;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
