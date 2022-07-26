package com.laoz.mq.producter.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.laoz.mq.common.domain.R;
import com.laoz.mq.common.domain.UserDTO;
import com.laoz.mq.common.utils.StringUtils;
import com.laoz.mq.producter.service.SendService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author: laoz
 * @Time: 2022/7/22  11:30
 * @description:
 */
@RequestMapping("/mq")
@RestController
public class SendController {
    @Resource
    private  SendService service;

    /**
     *
     * @param type `direct` or `topic` exchange
     * @param userName
     * @param dead  if(true) {this message will be into deadQueue}
     * @return
     */
    @GetMapping("/send")
    public R send(String type ,String userName ,Boolean dead){
        if(StringUtils.isEmpty(type)){
            type = "direct";
        }
        UserDTO user = new UserDTO();
        user.setId(new Date().getTime());
        user.setUserName(userName);
        user.setBirthDay(new Date());
        user.setDead(dead);

        if(StringUtils.isNotEmpty(userName)) {
            try {
                service.run(type, user);
                return R.ok();
            }catch (JsonProcessingException e){
                e.printStackTrace();
                return R.fail(e.getMessage());
            }
        }else{
            return R.fail("params not be null");
        }
    }
}
