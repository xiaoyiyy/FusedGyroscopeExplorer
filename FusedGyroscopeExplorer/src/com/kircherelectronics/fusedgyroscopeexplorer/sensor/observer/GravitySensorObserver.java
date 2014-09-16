package com.kircherelectronics.fusedgyroscopeexplorer.sensor.observer;

/*
 * Fused Gyroscope Explorer
 * Copyright (C) 2013, Kaleb Kircher - Kircher Engineering, LLC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * An gravity sensor observer interface. Classes that need to observe the
 * acceleration sensor for updates should do so with this interface.
 * 
 * @author Kaleb
 * @version %I%, %G%
 */
public interface GravitySensorObserver
{
	/**
	 * Notify observers when new gravity measurements are available.
	 * @param gravity the gravity values (x, y, z)
	 * @param timeStamp the time of the sensor update.
	 */
	public void onGravitySensorChanged(float[] gravity,
			long timeStamp);
}
