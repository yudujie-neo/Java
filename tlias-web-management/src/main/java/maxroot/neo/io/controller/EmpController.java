package maxroot.neo.io.controller;


import maxroot.neo.io.pojo.Emp;
import maxroot.neo.io.pojo.PageResult;
import maxroot.neo.io.pojo.Result;
import maxroot.neo.io.service.EmpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import maxroot.neo.io.pojo.Emp;


@RestController
@RequestMapping("/emps")
public class EmpController {
    private final EmpService empService;

    public EmpController(EmpService empService) {
        this.empService = empService;
    }

    @GetMapping
    public Result page(@RequestParam(defaultValue = "1")Integer page,
                       @RequestParam(defaultValue = "10")Integer pageSize){
        PageResult<Emp> pageResult = empService.page(page,pageSize);
        return Result.success(pageResult);

    }
}
