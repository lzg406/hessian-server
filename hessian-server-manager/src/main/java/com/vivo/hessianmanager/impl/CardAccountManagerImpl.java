package com.vivo.hessianmanager.impl;

import com.vivo.hessian.dao.CardAccountMapper;
import com.vivo.hessian.domain.po.CardAccount;
import com.vivo.hessianmanager.CardAccountManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: guohairui
 * Date: 15-6-29
 * Time: 下午7:48
 * To change this template use File | Settings | File Templates.
 */
@Service("cardAccountManager")
public class CardAccountManagerImpl implements CardAccountManager {
    @Autowired
    private CardAccountMapper cardAccountMapper;

    @Override
    public int insert(CardAccount record) {
        return cardAccountMapper.insert(record);
    }
}
