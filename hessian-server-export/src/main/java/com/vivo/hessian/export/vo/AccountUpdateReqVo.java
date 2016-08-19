package com.vivo.hessian.export.vo;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: guohairui
 * Date: 15-6-3
 * Time: 下午4:21
 * To change this template use File | Settings | File Templates.
 */
public class AccountUpdateReqVo implements Serializable {

    /**
     * 京东商品编号
     */
    private String itemId;
    /**
     * 保险公司险种编码
     */
    private String productCode;
    /**
     * 操作描述
     */
    private String operDesc;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getOperDesc() {
        return operDesc;
    }

    public void setOperDesc(String operDesc) {
        this.operDesc = operDesc;
    }
}
