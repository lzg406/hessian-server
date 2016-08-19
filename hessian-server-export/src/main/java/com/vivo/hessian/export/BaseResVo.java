package com.vivo.hessian.export;

import java.io.Serializable;


public class BaseResVo implements Serializable {

	private static final long serialVersionUID = 3899733265678514224L;

	private Result result = new Result(true);

    public BaseResVo() {
    }

    public BaseResVo(Result result) {
        this.result = result;
    }

    public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	
}
