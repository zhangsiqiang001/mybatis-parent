MyBatis Parent
==============

[![Java CI](https://github.com/mybatis/parent/actions/workflows/ci.yaml/badge.svg)](https://github.com/mybatis/parent/actions/workflows/ci.yaml)
[![Maven central](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis-parent/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis-parent)
[![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/https/oss.sonatype.org/org.mybatis/mybatis-parent.svg)](https://oss.sonatype.org/content/repositories/snapshots/org/mybatis/mybatis-parent/)
[![License](https://img.shields.io/:license-apache-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

![mybatis](http://www.mybatis.org/images/mybatis-logo.png)

MyBatis-Parent is the MyBatis parent POM which has to be inherited by all MyBatis modules.


这个是mybatis中文注释版
1.配置数据库连接：sqlMapConfig.xml
2.在mysql中初始化数据

出处在：https://github.com/tuguangquan/mybatis.git

大家自取 

点点星星不迷路


初始sql：
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `birthday` datetime NULL DEFAULT NULL,
  `sex` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;




