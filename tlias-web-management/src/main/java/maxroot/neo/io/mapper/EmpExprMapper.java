package maxroot.neo.io.mapper;

import maxroot.neo.io.pojo.EmpExpr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 员工工作经历
 */
@Mapper
public interface EmpExprMapper {
    void insertBatch(List<EmpExpr> exprList);

    void deleteByEmpIds(List<Integer> ids);
}
