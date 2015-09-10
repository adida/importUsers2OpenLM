package com.openlm.userimport;

import java.lang.reflect.Field;
import java.util.List;

/**
 * This class represents...
 */
public class User {
    public String userName;
    public String firstName;
    public String lastName;
    public String displayName;
    public String title;
    public String department;
    public String phoneNumber;
    public String description;
    public String office;
    public String email;
    public Boolean enabled;
    public List<String> groups;
    public String defaultGroup;
    public List<String> projects;
    public String defaultProject;

    public User(String userName,
                String firstName,
                String lastName,
                String displayName,
                String title,
                String department,
                String phoneNumber,
                String description,
                String office,
                String email,
                Boolean enabled,
                List<String> groups,
                String defaultGroup,
                List<String> projects,
                String defaultProject) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.title = title;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.office = office;
        this.email = email;
        this.enabled = enabled;
        this.groups = groups;
        this.defaultGroup = defaultGroup;
        this.projects = projects;
        this.defaultProject = defaultProject;
    }

    public void merge(User existingUser) {
        try {
            for (Field field : getClass().getDeclaredFields()) {
                Object value = field.get(this);
                if (value == null) {
                    field.set(this, field.get(existingUser));
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException();
        }
    }
}
