/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Represents an update to a server.
 */
@JsonFlatten
public class ServerUpdate extends ProxyResource {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The fully qualified domain name of the server.
     */
    @JsonProperty(value = "properties.fullyQualifiedDomainName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullyQualifiedDomainName;

    /**
     * The version of the server. Possible values include: '2.0', '12.0'.
     */
    @JsonProperty(value = "properties.version")
    private ServerVersion version;

    /**
     * Administrator username for the server. Can only be specified when the
     * server is being created (and is required for creation).
     */
    @JsonProperty(value = "properties.administratorLogin")
    private String administratorLogin;

    /**
     * The administrator login password (required for server creation).
     */
    @JsonProperty(value = "properties.administratorLoginPassword")
    private String administratorLoginPassword;

    /**
     * The ID of the Active Azure Directory object with admin permissions on
     * this server. Legacy parameter, always null. To check for Active
     * Directory admin, query .../servers/{serverName}/administrators.
     */
    @JsonProperty(value = "properties.externalAdministratorSid", access = JsonProperty.Access.WRITE_ONLY)
    private UUID externalAdministratorSid;

    /**
     * The display name of the Azure Active Directory object with admin
     * permissions on this server. Legacy parameter, always null. To check for
     * Active Directory admin, query .../servers/{serverName}/administrators.
     */
    @JsonProperty(value = "properties.externalAdministratorLogin", access = JsonProperty.Access.WRITE_ONLY)
    private String externalAdministratorLogin;

    /**
     * The state of the server. Possible values include: 'Ready', 'Disabled'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private ServerState state;

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the ServerUpdate object itself.
     */
    public ServerUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the fully qualified domain name of the server.
     *
     * @return the fullyQualifiedDomainName value
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * Get the version of the server. Possible values include: '2.0', '12.0'.
     *
     * @return the version value
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set the version of the server. Possible values include: '2.0', '12.0'.
     *
     * @param version the version value to set
     * @return the ServerUpdate object itself.
     */
    public ServerUpdate withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get administrator username for the server. Can only be specified when the server is being created (and is required for creation).
     *
     * @return the administratorLogin value
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set administrator username for the server. Can only be specified when the server is being created (and is required for creation).
     *
     * @param administratorLogin the administratorLogin value to set
     * @return the ServerUpdate object itself.
     */
    public ServerUpdate withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administrator login password (required for server creation).
     *
     * @return the administratorLoginPassword value
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administrator login password (required for server creation).
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set
     * @return the ServerUpdate object itself.
     */
    public ServerUpdate withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the ID of the Active Azure Directory object with admin permissions on this server. Legacy parameter, always null. To check for Active Directory admin, query .../servers/{serverName}/administrators.
     *
     * @return the externalAdministratorSid value
     */
    public UUID externalAdministratorSid() {
        return this.externalAdministratorSid;
    }

    /**
     * Get the display name of the Azure Active Directory object with admin permissions on this server. Legacy parameter, always null. To check for Active Directory admin, query .../servers/{serverName}/administrators.
     *
     * @return the externalAdministratorLogin value
     */
    public String externalAdministratorLogin() {
        return this.externalAdministratorLogin;
    }

    /**
     * Get the state of the server. Possible values include: 'Ready', 'Disabled'.
     *
     * @return the state value
     */
    public ServerState state() {
        return this.state;
    }

}
