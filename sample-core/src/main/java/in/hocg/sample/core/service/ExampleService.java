package in.hocg.sample.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import in.hocg.sample.facade.domain.Example;

import java.util.List;

/**
 * Created by hocgin on 2019/6/9.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
public interface ExampleService extends IService<Example> {
    void insert();
    
    Example queryOne();
    
    List<Example> queryAll();
}
