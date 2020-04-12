package com.yan.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yan.entity.CommonResult;
import com.yan.entity.Hero;
import com.yan.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yan
 * @since 2020-04-11
 */
@RestController
@RequestMapping("/hero")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @PostMapping("/selectPage")
    public IPage<Hero> selectPage(@RequestBody Hero hero,@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "3")Integer row){
        QueryWrapper<Hero> wrapper = new QueryWrapper<>();
        if (hero.getName() != null && !hero.getName().trim().equals("")){
            wrapper.like("name",hero.getName());
        }
        Page<Hero> heroPage = new Page<>(page, row);
        return heroService.page(heroPage,wrapper);
    }

    @PostMapping("/add")
    public CommonResult add(@RequestBody Hero hero){
        try{
            heroService.save(hero);
            return new CommonResult(200,"成功");
        }catch (Exception e){
            return new CommonResult(400,"成功");
        }
    }

    @PostMapping("/update")
    public CommonResult update(@RequestBody Hero hero){
        try{
            heroService.updateById(hero);
            return new CommonResult(200,"成功");
        }catch (Exception e){
            return new CommonResult(400,"成功");
        }
    }

    @PostMapping("/delete")
    public CommonResult delete(@RequestBody Hero hero){
        try{
            heroService.removeById(hero);
            return new CommonResult(200,"成功");
        }catch (Exception e){
            return new CommonResult(400,"成功");
        }
    }

    @PostMapping("/selectOne")
    public CommonResult selectOne(@RequestBody Hero hero){
        try{
            return new CommonResult(200,"成功",heroService.getById(hero));
        }catch (Exception e){
            return new CommonResult(400,"成功");
        }
    }
}

