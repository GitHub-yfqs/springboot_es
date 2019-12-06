package cn.imooc.demo.springboot.es.repository.es;

import cn.imooc.demo.springboot.es.entity.es.EsBlog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @ProjectName: springboot_es
 * @Package: cn.imooc.demo.springboot.es.repository.es
 * @ClassName: EsBlogRepository
 * @Author: CYQ
 * @Description: ${description}
 * @Date: 2019-12-05 10:26
 * @Version: 1.0
 */
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog,Integer> {
}
