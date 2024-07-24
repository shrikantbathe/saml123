package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.saml2.provider.service.registration.RelyingPartyRegistration;
import org.springframework.security.saml2.provider.service.registration.RelyingPartyRegistrationRepository;
import org.springframework.security.saml2.provider.service.web.DefaultRelyingPartyRegistrationResolver;
import org.springframework.security.saml2.provider.service.web.RelyingPartyRegistrationResolver;

public class OpenSamlResponseRelyingPartyRegistrationResolver implements RelyingPartyRegistrationResolver {
    private final RelyingPartyRegistrationResolver delegate;

    public OpenSamlResponseRelyingPartyRegistrationResolver(RelyingPartyRegistrationRepository registrations) {
        this.delegate = new DefaultRelyingPartyRegistrationResolver(registrations);
    }

    public RelyingPartyRegistration resolve(HttpServletRequest request, String registrationId) {
        String samlResponse = request.getParameter("SAMLResponse");
        if (samlResponse == null) {
            return null;
        }
        String entityId = retrieveEntityId(samlResponse);
        if (entityId == null) {
            return null;
        }
        return this.delegate.resolve(request, entityId);
    }

    private String retrieveEntityId(String samlResponse) {
      return "okta";
    }
}