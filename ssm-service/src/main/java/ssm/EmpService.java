package ssm;

import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;
import ssm.bean.Employee;

/**
 * Description: <br/>
 * date: 2023/1/23 16:59 <br/>
 *
 * @author ${gaoqiqun} <br/>
 */
@Transactional
public interface EmpService {
    PageInfo<Employee> getAllEmp(Integer pageNum);
}
