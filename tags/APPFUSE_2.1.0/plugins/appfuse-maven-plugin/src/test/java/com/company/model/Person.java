package com.company.model;

import org.compass.annotations.Searchable;
import org.compass.annotations.SearchableComponent;
import org.compass.annotations.SearchableId;
import org.compass.annotations.SearchableProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * This class is used to test the install feature of this plugin.
 * Ideally, this could all be done with Java code (see InstallArtifactsMojoTest),
 * but MavenEmbedder doesn't seem to recognize plugins with extensions (i.e. the warpath plugin).
 */
@Entity
@Table(name = "person")
@Searchable
public class Person implements java.io.Serializable {
    private Long id;
    private Date creationDate;
    private String email;
    private Integer age;
    private Date modificationDate;
    private String username;
    private boolean active;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SearchableId
    public Long getId() {
        return id;
    }

    @Column(name = "creation_date", nullable = false)
    @SearchableProperty
    public Date getCreationDate() {
        return creationDate;
    }

    @Column(name = "email_address", length = 40, unique = true, nullable = false)
    @SearchableProperty
    public String getEmail() {
        return email;
    }

    @Column(name = "modification_date", nullable = false)
    @SearchableProperty
    public Date getModificationDate() {
        return modificationDate;
    }

    @Column(name = "username")
    @SearchableProperty
    public String getUsername() {
        return username;
    }

    @Column(nullable = false)
    @SearchableProperty
    public Integer getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}