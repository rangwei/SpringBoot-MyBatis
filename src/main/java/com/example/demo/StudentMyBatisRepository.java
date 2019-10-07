package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StudentMyBatisRepository {

	@Select("SELECT * FROM student WHERE id = #{id}")
	public Student findById(long id);
	
	@Select("select * from student")
	public List<Student> findAll();
	
	@Delete("DELETE FROM student WHERE id = #{id}")
	public int deleteById(long id);

	@Insert("INSERT INTO student(id, name, passport_number) VALUES (#{id}, #{name}, #{passportNumber})")
	public int insert(Student student);

	@Update("Update student set name=#{name}, passport_number=#{passportNumber} where id=#{id}")
	public int update(Student student);
}
