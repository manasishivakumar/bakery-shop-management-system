CREATE DATABASE  IF NOT EXISTS `bakeryshopmanagementsystem` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bakeryshopmanagementsystem`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: bakeryshopmanagementsystem
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bill_no` bigint(20) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `item_name` varchar(255) DEFAULT NULL,
  `item_price` int(11) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `total_price` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (1,62001,'2024-05-09','Red Velvet Cake',900,1,900),(2,62001,'2024-05-09','Munch',10,4,40),(3,62002,'2024-05-09','Dairy Milk Silk',50,2,100),(4,62002,'2024-05-09','Munch',10,2,20),(5,62003,'2024-05-10','Chocolate Ice Cream',175,1,175),(6,62004,'2024-05-10','Munch',10,5,50),(7,62004,'2024-05-10','Red Velvet Cake',900,1,900),(8,62005,'2024-05-10','Dairy Milk Silk',50,1,50),(9,62006,'2024-05-13','Munch',10,2,20),(10,62006,'2024-05-13','Sprite juice',40,1,40),(11,62007,'2024-05-13','Bread',30,1,30),(12,62007,'2024-05-13','Jam',45,1,45),(13,62008,'2024-05-14','KitKat',20,2,40),(14,62008,'2024-05-14','Slice Juice',45,1,45),(15,62009,'2024-05-14','Red Velvet Cake',900,1,900),(16,62009,'2024-05-14','KitKat',20,3,60);
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill_no`
--

DROP TABLE IF EXISTS `bill_no`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill_no` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bill_no` bigint(20) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `total_amount` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_no`
--

LOCK TABLES `bill_no` WRITE;
/*!40000 ALTER TABLE `bill_no` DISABLE KEYS */;
INSERT INTO `bill_no` VALUES (1,62001,'2024-05-09',940),(2,62002,'2024-05-09',120),(3,62003,'2024-05-10',175),(4,62004,'2024-05-10',950),(5,62005,'2024-05-10',50),(6,62006,'2024-05-13',60),(7,62007,'2024-05-13',75),(8,62008,'2024-05-14',85),(9,62009,'2024-05-14',960);
/*!40000 ALTER TABLE `bill_no` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `item_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `item_name` varchar(45) NOT NULL,
  `item_quantity` int(10) unsigned NOT NULL,
  `item_price` int(10) unsigned NOT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,'Red Velvet Cake',10,900),(2,'Dairy Milk Silk',20,50),(3,'Munch',40,10),(4,'Chocolate Ice Cream',10,175),(5,'Sprite juice',15,40),(6,'Bread',8,30),(7,'Jam',10,45),(8,'KitKat',35,20),(9,'Slice Juice',8,45);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'arun@123','Arun','Admin'),(2,'arjun@123','Arjun','Cashier'),(3,'vyshakh@123','Vyshakh','Cashier');
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

-- Dump completed on 2024-05-14 19:53:30
