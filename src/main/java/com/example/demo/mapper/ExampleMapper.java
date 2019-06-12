package com.example.demo.mapper;


import com.example.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ExampleMapper {

    @Insert("Insert into person(id,name,passwd,email) values(#{Id},#{name},#{passwd},#{email})")
    void insertPerson(Person person);
    @Select("select id from user")
    String selectName();
}
