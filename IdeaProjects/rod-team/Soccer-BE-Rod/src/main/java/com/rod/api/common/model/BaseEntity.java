package com.rod.api.common.model;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.EntityListeners;
//import jakarta.persistence.MappedSuperclass;
//import lombok.Getter;
//import lombok.experimental.SuperBuilder;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//@MappedSuperclass
//@Getter
//@EntityListeners(AuditingEntityListener.class)
//public class BaseEntity {
//
//    @CreatedDate
//    @Column(name = "createAt", updatable = false)
//    private LocalDateTime createAt;
//
//    @LastModifiedDate
//    @Column(name = "updateAt")
//    private LocalDateTime updateAt;
//}
