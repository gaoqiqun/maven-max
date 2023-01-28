package ssm.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ssm.EmpService;
import ssm.bean.Employee;

/**
 * Description: <br/>
 * date: 2023/1/23 16:58 <br/>
 *
 * @author ${gaoqiqun} <br/>
 */
@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/employee/page/{pageNum}")
    public String getAllEmp(@PathVariable Integer pageNum, Model model){
        PageInfo<Employee> pageInfo = empService.getAllEmp(pageNum);
        System.out.println(pageInfo);
        model.addAttribute("page",pageInfo);
        return "employee_list";
    }
}
