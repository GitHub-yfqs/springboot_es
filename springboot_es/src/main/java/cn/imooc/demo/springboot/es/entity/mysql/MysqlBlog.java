package cn.imooc.demo.springboot.es.entity.mysql;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @ProjectName: springboot_es
 * @Package: cn.imooc.demo.springboot.es.entity.mysql
 * @ClassName: MysqlBlog
 * @Author: CYQ
 * @Description: ${description}
 * @Date: 2019-12-05 9:52
 * @Version: 1.0
 *
 * CREATE TABLE `t_blog` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
    `title` varchar(60) DEFAULT NULL COMMENT '博客标题',
    `author` varchar(60) DEFAULT NULL COMMENT '博客作者',
    `content` mediumtext COMMENT '博客内容',
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */

@Data
@Table(name = "t_blog")
@Entity
public class MysqlBlog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    private String content;
    @Column(columnDefinition = "mediumtext")
    private Date createTime;
    private Date updateTime;


    public static void main(String[] args){
        MysqlBlog blog = new MysqlBlog();
    }
}
