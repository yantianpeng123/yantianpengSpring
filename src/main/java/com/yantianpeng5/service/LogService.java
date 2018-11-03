package com.yantianpeng5.service;

import com.yantianpeng5.dao.Logdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogService {
    @Autowired
    private Logdao logdao;

    @Transactional(propagation = Propagation.REQUIRES_NEW)//表示事物的传播行为 不受其他事物的影响。在日志中比较适合使用这种传播行为
    public void addLog(Integer id){
        logdao.addLog(id);
    }
}
