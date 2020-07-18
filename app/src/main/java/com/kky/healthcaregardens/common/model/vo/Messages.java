package com.kky.healthcaregardens.common.model.vo;

public class Messages {
        /**
         * 登录使用的账户，
         * 系统中该用户的手机号码
         */
        private String code;
        private String msg;
        private boolean data;
        private boolean ok;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean getData() {
        return data;
    }

    public void setData(boolean data) {
        this.data = data;
    }

    public boolean getOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }
}
