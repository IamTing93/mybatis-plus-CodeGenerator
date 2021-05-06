package com.demo.learn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Ting
 * @since 2021-05-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SeckillOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 秒杀订单id
     */
    @TableId(value = "seckill_id", type = IdType.AUTO)
    private Integer seckillId;

    /**
     * 用户id
     */
    private Long seckillUserId;

    /**
     * 订单id
     */
    private Long seckillOrderId;

    /**
     * 商品id
     */
    private Long seckillGoodsId;


}
