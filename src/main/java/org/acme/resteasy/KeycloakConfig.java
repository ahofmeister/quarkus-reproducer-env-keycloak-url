package org.acme.resteasy;

import io.quarkus.arc.config.ConfigProperties;

/**
 * @author Alexander Hofmeister
 */
@ConfigProperties(prefix = "keycloak")
public class KeycloakConfig {

  public String url;

  public String realm;

}
