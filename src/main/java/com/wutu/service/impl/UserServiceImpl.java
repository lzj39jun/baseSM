package com.wutu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wutu.entity.User;
import com.wutu.mapper.UserMapper;
import org.springframework.stereotype.Service;
import com.wutu.service.IUserService;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author 君
 * @since 2019-01-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
