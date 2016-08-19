package com.vivo.hessian.dao;

import com.vivo.hessian.domain.po.CardAccount;
import com.vivo.hessian.domain.vo.CardAccountVo;

import java.util.List;

public interface CardAccountMapper {
    /**
     * 插入初始卡账户数据
     * @param record
     * @return
     */
    int insert(CardAccount record);

    /**
     * 给主卡账户价值amount累计收益
     * @param cardAccountVo
     * @return
     */
    int addIncome(CardAccountVo cardAccountVo);

    /**
     * 追加，更新卡账户价值amount
     * @param record
     * @return
     */
    int updateIssue(CardAccount record);

    /**
     * 赎回成功，减卡账户价值并解冻金额
     * @param record
     * @return
     */
    int updateRefund(CardAccount record);

    /**
     * 赎回申请&赎回失败  冻结和解冻申请金额
     * @param record
     * @return
     */
    int updateFrozenAmount(CardAccount record);

    /**
     * 查询某保单cardid账户
     * @param record
     * @return
     */
    CardAccount selectCardAccount(CardAccount record);

    /**
     * 查询某保单支付卡账户列表
     * @param record
     * @return
     */
    List<CardAccount> selectCardList(CardAccount record);

    /**
     * 维护用
     * @param record
     * @return
     */
    int systemMaintenance(CardAccount record);


}