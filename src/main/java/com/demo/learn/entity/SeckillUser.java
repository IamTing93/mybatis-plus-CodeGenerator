package com.demo.learn.entity;

import java.time.LocalDateTime;
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
public class SeckillUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID，手机号码
     */
    private Long id;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * MD5(MD5(pass明文, 固定SALT), 随机SALT)
     */
    private String password;

    private String salt;

    /**
     * 头像，云存储ID
     */
    private String head;

    /**
     * 注册时间
     */
    private LocalDateTime registerDate;

    /**
     * 上一次登录时间
     */
    private LocalDateTime lastLoginDate;

    /**
     * 登录次数
     */
    private Integer loginCount;


}
