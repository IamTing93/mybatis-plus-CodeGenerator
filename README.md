# mybatis-plus-CodeGenerator

结合工作上的项目经历，写了一个demo以备需要时候直接使用。

demo中使用到的数据库表结构如下

```mysql
CREATE TABLE `seckill_user` (
   `id` bigint NOT NULL COMMENT '用户ID，手机号码',
   `nickname` varchar(255) NOT NULL COMMENT '昵称',
   `password` varchar(32) DEFAULT NULL COMMENT 'MD5(MD5(pass明文, 固定SALT), 随机SALT)',
   `salt` varchar(10) DEFAULT NULL,
   `head` varchar(256) DEFAULT NULL COMMENT '头像，云存储ID',
   `register_date` datetime DEFAULT NULL COMMENT '注册时间',
   `last_login_date` datetime DEFAULT NULL COMMENT '上一次登录时间',
   `login_count` int DEFAULT '0' COMMENT '登录次数',
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
 
 CREATE TABLE `seckill_order` (
   `seckill_id` int NOT NULL AUTO_INCREMENT COMMENT '秒杀订单id',
   `seckill_user_id` bigint DEFAULT NULL COMMENT '用户id',
   `seckill_order_id` bigint DEFAULT NULL COMMENT '订单id',
   `seckill_goods_id` bigint DEFAULT NULL COMMENT '商品id',
   PRIMARY KEY (`seckill_id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
 
INSERT INTO `seckill_user` VALUES (123456,'user_2147879419','9ee0e8eb4541e34148015de85243bd77','21ecf',NULL,'2020-11-16 21:26:54','2020-11-17 00:58:49',4);
```

