package com.assignment.main;

import com.assignment.admindepartment.AdminDepartment;
import com.assignment.hrdepartment.HrDepartment;
import com.assignment.techdepartment.TechDepartment;

public class Main {

    public static void main(String[] args) {
        HrDepartment hr = new HrDepartment();
        TechDepartment tech = new TechDepartment();
        AdminDepartment admin = new AdminDepartment();

        // Invoking or calling methods of Admin department
        System.out.println(" Welcome to " + admin.departmentName());
        System.out.println(admin.getTodaysWork());
        System.out.println(admin.getWorkDeadline());
        System.out.println(admin.isTodayAHoliday() + '\n');

        // Invoking or calling methods of HR department
        System.out.println(" Welcome to " + hr.departmentName());
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodayAHoliday() + '\n');

        // Invoking or calling methods of Tech department
        System.out.println(" Welcome to " + tech.departmentName());
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(" " + tech.getTechStackInformation());
        System.out.println(tech.isTodayAHoliday());
    }
    // Creating objects for various departments

}