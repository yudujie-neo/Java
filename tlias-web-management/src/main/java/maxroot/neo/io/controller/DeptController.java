package maxroot.neo.io.controller;

import maxroot.neo.io.pojo.Dept;
import maxroot.neo.io.pojo.Result;
import maxroot.neo.io.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/depts")
    public Result list(){
        System.out.println("查询所有信息");
        List<Dept> deptList = deptService.findall();
        return Result.success(deptList);

    }
}
