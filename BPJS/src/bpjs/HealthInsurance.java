package bpjs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tento
 */
class HealthInsurance {
    private int id;
    private String name;
    private String address;
    private String gender;
    private String nik;

    public HealthInsurance(int id, String name, String address, String gender, String nik) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.nik = nik;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getPolicyNumber() {
        return nik;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPolicyNumber(String nik) {
        this.nik = nik;
    }
}