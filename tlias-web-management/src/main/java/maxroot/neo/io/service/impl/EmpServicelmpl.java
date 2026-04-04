package maxroot.neo.io.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import maxroot.neo.io.mapper.EmpMapper;
import maxroot.neo.io.pojo.Emp;
import maxroot.neo.io.pojo.EmpQueryParam;
import maxroot.neo.io.pojo.PageResult;
import maxroot.neo.io.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpServicelmpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
/*
    @Override
    public PageResult page(Integer page, Integer pageSize) {

        //1. 获取总记录数
        Long total = empMapper.count();

        //2. 获取结果列表
        Integer start = (page - 1) * pageSize;
        List<Emp> empList = empMapper.list(start, pageSize);

        //3. 封装结果
        return new PageResult<Emp>(total, empList);

    }

 */
@Override
public PageResult page(EmpQueryParam empQueryParam) {
    //1. 设置分页参数
    PageHelper.startPage(empQueryParam.getPage(),empQueryParam.getPageSize());

    //2. 执行查询
    List<Emp> empList = empMapper.list(empQueryParam);
    Page<Emp> p = (Page<Emp>) empList;

    //3. 封装结果
    return new PageResult(p.getTotal(), p.getResult());
}

}
