package json;

/**
 * Created by guft on 2017/4/11.
 */
public  class Qr_code_info {
    private String auth_code;

    Qr_code_info(){

    }
    public void setauth_code(String qr_code_info){
        this.auth_code = qr_code_info;
    }
    public String getauth_code(){
        return this.auth_code;
    }
}
