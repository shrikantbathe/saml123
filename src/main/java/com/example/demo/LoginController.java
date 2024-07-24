package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.saml2.provider.service.registration.RelyingPartyRegistrationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class LoginController {
   // private final RelyingPartyRegistrationRepository relyingParties;

    // ... constructor

    @GetMapping("/login1")
    public void  login1(HttpServletRequest request, HttpServletResponse response) throws IOException {



        response.sendRedirect("/app?idp=two");
//        String RelyingPartyRegistration;
//        String registrationId = "";// ... derive from the host name
//
//        response.sendRedirect("/");
//                RelyingPartyRegistration relyingParty = this.relyingParties
//                .findByRegistrationId(registrationId);
//        if (relyingParty == null) {
//            response.setStatusCode(401);
//        } else {
//            response.sendRedirect("/saml2/authenticate/" + registrationId);
//        }
    }
}