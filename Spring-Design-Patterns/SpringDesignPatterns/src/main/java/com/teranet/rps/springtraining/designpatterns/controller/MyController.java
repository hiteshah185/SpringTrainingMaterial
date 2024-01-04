package com.teranet.rps.springtraining.designpatterns.controller;

import com.teranet.rps.springtraining.designpatterns.builder.ContactCard;
import com.teranet.rps.springtraining.designpatterns.builder.ContactCardBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@Profile("!dev")
@RestController
@RequestMapping("/api/mainController")
public class MyController {
    @Autowired
    private ContactCardBuilder contactCardBuilder;
    @GetMapping("/getAllContacts")
    public List<ContactCard> getContacts(){
        List<ContactCard>  contactCards = new ArrayList<>();
        ContactCard contactCard = new ContactCard();
        contactCard.setFirstName("Romeo");
        contactCard.setLastName("S");
        contactCard.setDepartment("Admin");
        contactCard.setWorkEmail("romeor007@mail.com");
        contactCards.add(contactCard);
        contactCards.add(new ContactCardBuilder().setWorkEmail("someonenew@mail.com").buildContactCard());
        return contactCards;
    }

}
