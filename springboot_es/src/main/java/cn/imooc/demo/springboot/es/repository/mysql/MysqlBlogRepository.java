package cn.imooc.demo.springboot.es.repository.mysql;

import cn.imooc.demo.springboot.es.entity.mysql.MysqlBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @ProjectName: springboot_es
 * @Package: cn.imooc.demo.springboot.es.repository.mysql
 * @ClassName: MysqlBlogRepository
 * @Author: CYQ
 * @Description: ${description}
 * @Date: 2019-12-05 10:04
 * @Version: 1.0
 */
public interface MysqlBlogRepository extends JpaRepository<MysqlBlog,Integer> {
    @Query("select e from MysqlBlog e order by e.createTime desc")
    List<MysqlBlog> queryAll();

    @Query("select e from MysqlBlog e where e.title " +
            "like concat('%',:keyword,'%') or e.content like concat('%',:keyword,'%')")
    List<MysqlBlog> queryBlogs(@Param("keyword") String keyword);
}
