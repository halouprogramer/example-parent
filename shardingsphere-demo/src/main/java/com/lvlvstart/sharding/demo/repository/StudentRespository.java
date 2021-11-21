package com.lvlvstart.sharding.demo.repository;

import com.lvlvstart.sharding.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 类描述
 *
 * @author lvzishu
 * @since 2021/11/21 21:17
 */
public interface StudentRespository extends JpaRepository<Student,Long> {
}
