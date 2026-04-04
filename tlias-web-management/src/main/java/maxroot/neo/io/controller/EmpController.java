package maxroot.neo.io.controller;


import maxroot.neo.io.pojo.*;
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
    public Result page(EmpQueryParam empQueryParam) {
        PageResult<Emp> pageResult = empService.page(empQueryParam);
        return Result.success(pageResult);

    }
}
