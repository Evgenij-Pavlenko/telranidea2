package de.telran.demo.entity;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class BlogPost {
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String body;
//
//    public BlogPost(){
//    }
//
//    public BlogPost(String title, String body) {
//        this.title = title;
//        this.body = body;
//    }
}
