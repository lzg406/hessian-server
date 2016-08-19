package com.vivo.hessian.service;


/**
 * Created with IntelliJ IDEA.
 * User: guohairui
 * Date: 15-4-28
 * Time: 下午4:04
 * To change this template use File | Settings | File Templates.
 */
public interface IssuePolicyService {
    /**
     * 监听MQ出单成功 实现体
     * @param recvData
     * @return
     */
    public boolean monitorMQ(Object recvData);


}
