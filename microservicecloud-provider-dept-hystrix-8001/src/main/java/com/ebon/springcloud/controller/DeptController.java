package com.ebon.springcloud.controller;

import com.ebon.springcloud.entities.Dept;
import com.ebon.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
//    @Autowired
//    private DeptService service;
//
//    @RequestMapping(value="/dept/add",method= RequestMethod.POST)
//    public boolean add(@RequestBody Dept dept)
//    {
//        return service.add(dept);
//    }
//
//    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
//    @HystrixCommand(fallbackMethod = "processHystrix_Get")
//    public Dept get(@PathVariable("id") Long id)
//    {
//        return service.get(id);
//    }

    @Autowired
    private DeptService service = null;

    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept =  this.service.get(id);
        if(null == dept)
        {
            throw new RuntimeException("该ID："+id+"没有没有对应的信息");
        }
        return dept;
    }

    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    public List<Dept> list()
    {
        return service.list();
    }


    public Dept processHystrix_Get(@PathVariable("id") Long id)
    {
        return new Dept().setDeptno(id)
                .setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

}
