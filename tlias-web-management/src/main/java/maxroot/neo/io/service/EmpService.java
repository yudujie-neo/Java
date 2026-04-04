package maxroot.neo.io.service;

import maxroot.neo.io.pojo.EmpQueryParam;
import maxroot.neo.io.pojo.PageResult;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public interface EmpService {

    PageResult page(EmpQueryParam empQueryParam);
}
