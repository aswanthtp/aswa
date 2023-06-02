package com.ust.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="User")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Column(name="userid")
	private int userId;
    @Column(name="username")
    private String username;
    @Column(name="favouriteId")
	private int favouriteId;
}
