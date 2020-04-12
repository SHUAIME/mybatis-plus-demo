package com.yan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yan.entity.Hero;
import com.yan.mapper.HeroMapper;
import com.yan.service.HeroService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yan
 * @since 2020-04-11
 */
@Service
public class HeroServiceImpl extends ServiceImpl<HeroMapper, Hero> implements HeroService {

}
