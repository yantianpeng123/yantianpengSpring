package com.yantianpeng3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
/**

* @Description:    事物原理aop编程+环绕通知+异常通知

* @Author:        yantianpeng

* @CreateDate:     2018/11/1 下午5:22


*/
@Component
public class TransactionUtils {

    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;

    /**
     * 开启事物
     * @return
     */
    public TransactionStatus begin(){
        return dataSourceTransactionManager.getTransaction(new DefaultTransactionDefinition());
    }

    /**
     *提交事物
     */
    public void commit(TransactionStatus transactionStatus){
        dataSourceTransactionManager.commit(transactionStatus);
    }

    /**
     * 事物回滚
     * @param transactionStatus
     */
    public void rollback(TransactionStatus transactionStatus){
        dataSourceTransactionManager.rollback(transactionStatus);
    }
}
