package com.vivo.hessian.service.impl;

import com.vivo.hessian.service.IssuePolicyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: guohairui
 * Date: 15-4-28
 * Time: 下午4:04
 * To change this template use File | Settings | File Templates.
 */
@Service("issuePolicyService")
public class IssuePolicyServiceImpl implements IssuePolicyService {

    public static final Logger logger = LoggerFactory.getLogger(IssuePolicyServiceImpl.class);

//    @Autowired
//    private MonitorManager monitorManager;

    @Override
    public boolean monitorMQ(Object recvData) {
        return false;
    }
}
