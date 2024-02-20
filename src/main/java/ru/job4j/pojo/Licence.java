package ru.job4j.pojo;

import java.util.Date;

public class Licence {
    private String owner;
    private String mddel;
    private String code;
    private Date created;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMddel() {
        return mddel;
    }

    public void setMddel(String mddel) {
        this.mddel = mddel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
