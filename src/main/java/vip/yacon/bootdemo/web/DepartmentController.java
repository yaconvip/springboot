package vip.yacon.bootdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.yacon.bootdemo.entity.Department;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("dept")
public class DepartmentController {

    @RequestMapping("/get/{id}")
    public String getUser(@PathVariable int id, Model model) {
        model.addAttribute("dept", new Department(id, "研发部", "厦门软件研发中心"));
        return "/dept/detail";
    }

    @RequestMapping("list")
    public String listUser(Model model) {
        List<Department> deptList = new ArrayList<Department>();
        for (int i = 0; i < 10; i++) {
            deptList.add(new Department(i, "研发部" + i, "厦门软件研发中心" + i));
        }
        model.addAttribute("depts", deptList);
        return "/dept/list";
    }
}
