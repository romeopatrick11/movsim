/**
 * Copyright (C) 2010, 2011 by Arne Kesting, Martin Treiber,
 *                             Ralph Germ, Martin Budden
 *                             <info@movsim.org>
 * ----------------------------------------------------------------------
 * 
 *  This file is part of 
 *  
 *  MovSim - the multi-model open-source vehicular-traffic simulator 
 *
 *  MovSim is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MovSim is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MovSim.  If not, see <http://www.gnu.org/licenses/> or
 *  <http://www.movsim.org>.
 *  
 * ----------------------------------------------------------------------
 */
package org.movsim.utilities;

import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Class MyRandom.
 */
public class MyRandom {

    /** The rand. */
    private static Random rand;

    /**
     * Instantiates a new my random.
     */
    private MyRandom() {
        // enforce singleton property with private constructor
    }

    /**
     * Initialize.
     * 
     * @param withDefinedSeed
     *            the with defined seed
     * @param randomSeed
     *            the random seed
     */
    public static void initialize(boolean withDefinedSeed, long randomSeed) {
        rand = (withDefinedSeed) ? new Random(randomSeed) : new Random();
    }

    /**
     * Next int.
     * 
     * @return the int
     */
    public static int nextInt() {
        return rand.nextInt();
    }

    // G(0,1) Gleichverteilung
    /**
     * Next double.
     * 
     * @return the double
     */
    public static double nextDouble() {
        return rand.nextDouble();
    }

}