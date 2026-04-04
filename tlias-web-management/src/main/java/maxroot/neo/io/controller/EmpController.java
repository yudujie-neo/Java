package maxroot.neo.io.controller;


import maxroot.neo.io.pojo.Emp;
import maxroot.neo.io.pojo.PageResult;
import maxroot.neo.io.pojo.Result;
import maxroot.neo.io.service.EmpService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import maxroot.neo.io.pojo.Emp;

import java.time.LocalDate;


@RestController
@RequestMapping("/emps")
public class EmpController {
    private final EmpService empService;

    public EmpController(EmpService empService) {
        this.empService = empService;
    }

    @GetMapping
    public Result page(@RequestParam(defaultValue = "1")Integer page,
                       @RequestParam(defaultValue = "10")Integer pageSize,
                       String name, Integer gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
        PageResult<Emp> pageResult = empService.page(page,pageSize,name,gender,begin,end);
        return Result.success(pageResult);

    }
}
