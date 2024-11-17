package com.structural.adapter;

class UserRepository {

    public void saveUser(User user) {
        RepositoryUser repositoryUser = new UserAdapter(user);
        repositoryUser.save();
    }
}
