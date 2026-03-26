package com.example.contactapp.service;

import com.example.contactapp.model.Contact;
import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class ContactService {

    private Stack<Contact> stack = new Stack<>();

    // PUSH
    public void add(Contact contact) {
        stack.push(contact);
    }

    // POP
    public Contact remove() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    // VIEW
    public Stack<Contact> getAll() {
        return stack;
    }
}