/*******************************************************************************
 * Copyright (c) 2010, 2015 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Stuart McCulloch (Sonatype, Inc.) - initial API and implementation
 *
 * Minimal facade required to be binary-compatible with legacy Plexus API
 *******************************************************************************/
package org.codehaus.plexus.configuration;

public class PlexusConfigurationException
    extends Exception
{
    private static final long serialVersionUID = 1L;

    public PlexusConfigurationException( final String message )
    {
        super( message );
    }

    public PlexusConfigurationException( final String message, final Throwable detail )
    {
        super( message, detail );
    }
}
