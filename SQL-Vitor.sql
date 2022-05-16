-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: jooleprojectdatabase
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `bookId` int NOT NULL AUTO_INCREMENT,
  `book_name` varchar(45) NOT NULL,
  `book_id` int NOT NULL,
  `theme_id` int DEFAULT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (17,'Book BiDirectional',97,98),(18,'Book BiDirectional',123,124);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expense`
--

DROP TABLE IF EXISTS `expense`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `expense` (
  `id` int NOT NULL AUTO_INCREMENT,
  `item` varchar(45) NOT NULL,
  `amount` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expense`
--

LOCK TABLES `expense` WRITE;
/*!40000 ALTER TABLE `expense` DISABLE KEYS */;
INSERT INTO `expense` VALUES (97,'coffee',10),(98,'New SSD drive',200),(99,'Tuition for baby',350),(100,'Some bananas',7);
/*!40000 ALTER TABLE `expense` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (468);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `luckymoney`
--

DROP TABLE IF EXISTS `luckymoney`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `luckymoney` (
  `id` int NOT NULL AUTO_INCREMENT,
  `money` double NOT NULL,
  `producer` varchar(45) NOT NULL,
  `consumer` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `luckymoney`
--

LOCK TABLES `luckymoney` WRITE;
/*!40000 ALTER TABLE `luckymoney` DISABLE KEYS */;
INSERT INTO `luckymoney` VALUES (67,10,'producer!!!','AAA'),(68,10,'producer!!!','AAA'),(69,10,'producer!!!','AAA'),(102,10,'producer!!!','AAA'),(105,10,'producer!!!','AAA'),(108,10,'producer!!!','AAA'),(111,10,'producer!!!','AAA'),(114,10,'producer!!!','AAA'),(116,10,'producer!!!','AAA'),(118,10,'producer!!!','AAA'),(120,10,'producer!!!','AAA');
/*!40000 ALTER TABLE `luckymoney` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manufacturer`
--

DROP TABLE IF EXISTS `manufacturer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `manufacturer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `department` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `web_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `create_time` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `update_time` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=467 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manufacturer`
--

LOCK TABLES `manufacturer` WRITE;
/*!40000 ALTER TABLE `manufacturer` DISABLE KEYS */;
INSERT INTO `manufacturer` VALUES (218,'username','password','department','phone','email','Website','2022-05-16 09:22:44.701','2022-05-16 09:22:44.701'),(222,'username','password','department','phone','email','Website','2022-05-16 09:45:17.755','2022-05-16 09:45:17.755'),(225,'username','password','department','phone','email','Website','2022-05-16 09:45:59.041','2022-05-16 09:45:59.041'),(229,'username','password','department','phone','email','Website','2022-05-16 09:54:32.526','2022-05-16 09:54:32.526'),(233,'username','password','department','phone','email','Website','2022-05-16 09:55:00.273','2022-05-16 09:55:00.273'),(237,'username','password','department','phone','email','Website','2022-05-16 09:55:39.47','2022-05-16 09:55:39.47'),(241,'username','password','department','phone','email','Website','2022-05-16 10:19:01.787','2022-05-16 10:19:01.787'),(246,'username','password','department','phone','email','Website','2022-05-16 10:21:28.786','2022-05-16 10:21:28.786'),(251,'username','password','department','phone','email','Website','2022-05-16 10:32:21.433','2022-05-16 10:32:21.433'),(256,'username','password','department','phone','email','Website','2022-05-16 10:34:27.405','2022-05-16 10:34:27.405'),(261,'username','password','department','phone','email','Website','2022-05-16 10:36:33.024','2022-05-16 10:36:33.024'),(266,'username','password','department','phone','email','Website','2022-05-16 10:39:52.609','2022-05-16 10:39:52.609'),(271,'username','password','department','phone','email','Website','2022-05-16 10:41:15.392','2022-05-16 10:41:15.392'),(276,'username','password','department','phone','email','Website','2022-05-16 10:43:22.648','2022-05-16 10:43:22.648'),(281,'username','password','department','phone','email','Website','2022-05-16 10:51:40.447','2022-05-16 10:51:40.447'),(286,'username','password','department','phone','email','Website','2022-05-16 10:53:59.956','2022-05-16 10:53:59.956'),(291,'username','password','department','phone','email','Website','2022-05-16 10:55:18.86','2022-05-16 10:55:18.86'),(296,'username','password','department','phone','email','Website','2022-05-16 10:55:54.836','2022-05-16 10:55:54.836'),(301,'username','password','department','phone','email','Website','2022-05-16 10:56:59.044','2022-05-16 10:56:59.044'),(306,'username','password','department','phone','email','Website','2022-05-16 10:57:20.768','2022-05-16 10:57:20.768'),(311,'username','password','department','phone','email','Website','2022-05-16 11:04:30.484','2022-05-16 11:04:30.484'),(316,'username','password','department','phone','email','Website','2022-05-16 11:07:08.545','2022-05-16 11:07:08.545'),(320,'username','password','department','phone','email','Website','2022-05-16 11:08:28.843','2022-05-16 11:08:28.843'),(325,'username','password','department','phone','email','Website','2022-05-16 11:26:11.685','2022-05-16 11:26:11.685'),(338,'username','password','department','phone','email','Website','2022-05-16 12:09:44.054','2022-05-16 12:09:44.054'),(345,'username','password','department','phone','email','Website','2022-05-16 12:21:58.395','2022-05-16 12:21:58.395'),(352,'username','password','department','phone','email','Website','2022-05-16 12:22:51.977','2022-05-16 12:22:51.977'),(359,'username','password','department','phone','email','Website','2022-05-16 12:23:46.469','2022-05-16 12:23:46.469'),(366,'username','password','department','phone','email','Website','2022-05-16 12:25:03.665','2022-05-16 12:25:03.665'),(374,'username','password','department','phone','email','Website','2022-05-16 12:34:38.414','2022-05-16 12:34:38.414'),(381,'username','password','department','phone','email','Website','2022-05-16 12:37:36.527','2022-05-16 12:37:36.527'),(395,'username','password','department','phone','email','Website','2022-05-16 12:51:16.704','2022-05-16 12:51:16.704'),(403,'username','password','department','phone','email','Website','2022-05-16 12:55:57.897','2022-05-16 12:55:57.897'),(412,'username','password','department','phone','email','Website','2022-05-16 12:57:18.535','2022-05-16 12:57:18.535'),(421,'username','password','department','phone','email','Website','2022-05-16 12:58:16.411','2022-05-16 12:58:16.411'),(430,'username','password','department','phone','email','Website','2022-05-16 12:58:50.467','2022-05-16 12:58:50.467'),(439,'username','password','department','phone','email','Website','2022-05-16 13:01:28.373','2022-05-16 13:01:28.373'),(448,'username','password','department','phone','email','Website','2022-05-16 13:02:23.24','2022-05-16 13:02:23.24'),(457,'username','password','department','phone','email','Website','2022-05-16 13:05:45.851','2022-05-16 13:05:45.851'),(466,'username','password','department','phone','email','Website','2022-05-16 13:06:43.89','2022-05-16 13:06:43.89');
/*!40000 ALTER TABLE `manufacturer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `model_year` varchar(45) NOT NULL,
  `brand` varchar(45) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  `manufacturer_id_fk` int DEFAULT NULL,
  `product_type_id_fk` int DEFAULT NULL,
  `technical_details_id_fk` int DEFAULT NULL,
  `sales_id_fk` int DEFAULT NULL,
  `product_list_id_fk` int DEFAULT NULL,
  `project_product_fk` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK7lue021yqvnlxdoqtxvupm970` (`manufacturer_id_fk`),
  KEY `FKbd2otxxe640g0mojpwtkfimxg` (`product_type_id_fk`),
  KEY `FK1uxaqq96j0goaal3jcgoe8dvs` (`product_list_id_fk`),
  CONSTRAINT `FK1uxaqq96j0goaal3jcgoe8dvs` FOREIGN KEY (`product_list_id_fk`) REFERENCES `manufacturer` (`id`),
  CONSTRAINT `FK7lue021yqvnlxdoqtxvupm970` FOREIGN KEY (`manufacturer_id_fk`) REFERENCES `manufacturer` (`id`),
  CONSTRAINT `FKbd2otxxe640g0mojpwtkfimxg` FOREIGN KEY (`product_type_id_fk`) REFERENCES `product_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=462 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (442,'Product 1 AAA','2020','Toyota','2022-05-16 13:02:23','2022-05-16 13:02:23',448,446,447,441,448,449),(443,'Product 2 BBB','2020','Toyota','2022-05-16 13:02:23','2022-05-16 13:02:23',448,NULL,NULL,NULL,448,NULL),(451,'Product 1 AAA','2020','Toyota','2022-05-16 13:05:46','2022-05-16 13:05:46',457,455,456,450,457,458),(452,'Product 2 BBB','2020','Toyota','2022-05-16 13:05:46','2022-05-16 13:05:46',457,NULL,NULL,NULL,457,NULL),(460,'Product 1 AAA','2020','Toyota','2022-05-16 13:06:44','2022-05-16 13:06:44',466,464,465,459,466,467),(461,'Product 2 BBB','2020','Toyota','2022-05-16 13:06:44','2022-05-16 13:06:44',466,NULL,NULL,NULL,466,NULL);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_type`
--

DROP TABLE IF EXISTS `product_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_type` (
  `id` int NOT NULL,
  `product_type_detail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_type`
--

LOCK TABLES `product_type` WRITE;
/*!40000 ALTER TABLE `product_type` DISABLE KEYS */;
INSERT INTO `product_type` VALUES (287,'ProductTypeDetails','2022-05-16 10:54:00'),(292,'ProductTypeDetails','2022-05-16 10:55:19'),(297,'ProductTypeDetails','2022-05-16 10:55:55'),(302,'ProductTypeDetails','2022-05-16 10:56:59'),(307,'ProductTypeDetails','2022-05-16 10:57:21'),(312,'ProductTypeDetails','2022-05-16 11:04:30'),(317,'ProductTypeDetails','2022-05-16 11:07:09'),(321,'ProductTypeDetails','2022-05-16 11:08:29'),(326,'ProductTypeDetails','2022-05-16 11:26:12'),(330,'ProductTypeDetails','2022-05-16 12:08:04'),(336,'ProductTypeDetails','2022-05-16 12:09:44'),(343,'ProductTypeDetails','2022-05-16 12:21:58'),(350,'ProductTypeDetails','2022-05-16 12:22:52'),(357,'ProductTypeDetails','2022-05-16 12:23:46'),(364,'ProductTypeDetails','2022-05-16 12:25:04'),(372,'ProductTypeDetails','2022-05-16 12:34:38'),(379,'ProductTypeDetails','2022-05-16 12:37:37'),(393,'ProductTypeDetails','2022-05-16 12:51:17'),(401,'ProductTypeDetails','2022-05-16 12:55:58'),(410,'ProductTypeDetails','2022-05-16 12:57:19'),(419,'ProductTypeDetails','2022-05-16 12:58:16'),(428,'ProductTypeDetails','2022-05-16 12:58:50'),(437,'ProductTypeDetails','2022-05-16 13:01:28'),(446,'ProductTypeDetails','2022-05-16 13:02:23'),(455,'ProductTypeDetails','2022-05-16 13:05:46'),(464,'ProductTypeDetails','2022-05-16 13:06:44');
/*!40000 ALTER TABLE `product_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project` (
  `id` int NOT NULL,
  `user_id` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `user_id_fk` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKka3s7oy6i6x8vydd58k41p448` (`user_id_fk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (371,14,'2022-05-16 12:34:38','2022-05-16 12:34:38',NULL),(378,14,'2022-05-16 12:37:37','2022-05-16 12:37:37',NULL),(386,14,'2022-05-16 12:48:36','2022-05-16 12:48:36',NULL),(391,14,'2022-05-16 12:51:17','2022-05-16 12:51:17',NULL),(409,14,'2022-05-16 12:57:19','2022-05-16 12:57:19',408),(418,14,'2022-05-16 12:58:16','2022-05-16 12:58:16',NULL),(427,14,'2022-05-16 12:58:50','2022-05-16 12:58:50',426),(436,14,'2022-05-16 13:01:28','2022-05-16 13:01:28',435),(445,14,'2022-05-16 13:02:23','2022-05-16 13:02:23',444),(454,14,'2022-05-16 13:05:46','2022-05-16 13:05:46',453),(463,14,'2022-05-16 13:06:44','2022-05-16 13:06:44',462);
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project_product`
--

DROP TABLE IF EXISTS `project_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project_product` (
  `id` int NOT NULL,
  `product_id` int DEFAULT NULL,
  `project_id` int DEFAULT NULL,
  `product_fk` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKrpdspjn23nlej2jit02gdlwlj` (`product_fk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project_product`
--

LOCK TABLES `project_product` WRITE;
/*!40000 ALTER TABLE `project_product` DISABLE KEYS */;
INSERT INTO `project_product` VALUES (467,20,10,463);
/*!40000 ALTER TABLE `project_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sale`
--

DROP TABLE IF EXISTS `sale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sale` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `web_url` varchar(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=460 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sale`
--

LOCK TABLES `sale` WRITE;
/*!40000 ALTER TABLE `sale` DISABLE KEYS */;
INSERT INTO `sale` VALUES (214,'sale Name','email1','phone111','website','2022-05-16 09:16:10','2022-05-16 09:16:10',20),(217,'sale Name','email1','phone111','website','2022-05-16 09:22:45','2022-05-16 09:22:45',20),(221,'sale Name','email1','phone111','website','2022-05-16 09:45:18','2022-05-16 09:45:18',20),(224,'sale Name','email1','phone111','website','2022-05-16 09:45:59','2022-05-16 09:45:59',20),(228,'sale Name','email1','phone111','website','2022-05-16 09:54:33','2022-05-16 09:54:33',20),(232,'sale Name','email1','phone111','website','2022-05-16 09:55:00','2022-05-16 09:55:00',20),(236,'sale Name','email1','phone111','website','2022-05-16 09:55:39','2022-05-16 09:55:39',20),(240,'sale Name','email1','phone111','website','2022-05-16 10:19:02','2022-05-16 10:19:02',20),(245,'sale Name','email1','phone111','website','2022-05-16 10:21:29','2022-05-16 10:21:29',20),(250,'sale Name','email1','phone111','website','2022-05-16 10:32:21','2022-05-16 10:32:21',20),(255,'sale Name','email1','phone111','website','2022-05-16 10:34:27','2022-05-16 10:34:27',20),(260,'sale Name','email1','phone111','website','2022-05-16 10:36:33','2022-05-16 10:36:33',20),(265,'sale Name','email1','phone111','website','2022-05-16 10:39:53','2022-05-16 10:39:53',20),(270,'sale Name','email1','phone111','website','2022-05-16 10:41:15','2022-05-16 10:41:15',20),(275,'sale Name','email1','phone111','website','2022-05-16 10:43:23','2022-05-16 10:43:23',20),(280,'sale Name','email1','phone111','website','2022-05-16 10:51:40','2022-05-16 10:51:40',20),(285,'sale Name','email1','phone111','website','2022-05-16 10:54:00','2022-05-16 10:54:00',20),(290,'sale Name','email1','phone111','website','2022-05-16 10:55:19','2022-05-16 10:55:19',20),(295,'sale Name','email1','phone111','website','2022-05-16 10:55:55','2022-05-16 10:55:55',20),(300,'sale Name','email1','phone111','website','2022-05-16 10:56:59','2022-05-16 10:56:59',20),(305,'sale Name','email1','phone111','website','2022-05-16 10:57:21','2022-05-16 10:57:21',20),(310,'sale Name','email1','phone111','website','2022-05-16 11:04:30','2022-05-16 11:04:30',20),(315,'sale Name','email1','phone111','website','2022-05-16 11:07:09','2022-05-16 11:07:09',20),(319,'sale Name','email1','phone111','website','2022-05-16 11:08:29','2022-05-16 11:08:29',20),(324,'sale Name','email1','phone111','website','2022-05-16 11:26:12','2022-05-16 11:26:12',20),(329,'sale Name','email1','phone111','website','2022-05-16 12:08:04','2022-05-16 12:08:04',20),(333,'sale Name','email1','phone111','website','2022-05-16 12:09:44','2022-05-16 12:09:44',20),(339,'sale Name','email1','phone111','website','2022-05-16 12:21:58','2022-05-16 12:21:58',20),(346,'sale Name','email1','phone111','website','2022-05-16 12:22:52','2022-05-16 12:22:52',20),(353,'sale Name','email1','phone111','website','2022-05-16 12:23:46','2022-05-16 12:23:46',20),(360,'sale Name','email1','phone111','website','2022-05-16 12:25:04','2022-05-16 12:25:04',20),(367,'sale Name','email1','phone111','website','2022-05-16 12:34:38','2022-05-16 12:34:38',20),(375,'sale Name','email1','phone111','website','2022-05-16 12:37:37','2022-05-16 12:37:37',20),(383,'sale Name','email1','phone111','website','2022-05-16 12:48:36','2022-05-16 12:48:36',20),(388,'sale Name','email1','phone111','website','2022-05-16 12:51:17','2022-05-16 12:51:17',20),(397,'sale Name','email1','phone111','website','2022-05-16 12:55:58','2022-05-16 12:55:58',20),(405,'sale Name','email1','phone111','website','2022-05-16 12:57:19','2022-05-16 12:57:19',20),(414,'sale Name','email1','phone111','website','2022-05-16 12:58:16','2022-05-16 12:58:16',20),(423,'sale Name','email1','phone111','website','2022-05-16 12:58:50','2022-05-16 12:58:50',20),(432,'sale Name','email1','phone111','website','2022-05-16 13:01:28','2022-05-16 13:01:28',20),(441,'sale Name','email1','phone111','website','2022-05-16 13:02:23','2022-05-16 13:02:23',20),(450,'sale Name','email1','phone111','website','2022-05-16 13:05:46','2022-05-16 13:05:46',20),(459,'sale Name','email1','phone111','website','2022-05-16 13:06:44','2022-05-16 13:06:44',20);
/*!40000 ALTER TABLE `sale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `story`
--

DROP TABLE IF EXISTS `story`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `story` (
  `storyId` int NOT NULL AUTO_INCREMENT,
  `story_name` varchar(45) NOT NULL,
  `story_id` int NOT NULL,
  `story_list_id` int DEFAULT NULL,
  PRIMARY KEY (`storyId`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `story`
--

LOCK TABLES `story` WRITE;
/*!40000 ALTER TABLE `story` DISABLE KEYS */;
INSERT INTO `story` VALUES (46,'Story POTATO',99,97),(47,'Story BANANA',100,97),(48,'Story APPLE',101,97),(49,'Story POTATO',125,123),(50,'Story BANANA',126,123),(51,'Story APPLE',127,123);
/*!40000 ALTER TABLE `story` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `technical_detail`
--

DROP TABLE IF EXISTS `technical_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `technical_detail` (
  `id` int NOT NULL,
  `product_type_id` int DEFAULT NULL,
  `technical_detail_name` varchar(20) DEFAULT NULL,
  `technical_detail_number` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `product_type_fk` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKhlo58yy0deew58jehhgw4yisj` (`product_type_fk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `technical_detail`
--

LOCK TABLES `technical_detail` WRITE;
/*!40000 ALTER TABLE `technical_detail` DISABLE KEYS */;
INSERT INTO `technical_detail` VALUES (309,5,'technical name test',3,'2022-05-16 10:57:21','2022-05-16 10:57:21',307),(314,5,'technical name test',3,'2022-05-16 11:04:30','2022-05-16 11:04:30',312),(322,5,'technical name test',3,'2022-05-16 11:08:29','2022-05-16 11:08:29',321),(327,5,'technical name test',3,'2022-05-16 11:26:12','2022-05-16 11:26:12',326),(331,NULL,'technical name test',3,'2022-05-16 12:08:04','2022-05-16 12:08:04',330),(337,NULL,'technical name test',3,'2022-05-16 12:09:44','2022-05-16 12:09:44',336),(344,NULL,'technical name test',3,'2022-05-16 12:21:58','2022-05-16 12:21:58',343),(351,NULL,'technical name test',3,'2022-05-16 12:22:52','2022-05-16 12:22:52',350),(358,NULL,'technical name test',3,'2022-05-16 12:23:46','2022-05-16 12:23:46',357),(365,NULL,'technical name test',3,'2022-05-16 12:25:04','2022-05-16 12:25:04',364),(373,NULL,'technical name test',3,'2022-05-16 12:34:38','2022-05-16 12:34:38',372),(380,NULL,'technical name test',3,'2022-05-16 12:37:37','2022-05-16 12:37:37',379),(394,NULL,'technical name test',3,'2022-05-16 12:51:17','2022-05-16 12:51:17',393),(402,NULL,'technical name test',3,'2022-05-16 12:55:58','2022-05-16 12:55:58',401),(411,NULL,'technical name test',3,'2022-05-16 12:57:19','2022-05-16 12:57:19',410),(420,NULL,'technical name test',3,'2022-05-16 12:58:16','2022-05-16 12:58:16',419),(429,NULL,'technical name test',3,'2022-05-16 12:58:50','2022-05-16 12:58:50',428),(438,NULL,'technical name test',3,'2022-05-16 13:01:28','2022-05-16 13:01:28',437),(447,NULL,'technical name test',3,'2022-05-16 13:02:23','2022-05-16 13:02:23',446),(456,NULL,'technical name test',3,'2022-05-16 13:05:46','2022-05-16 13:05:46',455),(465,NULL,'technical name test',3,'2022-05-16 13:06:44','2022-05-16 13:06:44',464);
/*!40000 ALTER TABLE `technical_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `theme`
--

DROP TABLE IF EXISTS `theme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `theme` (
  `themeId` int NOT NULL AUTO_INCREMENT,
  `theme` varchar(45) NOT NULL,
  `theme_id` int NOT NULL,
  PRIMARY KEY (`themeId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `theme`
--

LOCK TABLES `theme` WRITE;
/*!40000 ALTER TABLE `theme` DISABLE KEYS */;
INSERT INTO `theme` VALUES (4,'arts',98),(5,'arts',124);
/*!40000 ALTER TABLE `theme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `profile_picture_url` varchar(45) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `product_type_id_fk` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (392,'username',' password','name','Picture for Profile URL','2022-05-16 12:51:17','2022-05-16 12:51:17',NULL),(400,'username',' password','name','Picture for Profile URL','2022-05-16 12:55:58','2022-05-16 12:55:58',NULL),(408,'username',' password','name','Picture for Profile URL','2022-05-16 12:57:19','2022-05-16 12:57:19',NULL),(417,'username',' password','name','Picture for Profile URL','2022-05-16 12:58:16','2022-05-16 12:58:16',NULL),(426,'username',' password','name','Picture for Profile URL','2022-05-16 12:58:50','2022-05-16 12:58:50',NULL),(435,'username',' password','name','Picture for Profile URL','2022-05-16 13:01:28','2022-05-16 13:01:28',NULL),(444,'username',' password','name','Picture for Profile URL','2022-05-16 13:02:23','2022-05-16 13:02:23',NULL),(453,'username',' password','name','Picture for Profile URL','2022-05-16 13:05:46','2022-05-16 13:05:46',NULL),(462,'username',' password','name','Picture for Profile URL','2022-05-16 13:06:44','2022-05-16 13:06:44',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-16 13:09:41
