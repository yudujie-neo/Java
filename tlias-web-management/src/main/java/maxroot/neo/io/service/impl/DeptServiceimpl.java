package maxroot.neo.io.service.impl;

import maxroot.neo.io.mapper.DeptMapper;
import maxroot.neo.io.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DeptServiceimpl implements maxroot.neo.io.service.DeptService
{

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findall() {
        return deptMapper.findAll();
    }
}
