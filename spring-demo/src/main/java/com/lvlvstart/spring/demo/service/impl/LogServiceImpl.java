package com.lvlvstart.spring.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lvlvstart.spring.demo.entity.Log;
import com.lvlvstart.spring.demo.mapper.LogMapper;
import com.lvlvstart.spring.demo.service.LogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * log日志表 服务实现类
 * </p>
 *
 * @author lvzishu@hengdubank.com
 * @since 2021-05-07
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

}
