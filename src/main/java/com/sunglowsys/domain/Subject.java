package com.sunglowsys.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "subject_many_to_one")
public class Subject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String SubName;
    public Long code;

    public Subject () {}

    public Subject(String subName, Long code) {
        SubName = subName;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubName() {
        return SubName;
    }

    public void setSubName(String subName) {
        SubName = subName;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(id, subject.id) && Objects.equals(SubName, subject.SubName) && Objects.equals(code, subject.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, SubName, code);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", SubName='" + SubName + '\'' +
                ", code=" + code +
                '}';
    }
}
