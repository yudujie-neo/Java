package maxroot.neo.io.service;

import maxroot.neo.io.pojo.PageResult;

public interface EmpService {
    /**
     * @param page 页码
     * @param pagesize 页码记录数
     */
    PageResult page(Integer page, Integer pagesize);
}
