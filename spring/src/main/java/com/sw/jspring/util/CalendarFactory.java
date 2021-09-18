package com.sw.jspring.util;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Calendar;

@Repository("calendarFactory")
public class CalendarFactory implements FactoryBean<Calendar> {

    @Autowired
    private Calendar instance = Calendar.getInstance();
    public CalendarFactory() {
    }

    @Override
    public Calendar getObject() throws Exception {
        return instance;
    }

    @Override
    public Class<?> getObjectType() {
        return instance.getClass();
    }

    public void addDate (int myday){
        instance.add(Calendar.DAY_OF_YEAR, myday);
    }
}
