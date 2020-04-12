package com.yan;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yan.mapper.HeroMapper;
import com.yan.entity.Hero;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private HeroMapper heroMapper;
    @Test
    void contextLoads() {
// 参数是一个 Wrapper ，条件构造器，这里我们先不用 null
// 查询全部用户
        List<Hero> heroes = heroMapper.selectList(null);
        heroes.forEach(System.out::println);
    }
    @Test
    void page() {
        IPage<Hero> heroIPage = heroMapper.selectPage(new Page<Hero>(1, 2), null);
        heroIPage.getRecords().forEach(System.out::println);
    }

}
