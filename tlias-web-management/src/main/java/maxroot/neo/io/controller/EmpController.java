package maxroot.neo.io.controller;


import lombok.extern.slf4j.Slf4j;
import maxroot.neo.io.anno.Log;
import maxroot.neo.io.pojo.*;
import maxroot.neo.io.service.EmpService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import maxroot.neo.io.pojo.Emp;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    private final EmpService empService;
    public EmpController(EmpService empService) {
        this.empService = empService;
    }

    @Log
    @GetMapping
    public Result page(EmpQueryParam empQueryParam) {
        PageResult<Emp> pageResult = empService.page(empQueryParam);
        return Result.success(pageResult);
    }


    @PostMapping
    public Result save(@RequestBody Emp emp){
        log.info("请求参数emp: {}", emp);
        empService.save(emp);
        return Result.success();
    }

    @Log
    @DeleteMapping
    public Result delete(@RequestParam List<Integer> ids){
        log.info("批量删除部门: ids={} ", ids);
        empService.deleteByIds(ids);
        return Result.success();
    }
}
