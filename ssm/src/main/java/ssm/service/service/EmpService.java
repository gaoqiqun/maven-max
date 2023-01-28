package ssm.service.service;

import com.github.pagehelper.PageInfo;
import ssm.bean.Employee;

/**
 * Description: <br/>
 * date: 2023/1/23 16:59 <br/>
 *
 * @author ${gaoqiqun} <br/>
 */
public interface EmpService {
    PageInfo<Employee> getAllEmp(Integer pageNum);
}
