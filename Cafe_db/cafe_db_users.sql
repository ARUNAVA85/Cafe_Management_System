-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: cafe_db
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `img` longblob,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_role` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `users_chk_1` CHECK ((`user_role` between 0 and 1))
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin@test.com',NULL,'admin','$2a$10$l./Onq1k1ClZsZyHmjbmaOLRzNtoVhHhWssAQgWrmYnKlQzvASAGW',0),(2,'arunava@gmail.com',NULL,'Arunava','$2a$10$KSyPvk4CBQfprc7Q/J3g5OdgTrNvDxYhx5G367LRWa6.tjtTAcRqG',1),(3,'arunima@gmail.com',NULL,'Arunima','$2a$10$B1PT0lnAcAxOYZMAnDwFyuIigt8aJHwwlJi/KlIb.qUPiMQitkPxy',1),(4,'saswati@gmail.com',NULL,'Saswati Nandi','$2a$10$wdO7UZpRHWsxLzKBwcij4e19qKVq/sIjNtUVnuuBxn/FmFB8FyVcy',1),(5,'user1@test.com',NULL,'User1','$2a$10$9Ble7arD/762Fm.lu.8Xou0.ZuQbgWkU0gxEv7AnWzw.qCCt21O8W',1),(6,'user2@test.com',NULL,'User2','$2a$10$sPRLjwbAwb8W0iM6L8rXc.VfNkAJo8o3iwviC.JmUidK3Cjs1Gtsy',1),(7,'user3@test.com',NULL,'User3','$2a$10$4IBrqfDxcpxvwfVwbMo1Y.HYiWIcI4ywGlQbtzrUvtnVAZQJIb.yu',1),(8,'user4@test.com',NULL,'User4','$2a$10$cGhbR4jsbMyvbrknTvtY7uM2lptfLn9FQ7wcB27NzDphDJ0er3uY.',1),(9,'user5@test.com',NULL,'User5','$2a$10$2zcn9EpLCpaZIbBpmmrmPOKVKaBPSM4sRIoJNUZc8nY1bH4uwRTEC',1),(10,'user6@test.com',NULL,'User6','$2a$10$7qcClN//F7z6K/HE1Kp5K.VfxYzZcxB3iL1M1rjXP1b.ZeE8srs2m',1),(11,'user7@test.com',NULL,'User7','$2a$10$atS.naHER2eHIFlhH4sRJeVaYMkzxYqXKhVCPI2QDgzM5kYDIy1Lq',1),(12,'user8@test.com',NULL,'User8','$2a$10$NJRK9QBi3TfyqrLmlIis8Or2BcEuiPBSnmaVj50192wyDK9gC7Rii',1),(13,'user9@test.com',NULL,'User9','$2a$10$yO1syUNvfuonWukSIdyrQe6IopBJZWEO2AK7c8QQxrsHWfVebKzci',1),(14,'user10@test.com',NULL,'User10','$2a$10$RiHk3.JdqdtZ2TAf2zpytOsmA5jrDgnqamgl4o.ygx5yKroEpYtDG',1),(15,'user11@test.com',NULL,'User11','$2a$10$gtSzoEV6ADpKfS6iMlcngOQOKCmYKYbllqXLpSZBMhkNWzu/79w6e',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-21 10:58:12
