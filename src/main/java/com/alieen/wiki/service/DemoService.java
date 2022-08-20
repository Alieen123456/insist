package com.alieen.wiki.service;

import com.alieen.wiki.domain.Demo;
import com.alieen.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list() {

        return demoMapper.selectByExample(null);
    }
}
