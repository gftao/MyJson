package json;

/**
 * Created by guft on 2017/3/31.
 */
public class Msg_Body {

    private String tran_cd;
    private String ins_id_cd;
    private String url;
    private Qr_code_info qr_code_info;

    Msg_Body(){

    };

    Msg_Body(String code, String ins_id_cd, String url ){
        this.tran_cd = code;
        this.ins_id_cd = ins_id_cd;
        this.url = url;

    }

    public String gettran_cd(){
        return tran_cd;
    }
    public void settran_cd(String tran_cd){
        this.tran_cd = tran_cd;
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

    public Qr_code_info getQr_code_info(){
        return qr_code_info;
    }
    public void setQr_code_info(Qr_code_info qr_code_info){
        this.qr_code_info = qr_code_info;
    }
}
