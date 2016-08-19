package com.vivo.hessian.web.resource;

import com.vivo.hessian.export.BaseResVo;
import com.vivo.hessian.export.rest.AccountResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class AccountResourceImpl implements AccountResource {

    private static final Logger logger = LoggerFactory.getLogger(AccountResourceImpl.class);

//    @Autowired
//    private IssuePolicyService issuePolicyService;


    @Override
    public BaseResVo refund(Object refundPolicy) {
        return null;
    }
}
