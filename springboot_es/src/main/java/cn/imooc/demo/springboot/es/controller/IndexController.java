package cn.imooc.demo.springboot.es.controller;

import cn.imooc.demo.springboot.es.entity.es.EsBlog;
import cn.imooc.demo.springboot.es.entity.mysql.MysqlBlog;
import cn.imooc.demo.springboot.es.repository.es.EsBlogRepository;
import cn.imooc.demo.springboot.es.repository.mysql.MysqlBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Iterator;
import java.util.List;

/**
 * @ProjectName: springboot_es
 * @Package: cn.imooc.demo.springboot.es.controller
 * @ClassName: IndexController
 * @Author: CYQ
 * @Description: ${description}
 * @Date: 2019-12-05 10:05
 * @Version: 1.0
 */
@Controller
public class IndexController {

    @Autowired
    MysqlBlogRepository mysqlBlogRepository;

    @Autowired
    EsBlogRepository esBlogRepository;

    @RequestMapping("/")
    public String index(){
        List<MysqlBlog> list = mysqlBlogRepository.findAll();
        System.out.println(list.size());

        if (esBlogRepository == null) {
            System.out.println("null");
        }else{
            Iterable<EsBlog> all = esBlogRepository.findAll();
            Iterator<EsBlog> iterator = all.iterator();
            EsBlog next = iterator.next();
            System.out.println("---------------"+next.getTitle());
        }

        return "index.html";
    }
}
