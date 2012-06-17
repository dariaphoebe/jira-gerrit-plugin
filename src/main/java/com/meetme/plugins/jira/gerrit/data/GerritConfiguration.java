/*
 * Copyright 2012 MeetMe, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.meetme.plugins.jira.gerrit.data;

import java.io.File;
import java.net.URI;

public interface GerritConfiguration {
    public static final int DEFAULT_SSH_PORT = 29418;
    public static String FIELD_SSH_HOSTNAME = "sshHostname";
    public static String FIELD_SSH_USERNAME = "sshUsername";
    public static String FIELD_SSH_PORT = "sshPort";
    public static String FIELD_SSH_PRIVATE_KEY = "sshPrivateKey";
    public static String FIELD_HTTP_BASE_URL = "httpBaseUrl";
    public static String FIELD_HTTP_USERNAME = "httpUsername";
    public static String FIELD_HTTP_PASSWORD = "httpPassword";

    public abstract String getSshHostname();

    public abstract void setSshHostname(String hostname);

    public abstract int getSshPort();

    public abstract void setSshPort(int port);

    public abstract String getSshUsername();

    public abstract void setSshUsername(String username);

    public abstract String getHttpUsername();

    public abstract void setHttpUsername(String httpUsername);

    public abstract String getHttpPassword();

    public abstract void setHttpPassword(String httpPassword);

    public abstract URI getHttpBaseUrl();

    public abstract void setHttpBaseUrl(String httpBaseUrl);

    public abstract File getSshPrivateKey();

    public abstract void setSshPrivateKey(File sshPrivateKey);

}
