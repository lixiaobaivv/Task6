package com.jnshu.entity;

import java.io.Serializable;

public class UserBean implements Serializable {

    private static final long serialVersionUID = 9174194101246733501L;

    private String name;
    private String password;

    public UserBean(String name,String password){
        this.name = name;
        this.password = password;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result
                +((password ==null) ? 0 : password.hashCode());
        result = prime * result
                +((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserBean other = (UserBean) obj;
        if (password == null){
            if (other.password !=null)
                return false;
        }else if (!password.equals(other.password))
            return false;
        if (name == null){
            if (other.name != null)
                return false;
        }else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString(){
        return "name:" + name + ",password" + password;
    }
}
