package in.hocg.sample.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import in.hocg.sample.facade.domain.Example;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hocgin on 2019/6/9.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@Mapper
public interface ExampleMapper extends BaseMapper<Example> {
    
    List<Example> queryAll();
}
