package com.xy.ups.api;

import com.xy.ups.utils.facade.ResponseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by tengfei on 2018/10/21.
 */
@Controller
@RequestMapping("/user")
public class UserApi {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody ResponseResult<Boolean> login(HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        return null;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody ResponseResult<String> register(@RequestBody String id) {
        return null;
    }

    @RequestMapping(value = "check_login_id_valid", method = RequestMethod.GET)
    public @ResponseBody ResponseResult<Boolean> checkLoginIdValid(String loginId) {
        return null;
    }

    @RequestMapping(value = "check_user_name_valid", method = RequestMethod.GET)
    public @ResponseBody ResponseResult<Boolean> checkUserNameValid(String userName) {
        return null;
    }
}
