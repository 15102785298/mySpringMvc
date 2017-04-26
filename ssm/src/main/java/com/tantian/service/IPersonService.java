package com.tantian.service;

import java.util.List;

import com.tantian.model.Person;

public interface IPersonService {

    /**
     * 加载全部的person
     * @return
     */
    List<Person> loadPersons();
}