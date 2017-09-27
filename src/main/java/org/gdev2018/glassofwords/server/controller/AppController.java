package org.gdev2018.glassofwords.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by RET on 2017-09-27.
 */
@Controller
@RequestMapping("/api")
public class AppController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)

    @ResponseBody   // we want return just string, not page
    public String getTest(ModelMap model) {
        return "test connection";
    }
}
