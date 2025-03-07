package com.xieyun.shortlink.admin.test;

/**
 * @author XieYun
 * @version 1.0
 */
public class UserTableShardingTest {

    public static final String SQL = "CREATE TABLE `t_link_goto_%d` (\n" +
            "  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',\n" +
            "  `gid` varchar(32) COLLATE utf8mb4_general_ci DEFAULT 'default' COMMENT '分组标识',\n" +
            "  `full_short_url` varchar(128) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '完整短链接',\n" +
            "  PRIMARY KEY (`id`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;";

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }
    }
}
