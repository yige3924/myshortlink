package com.xieyun.shortlink.admin.test;

/**
 * @author XieYun
 * @version 1.0
 */
public class UserTableShardingTest {

    public static final String SQL = "CREATE TABLE `t_user_%d` (\n" +
            "  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',\n" +
            "  `username` varchar(256) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户名',\n" +
            "  `password` varchar(512) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '密码',\n" +
            "  `real_name` varchar(256) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '真实姓名',\n" +
            "  `phone` varchar(128) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '手机号',\n" +
            "  `mail` varchar(512) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '邮箱',\n" +
            "  `deletion_time` bigint DEFAULT NULL COMMENT '注销时间戳',\n" +
            "  `create_time` datetime DEFAULT NULL COMMENT '创建时间',\n" +
            "  `update_time` datetime DEFAULT NULL COMMENT '修改时间',\n" +
            "  `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0: 未删除 1: 已删除',\n" +
            "  PRIMARY KEY (`id`),\n" +
            "  UNIQUE KEY `idx_unique_username` (`username`) USING BTREE\n" +
            ") ENGINE=InnoDB AUTO_INCREMENT=1896814470806679555 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;";

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }
    }
}
