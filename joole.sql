/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : joole

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 19/05/2022 09:16:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
BEGIN;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES (45);
INSERT INTO `hibernate_sequence` (`next_val`) VALUES (45);
INSERT INTO `hibernate_sequence` (`next_val`) VALUES (45);
INSERT INTO `hibernate_sequence` (`next_val`) VALUES (45);
INSERT INTO `hibernate_sequence` (`next_val`) VALUES (45);
INSERT INTO `hibernate_sequence` (`next_val`) VALUES (45);
INSERT INTO `hibernate_sequence` (`next_val`) VALUES (45);
INSERT INTO `hibernate_sequence` (`next_val`) VALUES (45);
INSERT INTO `hibernate_sequence` (`next_val`) VALUES (45);
COMMIT;

-- ----------------------------
-- Table structure for luckymoney
-- ----------------------------
DROP TABLE IF EXISTS `luckymoney`;
CREATE TABLE `luckymoney` (
  `id` int NOT NULL,
  `consumer` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `money` decimal(19,2) DEFAULT NULL,
  `producer` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `story_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `story_id` (`story_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of luckymoney
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for manufacturer
-- ----------------------------
DROP TABLE IF EXISTS `manufacturer`;
CREATE TABLE `manufacturer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `department` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `web_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of manufacturer
-- ----------------------------
BEGIN;
INSERT INTO `manufacturer` (`id`, `user_name`, `password`, `department`, `phone`, `email`, `web_url`, `create_time`, `update_time`) VALUES (1, '666', '666', 'HR', '11111111', 'hr@gmail.com', '111.com', '2022-05-17 09:21:33', '2022-05-17 09:21:35');
INSERT INTO `manufacturer` (`id`, `user_name`, `password`, `department`, `phone`, `email`, `web_url`, `create_time`, `update_time`) VALUES (2, '777', '777', 'RH', '222222', 'rh@gmail.com', '222.com', '2022-05-17 09:22:00', '2022-05-17 09:22:02');
INSERT INTO `manufacturer` (`id`, `user_name`, `password`, `department`, `phone`, `email`, `web_url`, `create_time`, `update_time`) VALUES (13, 'manu1', 'password', 'department1', ' 666', ' manu1@gmail.com', 'manu1.com', '2022-05-18 14:21:46', '2022-05-18 14:21:46');
INSERT INTO `manufacturer` (`id`, `user_name`, `password`, `department`, `phone`, `email`, `web_url`, `create_time`, `update_time`) VALUES (20, 'manu1', 'password', 'department1', ' 666', ' manu1@gmail.com', 'manu1.com', '2022-05-18 15:13:02', '2022-05-18 15:13:02');
INSERT INTO `manufacturer` (`id`, `user_name`, `password`, `department`, `phone`, `email`, `web_url`, `create_time`, `update_time`) VALUES (24, 'manu1', 'password', 'department1', ' 666', ' manu1@gmail.com', 'manu1.com', '2022-05-18 15:14:55', '2022-05-18 15:14:55');
INSERT INTO `manufacturer` (`id`, `user_name`, `password`, `department`, `phone`, `email`, `web_url`, `create_time`, `update_time`) VALUES (28, 'manu1', 'password', 'department1', ' 666', ' manu1@gmail.com', 'manu1.com', '2022-05-18 15:15:44', '2022-05-18 15:15:44');
INSERT INTO `manufacturer` (`id`, `user_name`, `password`, `department`, `phone`, `email`, `web_url`, `create_time`, `update_time`) VALUES (33, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `product_type_id` int DEFAULT NULL,
  `technical_detail_id` int DEFAULT NULL,
  `manufacturer_detail_id` int DEFAULT NULL,
  `model_year` int DEFAULT NULL,
  `sale_id` int DEFAULT NULL,
  `brand` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `product_ibfk_1` (`product_type_id`),
  KEY `product_ibfk_2` (`technical_detail_id`),
  KEY `product_ibfk_3` (`manufacturer_detail_id`),
  KEY `product_ibfk_4` (`sale_id`),
  CONSTRAINT `product_ibfk_2` FOREIGN KEY (`technical_detail_id`) REFERENCES `technical_detail` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `product_ibfk_3` FOREIGN KEY (`manufacturer_detail_id`) REFERENCES `manufacturer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `product_ibfk_4` FOREIGN KEY (`sale_id`) REFERENCES `sale` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `product_ibfk_5` FOREIGN KEY (`product_type_id`) REFERENCES `product_type` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of product
-- ----------------------------
BEGIN;
INSERT INTO `product` (`id`, `name`, `product_type_id`, `technical_detail_id`, `manufacturer_detail_id`, `model_year`, `sale_id`, `brand`, `create_time`, `update_time`) VALUES (1, 'Product1', 1, 1, 1, 2000, 1, 'Apple', '2022-05-17 09:15:14', '2022-05-17 09:15:17');
INSERT INTO `product` (`id`, `name`, `product_type_id`, `technical_detail_id`, `manufacturer_detail_id`, `model_year`, `sale_id`, `brand`, `create_time`, `update_time`) VALUES (2, 'Product2', 1, 2, 2, 2021, 2, 'Samsung', '2022-05-17 09:32:58', '2022-05-17 09:33:01');
INSERT INTO `product` (`id`, `name`, `product_type_id`, `technical_detail_id`, `manufacturer_detail_id`, `model_year`, `sale_id`, `brand`, `create_time`, `update_time`) VALUES (3, 'Product3', 2, 3, 1, 2023, 3, 'Microsoft', '2022-05-17 09:35:23', '2022-05-17 09:35:25');
INSERT INTO `product` (`id`, `name`, `product_type_id`, `technical_detail_id`, `manufacturer_detail_id`, `model_year`, `sale_id`, `brand`, `create_time`, `update_time`) VALUES (5, 'Test1', NULL, NULL, NULL, 2042, NULL, 'NY', '2022-05-17 19:12:06', '2022-05-18 19:58:18');
INSERT INTO `product` (`id`, `name`, `product_type_id`, `technical_detail_id`, `manufacturer_detail_id`, `model_year`, `sale_id`, `brand`, `create_time`, `update_time`) VALUES (7, 'Test1', NULL, NULL, NULL, 2022, NULL, 'Meta', '2022-05-17 19:14:53', '2022-05-17 19:14:53');
INSERT INTO `product` (`id`, `name`, `product_type_id`, `technical_detail_id`, `manufacturer_detail_id`, `model_year`, `sale_id`, `brand`, `create_time`, `update_time`) VALUES (10, 'Test1', NULL, NULL, NULL, 2022, NULL, 'Meta', '2022-05-18 14:19:45', '2022-05-18 14:19:45');
INSERT INTO `product` (`id`, `name`, `product_type_id`, `technical_detail_id`, `manufacturer_detail_id`, `model_year`, `sale_id`, `brand`, `create_time`, `update_time`) VALUES (12, 'Test1', NULL, NULL, NULL, 2022, NULL, 'Meta', '2022-05-18 14:21:46', '2022-05-18 14:21:46');
INSERT INTO `product` (`id`, `name`, `product_type_id`, `technical_detail_id`, `manufacturer_detail_id`, `model_year`, `sale_id`, `brand`, `create_time`, `update_time`) VALUES (19, 'Test1', NULL, NULL, NULL, 2022, NULL, 'Meta', '2022-05-18 15:13:02', '2022-05-18 15:13:02');
INSERT INTO `product` (`id`, `name`, `product_type_id`, `technical_detail_id`, `manufacturer_detail_id`, `model_year`, `sale_id`, `brand`, `create_time`, `update_time`) VALUES (32, 'Test1', 30, 29, 28, 2022, 31, 'Meta', '2022-05-18 15:15:44', '2022-05-18 15:15:44');
INSERT INTO `product` (`id`, `name`, `product_type_id`, `technical_detail_id`, `manufacturer_detail_id`, `model_year`, `sale_id`, `brand`, `create_time`, `update_time`) VALUES (42, 'testPost', 1, 1, 1, 2077, 1, 'ios', '2022-05-18 19:58:02', '2022-05-18 19:58:02');
INSERT INTO `product` (`id`, `name`, `product_type_id`, `technical_detail_id`, `manufacturer_detail_id`, `model_year`, `sale_id`, `brand`, `create_time`, `update_time`) VALUES (43, 'testPost', 1, 1, 1, 2077, 1, 'ios', '2022-05-18 19:58:08', '2022-05-18 19:58:08');
INSERT INTO `product` (`id`, `name`, `product_type_id`, `technical_detail_id`, `manufacturer_detail_id`, `model_year`, `sale_id`, `brand`, `create_time`, `update_time`) VALUES (44, 'testPost', 1, 1, 1, 2077, 1, 'ios', '2022-05-18 20:01:01', '2022-05-18 20:01:01');
COMMIT;

-- ----------------------------
-- Table structure for product_type
-- ----------------------------
DROP TABLE IF EXISTS `product_type`;
CREATE TABLE `product_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_type_detail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of product_type
-- ----------------------------
BEGIN;
INSERT INTO `product_type` (`id`, `product_type_detail`, `create_time`) VALUES (1, 'Fans', '2022-05-17 09:15:47');
INSERT INTO `product_type` (`id`, `product_type_detail`, `create_time`) VALUES (2, 'Air-condition', '2022-05-17 09:16:01');
INSERT INTO `product_type` (`id`, `product_type_detail`, `create_time`) VALUES (3, 'coke', '2022-05-17 09:17:53');
INSERT INTO `product_type` (`id`, `product_type_detail`, `create_time`) VALUES (15, 'TypeTest1', '2022-05-18 14:21:46');
INSERT INTO `product_type` (`id`, `product_type_detail`, `create_time`) VALUES (22, 'TypeTest1', '2022-05-18 15:13:02');
INSERT INTO `product_type` (`id`, `product_type_detail`, `create_time`) VALUES (26, 'TypeTest1', '2022-05-18 15:14:55');
INSERT INTO `product_type` (`id`, `product_type_detail`, `create_time`) VALUES (30, 'TypeTest1', '2022-05-18 15:15:44');
INSERT INTO `product_type` (`id`, `product_type_detail`, `create_time`) VALUES (34, NULL, NULL);
INSERT INTO `product_type` (`id`, `product_type_detail`, `create_time`) VALUES (35, 'testName', '2022-05-18 16:18:46');
INSERT INTO `product_type` (`id`, `product_type_detail`, `create_time`) VALUES (36, 'testName', '2022-05-18 16:47:21');
INSERT INTO `product_type` (`id`, `product_type_detail`, `create_time`) VALUES (37, 'testName', '2022-05-18 16:48:50');
COMMIT;

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of project
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for project_product
-- ----------------------------
DROP TABLE IF EXISTS `project_product`;
CREATE TABLE `project_product` (
  `id` int NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `project_id` int DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  `project_product_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `project_product_ibfk_1` (`project_id`),
  KEY `FK9coy5prmdj0e5r3sn9kl2vxrt` (`product_id`),
  CONSTRAINT `FK9coy5prmdj0e5r3sn9kl2vxrt` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
  CONSTRAINT `project_product_ibfk_1` FOREIGN KEY (`project_id`) REFERENCES `project` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `project_product_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `project` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of project_product
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for sale
-- ----------------------------
DROP TABLE IF EXISTS `sale`;
CREATE TABLE `sale` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `web_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of sale
-- ----------------------------
BEGIN;
INSERT INTO `sale` (`id`, `name`, `email`, `phone`, `web_url`, `create_time`, `update_time`) VALUES (1, 'Yi', 'Yi@gmail.com', '111', 'yi.com', '2022-05-17 09:26:56', '2022-05-17 09:26:57');
INSERT INTO `sale` (`id`, `name`, `email`, `phone`, `web_url`, `create_time`, `update_time`) VALUES (2, 'vitor', 'vitor@gmail.com', '222', 'vitor.com', '2022-05-17 09:27:23', '2022-05-17 09:27:26');
INSERT INTO `sale` (`id`, `name`, `email`, `phone`, `web_url`, `create_time`, `update_time`) VALUES (3, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sale` (`id`, `name`, `email`, `phone`, `web_url`, `create_time`, `update_time`) VALUES (31, 'saletest1', 'saletest1.com', '111', ' testsale@gmail.com', '2022-05-18 15:15:44', '2022-05-18 15:15:44');
INSERT INTO `sale` (`id`, `name`, `email`, `phone`, `web_url`, `create_time`, `update_time`) VALUES (39, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for story
-- ----------------------------
DROP TABLE IF EXISTS `story`;
CREATE TABLE `story` (
  `id` int NOT NULL AUTO_INCREMENT,
  `story_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of story
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for technical_detail
-- ----------------------------
DROP TABLE IF EXISTS `technical_detail`;
CREATE TABLE `technical_detail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `technical_detail_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `technical_detail_number` int DEFAULT NULL,
  `product_type_id` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `technical_detail_ibfk_1` (`product_type_id`),
  CONSTRAINT `technical_detail_ibfk_1` FOREIGN KEY (`product_type_id`) REFERENCES `product_type` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of technical_detail
-- ----------------------------
BEGIN;
INSERT INTO `technical_detail` (`id`, `technical_detail_name`, `technical_detail_number`, `product_type_id`, `create_time`, `update_time`) VALUES (1, 'airflow', 5000, 1, '2022-05-17 09:23:17', '2022-05-17 09:23:19');
INSERT INTO `technical_detail` (`id`, `technical_detail_name`, `technical_detail_number`, `product_type_id`, `create_time`, `update_time`) VALUES (2, 'max power', 6000, 1, '2022-05-17 09:23:53', '2022-05-17 09:23:55');
INSERT INTO `technical_detail` (`id`, `technical_detail_name`, `technical_detail_number`, `product_type_id`, `create_time`, `update_time`) VALUES (3, 'air-condition power', 6666, 2, '2022-05-17 09:24:39', '2022-05-17 09:24:41');
INSERT INTO `technical_detail` (`id`, `technical_detail_name`, `technical_detail_number`, `product_type_id`, `create_time`, `update_time`) VALUES (4, 'air-codition speed', 8888, 2, '2022-05-17 09:25:08', '2022-05-17 09:25:10');
INSERT INTO `technical_detail` (`id`, `technical_detail_name`, `technical_detail_number`, `product_type_id`, `create_time`, `update_time`) VALUES (5, 'airflow', 6000, 1, '2022-05-17 11:36:16', '2022-05-17 11:36:18');
INSERT INTO `technical_detail` (`id`, `technical_detail_name`, `technical_detail_number`, `product_type_id`, `create_time`, `update_time`) VALUES (14, 'TestAirflow', 6000, NULL, '2022-05-18 14:21:46', '2022-05-18 14:21:46');
INSERT INTO `technical_detail` (`id`, `technical_detail_name`, `technical_detail_number`, `product_type_id`, `create_time`, `update_time`) VALUES (21, 'TestAirflow', 6000, NULL, '2022-05-18 15:13:02', '2022-05-18 15:13:02');
INSERT INTO `technical_detail` (`id`, `technical_detail_name`, `technical_detail_number`, `product_type_id`, `create_time`, `update_time`) VALUES (25, 'TestAirflow', 6000, NULL, '2022-05-18 15:14:55', '2022-05-18 15:14:55');
INSERT INTO `technical_detail` (`id`, `technical_detail_name`, `technical_detail_number`, `product_type_id`, `create_time`, `update_time`) VALUES (29, 'TestAirflow', 6000, NULL, '2022-05-18 15:15:44', '2022-05-18 15:15:44');
INSERT INTO `technical_detail` (`id`, `technical_detail_name`, `technical_detail_number`, `product_type_id`, `create_time`, `update_time`) VALUES (38, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `profile_picture_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`id`, `user_name`, `password`, `create_time`, `update_time`, `name`, `profile_picture_url`) VALUES (8, 'name', 'password', NULL, NULL, NULL, NULL);
INSERT INTO `user` (`id`, `user_name`, `password`, `create_time`, `update_time`, `name`, `profile_picture_url`) VALUES (9, 'name', 'password', NULL, NULL, NULL, NULL);
INSERT INTO `user` (`id`, `user_name`, `password`, `create_time`, `update_time`, `name`, `profile_picture_url`) VALUES (17, 'test1', 'test1', NULL, NULL, NULL, NULL);
INSERT INTO `user` (`id`, `user_name`, `password`, `create_time`, `update_time`, `name`, `profile_picture_url`) VALUES (18, 'test2', 'test2', NULL, NULL, NULL, NULL);
INSERT INTO `user` (`id`, `user_name`, `password`, `create_time`, `update_time`, `name`, `profile_picture_url`) VALUES (41, 'String userName', 'String password', '2022-05-18 18:13:24', '2022-05-18', 'String name', 'String profilePictureUrl');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
