package com.lvlvstart.sharding.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 类描述
 * @author lvzishu
 * @since 2021/11/21 21:09
 */
@Entity
@Data
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;


    @Column(name = "class_id")
    private Long classId;

}
