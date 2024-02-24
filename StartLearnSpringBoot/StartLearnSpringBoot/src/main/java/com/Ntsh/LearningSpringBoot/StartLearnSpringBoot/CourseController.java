package com.Ntsh.LearningSpringBoot.StartLearnSpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	//@RequestMapping("/courses")
	public List<Course>retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "ntsh"),
				new Course(2, "Learn Spring", "Sunny"),
				new Course(3, "Learn Boot", "Vijju"),
				new Course(3, "Learn Azure", "Adepu")
				
				);
	}
	

}
