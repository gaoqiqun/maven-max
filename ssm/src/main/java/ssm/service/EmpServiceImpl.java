package ssm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.bean.Employee;
import ssm.mapper.EmpMapper;
import ssm.service.service.EmpService;

import java.util.List;

/**
 * Description: <br/>
 * date: 2023/1/23 17:03 <br/>
 *
 * @author ${gaoqiqun} <br/>
 */
@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    public PageInfo<Employee> getAllEmp(Integer pageNum) {
        PageHelper.startPage(pageNum,4);
        List<Employee> allEmp = empMapper.getAllEmp();
        PageInfo<Employee> pageInfo = new PageInfo<Employee>(allEmp,5);
        return pageInfo;
    }
}
