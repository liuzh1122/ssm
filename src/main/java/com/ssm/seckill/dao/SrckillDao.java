package com.ssm.seckill.dao;

import com.ssm.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/26.
 */
public interface SrckillDao {
    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 影响行数>1
     */
    public int reduceNumber( long seckillId , Date killTime );

    /**
     * 根据id查询秒杀对象
     * @param seckillId
     * @return
     */
    public Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offet
     * @param limit
     * @return
     */
    public List<Seckill> queryAll(int offet, int limit);
}
