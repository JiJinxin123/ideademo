package com.jk.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/14.
 */
public class Cangku implements Serializable {
    private static final long serialVersionUID = 8552785402288780370L;
    private Integer cangkuId;
    private Date cangkuDate;
    private String cangkuAddress;
    private Integer cangkuPrice;
    private Integer denji;
    private Integer state;

    public Integer getCangkuId() {
        return cangkuId;
    }

    public void setCangkuId(Integer cangkuId) {
        this.cangkuId = cangkuId;
    }

    public Date getCangkuDate() {
        return cangkuDate;
    }

    public void setCangkuDate(Date cangkuDate) {
        this.cangkuDate = cangkuDate;
    }

    public String getCangkuAddress() {
        return cangkuAddress;
    }

    public void setCangkuAddress(String cangkuAddress) {
        this.cangkuAddress = cangkuAddress;
    }

    public Integer getCangkuPrice() {
        return cangkuPrice;
    }

    public void setCangkuPrice(Integer cangkuPrice) {
        this.cangkuPrice = cangkuPrice;
    }

    public Integer getDenji() {
        return denji;
    }

    public void setDenji(Integer denji) {
        this.denji = denji;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cangku cangku = (Cangku) o;

        return cangkuId.equals(cangku.cangkuId);

    }

    @Override
    public int hashCode() {
        return cangkuId.hashCode();
    }

    @Override
    public String toString() {
        return "Cangku{" +
                "cangkuId=" + cangkuId +
                ", cangkuDate=" + cangkuDate +
                ", cangkuAddress='" + cangkuAddress + '\'' +
                ", cangkuPrice=" + cangkuPrice +
                ", denji=" + denji +
                ", state=" + state +
                '}';
    }
}
