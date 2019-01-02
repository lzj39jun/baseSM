package com.wutu.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wutu.entity.User;
import com.wutu.service.IUserService;
import com.wutu.utils.ResultUtils;
import com.wutu.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author 君
 * @since 2019-01-01
 */
@Api(value = "/user",tags = "用户文档")
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "用户信息列表",notes = "方法备注说明")
    @ApiImplicitParam(name = "name",required = true,defaultValue = "0")
    @ApiResponse(code =1 ,message ="dddd",response = User.class,reference = "sss")
    @PostMapping("/save")
    public Result save(User user) {
        User oldUser = (User) user.selectOne(new QueryWrapper<User>().eq("union_id", user.getUnionId()));
        if (oldUser != null) {
            return ResultUtils.success(user);
        }
        user.setCreateTime(System.currentTimeMillis());
        user.insert();
        return ResultUtils.success(user);
    }


}

