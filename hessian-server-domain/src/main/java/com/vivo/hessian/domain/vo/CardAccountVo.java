package com.vivo.hessian.domain.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class CardAccountVo implements Serializable {

    private String pin;

    private String policyNo;
    /**
     * 昨日收益
     */
    private BigDecimal profit;
    /**
     * 保险公司编码
     */
    private String comId;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }
}