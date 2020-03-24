package com.jmendoza.stream;

import com.jmendoza.stream.model.Role;
import com.jmendoza.stream.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * flatMap() V/s map() :
 * 1) map() takes a Stream and transform it to another Stream. It applies a function on each element of Stream and store return value into new Stream.
 * It does not flatten the stream. But flatMap() is the combination of a map and a flat operation i.e, it applies a function to elements as well as flatten them.
 * 2) map() is used for transformation only, but flatMap() is used for both transformation and flattening.
 */
public class StreamFlatMap {
    public static void main(String[] args) {

        Role role1 = new Role("Sales", 1);
        Role role2 = new Role("Administration", 2);
        Role role3 = new Role("Report", 2);

        List<Role> roleList = new ArrayList<>();
        roleList.add(role1);
        roleList.add(role2);

        User user = new User("jmendoza", 1);
        user.setRoleList(roleList);

        User user1 = new User("amendoza", 2);
        List<Role> roleList1 = new ArrayList<>();
        roleList1.add(role3);
        roleList1.add(role2);
        user1.setRoleList(roleList1);

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);

        List<String> roles = userList.stream()
                .map(User::getRoleList)
                .flatMap(List::stream)
                .map(Role::getRoleName)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Role List: " + roles);

        List<String> roles1 = userList.stream()
                .map(User::getRoleList)
                .flatMap(List::stream)
                .map(Role::getRoleName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Role List UpperCase : " + roles1);
    }
}
