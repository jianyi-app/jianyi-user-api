package com.jianyi.user.api.remote;

import com.jianyi.user.api.model.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("JIANYI-USER")
public interface UserInfoApiRemote {

    @RequestMapping(method = RequestMethod.GET, value = "/user/get/{userId}")
    UserInfo getByUserId(@PathVariable("userId") String userId);

}
