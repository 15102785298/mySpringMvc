package com.tantian.service;

import java.util.List;

import com.tantian.model.Person;

public interface IPersonService {

    /**
     * ����ȫ����person
     * @return
     */
    List<Person> loadPersons();
}