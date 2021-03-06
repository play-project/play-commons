/**
 *
 * Copyright (c) 2013, Linagora
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA 
 *
 */
package org.ow2.play.commons.rest.error;

import javax.ws.rs.core.Response.Status;

/**
 * @author chamerling
 * 
 */
public class Response {

	/**
	 * Return the error as JSON with the HTTP 400 client error code.
	 * 
	 * @param error
	 * @return
	 */
	public static final javax.ws.rs.core.Response error(Error error) {
		return javax.ws.rs.core.Response.status(Status.BAD_REQUEST)
				.entity(error).build();
	}
}
