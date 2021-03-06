/*
Copyright (C) 2001, 2006 United States Government
as represented by the Administrator of the
National Aeronautics and Space Administration.
All Rights Reserved.
*/
package gov.nasa.worldwind.globes;

import gov.nasa.worldwind.avlist.AVKey;

/**
 * @author Tom Gaskins
 * @version $Id: Earth.java 12933 2009-12-17 06:41:51Z garakl $
 */

public class Earth extends EllipsoidalGlobe
{
    public static final double WGS84_EQUATORIAL_RADIUS = 6378137.0; // ellipsoid equatorial getRadius, in meters
    public static final double WGS84_POLAR_RADIUS = 6356752.3; // ellipsoid polar getRadius, in meters
    public static final double WGS84_ES = 0.00669437999013; // eccentricity squared, semi-major axis

    public Earth()
    {
        super(WGS84_EQUATORIAL_RADIUS, WGS84_POLAR_RADIUS, WGS84_ES,
            EllipsoidalGlobe.makeElevationModel(AVKey.EARTH_ELEVATION_MODEL_CONFIG_FILE,
                "config/Earth/EarthElevationModelAsBil32.xml"));
    }

    public String toString()
    {
        return "Earth";
    }
}
