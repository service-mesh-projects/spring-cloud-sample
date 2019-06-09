-- auto-generated definition
DROP TABLE IF EXISTS `t_example`;
CREATE TABLE `t_example`
(
  id   INT(11) AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL
  COMMENT 'name'
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COMMENT = 'Example 表';

