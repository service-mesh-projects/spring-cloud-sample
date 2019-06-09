package in.hocg.sample.web.controller;

import in.hocg.sample.core.service.ExampleService;
import in.hocg.sample.facade.api.IndexController;
import in.hocg.sample.facade.domain.Example;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hocgin on 2019/6/9.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@Slf4j
@RestController
@RequestMapping
@AllArgsConstructor
public class IndexControllerImpl
        implements IndexController {
    
    private final ExampleService service;
    
    @GetMapping("/hi")
    @Override
    public void hi() {
        log.info("Hi {}", "hocgin");
    }
    
    @GetMapping("/insert")
    @Override
    public void insert() {
        service.insert();
    }
    
    @GetMapping("/queryOne")
    @Override
    public Example queryOne() {
        return service.queryOne();
    }
    
    @GetMapping("/queryAll")
    @Override
    public List<Example> queryAll() {
        return service.queryAll();
    }
}
