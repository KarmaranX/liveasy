package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course("Mangalore", "Bangalore","Metal","canter", 2,200,1234));
		list.add(new Course("Kolkata", "Orissa","Stuff","canter", 1, 150, 4568));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long shipperId) {
		Course c = null;
		for(Course course:list)
		{
			if(course.getShipperId()==shipperId)
			{
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course delCourse(long shipperId) {
		Course c = null;
		for(Course course:list)
		{
			if(course.getShipperId()==shipperId)
			{
				c = course;
				break;
			}
		}
		list.remove(c);
		return null;
	}

}
