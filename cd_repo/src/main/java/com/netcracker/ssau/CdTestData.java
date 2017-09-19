package com.netcracker.ssau;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * Created by Pohuh on 18.09.2017.
 */
@Slf4j
@Component
public class CdTestData {
    private final CdRepository cdRepository;
    private final DataSource dataSource;

    @Autowired
    public CdTestData(CdRepository cdRepository, DataSource dataSource) {
        this.cdRepository = cdRepository;
        this.dataSource = dataSource;
    }

    @PostConstruct
    public void initTestData(){
        cdRepository.save(new Cd("By myself","Linkin Park", "Rock"));
        cdRepository.save(new Cd("Beautiful lie","30 Seconds to mars", "Rock"));
    }
}
