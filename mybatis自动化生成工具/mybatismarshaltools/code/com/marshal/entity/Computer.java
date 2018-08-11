package com.marshal.entity;

public class Computer {
    private Long id;

    private String computername;

    private String brand;

    private Float runmem;

    private Float price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComputername() {
        return computername;
    }

    public void setComputername(String computername) {
        this.computername = computername;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Float getRunmem() {
        return runmem;
    }

    public void setRunmem(Float runmem) {
        this.runmem = runmem;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}