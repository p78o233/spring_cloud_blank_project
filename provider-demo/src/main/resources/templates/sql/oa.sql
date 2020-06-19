/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : oa

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-06-19 16:13:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `permissions`
-- ----------------------------
DROP TABLE IF EXISTS `permissions`;
CREATE TABLE `permissions` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限表',
  `permissionsName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permissions
-- ----------------------------
INSERT INTO `permissions` VALUES ('1', 'query');
INSERT INTO `permissions` VALUES ('2', 'add');
INSERT INTO `permissions` VALUES ('3', 'query');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色表',
  `roleName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'admin');
INSERT INTO `role` VALUES ('2', 'user');

-- ----------------------------
-- Table structure for `rolepermission`
-- ----------------------------
DROP TABLE IF EXISTS `rolepermission`;
CREATE TABLE `rolepermission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色权限关联表',
  `roleId` int(11) DEFAULT NULL,
  `permissionId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rolepermission
-- ----------------------------
INSERT INTO `rolepermission` VALUES ('1', '1', '1');
INSERT INTO `rolepermission` VALUES ('2', '2', '3');
INSERT INTO `rolepermission` VALUES ('3', '1', '2');

-- ----------------------------
-- Table structure for `test`
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `cdNum` int(11) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `score` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('1', '123', null, null, null);
INSERT INTO `test` VALUES ('2', '123', '1', '2018-11-30 17:04:50', '5.55');
INSERT INTO `test` VALUES ('3', '123', '1', '2018-11-30 17:04:50', '5.55');
INSERT INTO `test` VALUES ('7', null, null, null, null);
INSERT INTO `test` VALUES ('8', null, null, null, null);
INSERT INTO `test` VALUES ('9', null, null, null, null);
INSERT INTO `test` VALUES ('10', null, null, null, null);
INSERT INTO `test` VALUES ('11', '吴翰文', '1', '2020-05-26 02:46:06', '0.5');
INSERT INTO `test` VALUES ('13', '吴翰文', '1', '2020-05-26 02:46:06', '0.5');
INSERT INTO `test` VALUES ('14', '吴翰文', '1', '2020-05-26 02:46:06', '0.5');
INSERT INTO `test` VALUES ('15', 'p78o2', '123', '2020-05-29 06:59:28', '0.5');
INSERT INTO `test` VALUES ('16', 'p78o2', '123', '2020-05-29 07:00:35', '0.5');
INSERT INTO `test` VALUES ('17', 'p78o3', '987', '2020-05-29 07:00:35', '0.3');
INSERT INTO `test` VALUES ('18', 'p78o2', '123', '2020-05-29 07:03:21', '0.5');
INSERT INTO `test` VALUES ('19', 'p78o3', '987', '2020-05-29 07:03:21', '0.3');
INSERT INTO `test` VALUES ('20', null, null, null, null);

-- ----------------------------
-- Table structure for `testc`
-- ----------------------------
DROP TABLE IF EXISTS `testc`;
CREATE TABLE `testc` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'test表关联表',
  `testId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testc
-- ----------------------------
INSERT INTO `testc` VALUES ('1', '13');
INSERT INTO `testc` VALUES ('2', '13');
INSERT INTO `testc` VALUES ('3', '13');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户表主键',
  `userName` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'wsl', '123456', null, null);
INSERT INTO `user` VALUES ('2', 'zhangsan', '123456', null, null);

-- ----------------------------
-- Table structure for `userrole`
-- ----------------------------
DROP TABLE IF EXISTS `userrole`;
CREATE TABLE `userrole` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色用户表',
  `roleId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userrole
-- ----------------------------
INSERT INTO `userrole` VALUES ('1', '1', '1');
INSERT INTO `userrole` VALUES ('2', '2', '2');

-- ----------------------------
-- View structure for `departview`
-- ----------------------------
DROP VIEW IF EXISTS `departview`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `departview` AS select `department`.`departmentId` AS `departmentId`,`department`.`departmentName` AS `departmentName`,`department`.`createDate` AS `createDate`,`department`.`createUser` AS `createUser`,`department`.`modifyDate` AS `modifyDate`,`department`.`modifyUser` AS `modifyUser`,`department`.`departmentManager` AS `departmentManager`,`department`.`isdel` AS `isdel`,`user`.`userName` AS `userName` from (`department` join `user` on((`department`.`departmentManager` = `user`.`userId`))) ;

-- ----------------------------
-- View structure for `userview`
-- ----------------------------
DROP VIEW IF EXISTS `userview`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `userview` AS select `user`.`userId` AS `userId`,`user`.`userName` AS `userName`,`user`.`userTel` AS `userTel`,`user`.`departmentId` AS `departmentId`,`user`.`stationId` AS `stationId`,`user`.`userEmail` AS `userEmail`,`user`.`userQQ` AS `userQQ`,`user`.`isdel` AS `isdel`,`user`.`userWX` AS `userWX`,`department`.`departmentName` AS `departmentName`,`station`.`stationName` AS `stationName`,`user`.`graduatSchool` AS `graduatSchool`,`user`.`education` AS `education`,`user`.`interViewWay` AS `interViewWay` from ((`user` join `department` on((`user`.`departmentId` = `department`.`departmentId`))) join `station` on((`user`.`stationId` = `station`.`stationId`))) ;
