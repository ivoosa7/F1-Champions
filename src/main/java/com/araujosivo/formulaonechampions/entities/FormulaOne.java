package com.araujosivo.formulaonechampions.entities;

import java.io.Serializable;
import java.time.Year;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FormulaOne implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String driver;
    private String constructor;
    private Year season;
    private Long points;
    private Long wins;
    private String car;
    private String engine;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public String getConstructor() {
        return constructor;
    }
    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }
    public Year getSeason() {
        return season;
    }
    public void setSeason(Year season) {
        this.season = season;
    }
    public Long getPoints() {
        return points;
    }
    public void setPoints(Long points) {
        this.points = points;
    }
    public Long getWins() {
        return wins;
    }
    public void setWins(Long wins) {
        this.wins = wins;
    }
    public String getCar() {
        return car;
    }
    public void setCar(String car) {
        this.car = car;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FormulaOne other = (FormulaOne) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
    
}
