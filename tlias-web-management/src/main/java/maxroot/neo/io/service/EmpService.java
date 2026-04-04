package maxroot.neo.io.service;

import maxroot.neo.io.pojo.PageResult;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public interface EmpService {
    /**
     * @param page 页码
     * @param pageSize 页码记录数
     */
    PageResult page(Integer page, Integer pageSize,String name, Integer gender, LocalDate begin, LocalDate end);
}
