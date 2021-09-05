package com.enterprize.enterprizeflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @GetMapping("/sum")
    public long getSum()
    {
        return 1000;
    }


}

class  BusinessLogic
{
}
class DataServices
{
}

