package com.structural.adapter;

class UserAdapter extends RepositoryUser {

    public UserAdapter(User user) {
        super(user.getName(), user.getEmail());
    }
}