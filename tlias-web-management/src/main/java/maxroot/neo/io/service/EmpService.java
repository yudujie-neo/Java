package maxroot.neo.io.service;

import maxroot.neo.io.pojo.Emp;
import maxroot.neo.io.pojo.EmpQueryParam;
import maxroot.neo.io.pojo.PageResult;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {

    PageResult page(EmpQueryParam empQueryParam);

    void save(Emp emp);

    void deleteByIds(List<Integer> ids);
}
