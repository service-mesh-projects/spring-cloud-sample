package in.hocg.sample.facade.api;

import in.hocg.sample.facade.domain.Example;

import java.util.List;

/**
 * Created by hocgin on 2019/6/9.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
public interface IndexController {
    
    /**
     * Hi
     */
    void hi();
    
    void insert();
    
    Example queryOne();
    
    List<Example> queryAll();
}
