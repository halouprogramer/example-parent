package com.lvlvstart.sharding.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 类描述
 *
 * @author lvzishu
 * @since 2021/11/21 21:10
 */
@Entity
@Table(name = "student_detail")
@Data
public class StudentDetail implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "address")
    private String address;
}
