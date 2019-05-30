package com.acquisition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yxk
 * @Description: 通配Contrller
 * @create 2019/5/30
 * @since 1.0.0
 */
@Controller
public class AdaptiveRouteContrller {


   @RequestMapping(value = "/{index}")
    public String index(@PathVariable("index") String index) {
        return index;
    }


}
