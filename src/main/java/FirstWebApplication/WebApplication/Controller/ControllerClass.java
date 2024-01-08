package FirstWebApplication.WebApplication.Controller;

import FirstWebApplication.WebApplication.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // this is the first thing which is going to be search by jvm after starting the execution
public class ControllerClass {

    @GetMapping("/message") // if we want to display the data we use @GetMapping
    public String welcomeMessage(){
        // by writing this the control will be automatically transfer to welcome.html file
        return "welcome";//we only have to mention the file name not the extension it will automatically search for welcome.html
    }

    @GetMapping("/student")
    public String getStudentData(Model model){//Model reference should be inside the method signature because
        // if we provide it inside the method then it should be initialized (because of local variable) then model = null;
        // means it will give null pointer exception
        // taken from spring package interface of model
        Student s1 = new Student(101,"RORONOA ZORO");
        model.addAttribute("student",s1);

        return "student";
    }
}
