/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License") +  you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openmeetings.cli;

public class ConnectionProperties {

	private String driver = "org.apache.derby.jdbc.ClientDriver";
	private String url = "jdbc:derby:openmeetings";
	private String login = "user";
	private String password = "secret";

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driverName) {
		this.driver = driverName;
	}

	public String getURL() {
		return url;
	}

	public void setURL(String connectionURL) {
		this.url = connectionURL;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String connectionLogin) {
		this.login = connectionLogin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String connectionPass) {
		this.password = connectionPass;
	}

	@Override
	public String toString() {
		return "ConnectionProperties [driver=" + driver + ", url=" + url
				+ ", login=" + login + ", password=" + password + "]";
	}
}
