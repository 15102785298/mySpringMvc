package com.tantian.mapping;

import java.util.List;

import com.tantian.model.Person;

public interface PersonMapper {
    /**
     * ����һ����¼
     * @param person
     */
    void insert(Person person);

    /**
     * ��ѯ����
     * @return
     */
    List<Person> queryAll();
}
