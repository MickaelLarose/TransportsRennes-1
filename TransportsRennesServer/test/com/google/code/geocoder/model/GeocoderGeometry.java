/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.google.code.geocoder.model;


/**
 * @author <a href="mailto:panchmp@gmail.com">Michael Panchenko</a>
 */
public class GeocoderGeometry {
	protected LatLng location;
	protected GeocoderLocationType locationType;
	protected LatLngBounds viewport;

	public LatLng getLocation() {
		return location;
	}

	public void setLocation(final LatLng location) {
		this.location = location;
	}

	public GeocoderLocationType getLocationType() {
		return locationType;
	}

	public void setLocationType(final GeocoderLocationType locationType) {
		this.locationType = locationType;
	}

	public LatLngBounds getViewport() {
		return viewport;
	}

	public void setViewport(final LatLngBounds viewport) {
		this.viewport = viewport;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		final GeocoderGeometry that = (GeocoderGeometry) obj;

		return !(location != null ? !location.equals(that.location) : that.location != null) && locationType == that.locationType &&
				!(viewport != null ? !viewport.equals(that.viewport) : that.viewport != null);

	}

	@Override
	public int hashCode() {
		int result = location != null ? location.hashCode() : 0;
		result = 31 * result + (locationType != null ? locationType.hashCode() : 0);
		result = 31 * result + (viewport != null ? viewport.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("GeocoderGeometry");
		sb.append("{location=").append(location);
		sb.append(", locationType=").append(locationType);
		sb.append(", viewport=").append(viewport);
		sb.append('}');
		return sb.toString();
	}
}