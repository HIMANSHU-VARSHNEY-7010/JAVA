package com.SpringBoot.SpringBoot;

public class Appliance {
    private long id;
    private String name;
    private String company;

    public Appliance(long id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Company='" + company + '\'' +
                '}';
    }
}
