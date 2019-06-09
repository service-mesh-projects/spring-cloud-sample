package in.hocg.sample.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import in.hocg.sample.core.mapper.ExampleMapper;
import in.hocg.sample.core.service.ExampleService;
import in.hocg.sample.facade.domain.Example;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hocgin on 2019/6/9.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Lazy})
public class ExampleServiceImpl extends ServiceImpl<ExampleMapper, Example>
        implements ExampleService {
    
    @Value("${spring.datasource.url}")
    private String v;
    
    @Override
    public void insert() {
        Example entity = new Example();
        entity.setName("Example");
        baseMapper.insert(entity);
    }
    
    @Override
    public Example queryOne() {
        return baseMapper.selectOne(new LambdaQueryWrapper<>());
    }
    
    @Override
    public List<Example> queryAll() {
        return baseMapper.queryAll();
    }
}
