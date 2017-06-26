package com.ssm.seckill.dao;

import com.ssm.seckill.entity.SuccessKiiled;

/**
 * Created by Administrator on 2017/6/26.
 */
public interface SuccessKilledDao {

    /**
     * 插入购买明细，并过滤重复
     * @param seckillId
     * @param userPhone
     * @return 插入的行数（0插入失败）
     */
    public int insertSuccesskiiled(long seckillId, long userPhone );

    /**
     *根据id查询successKilled并携带秒杀商品的试题对象
     * @param seckillId
     * @return
     */
    public SuccessKiiled queryByIdWithSeckill(long seckillId);

}
