package org.acme.resteasy;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/envs")
public class EnvResource {

  @Inject
  KeycloakConfig keycloakConfig;

  @GET
  public String init() {
    return keycloakConfig.url + " -> " + keycloakConfig.realm;
  }
}
