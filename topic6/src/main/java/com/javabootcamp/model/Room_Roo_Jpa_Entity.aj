// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.javabootcamp.model;

import com.javabootcamp.model.Room;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Room_Roo_Jpa_Entity {
    
    declare @type: Room: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Room.id;
    
    @Version
    @Column(name = "version")
    private Integer Room.version;
    
    public Long Room.getId() {
        return this.id;
    }
    
    public void Room.setId(Long id) {
        this.id = id;
    }
    
    public Integer Room.getVersion() {
        return this.version;
    }
    
    public void Room.setVersion(Integer version) {
        this.version = version;
    }
    
}
