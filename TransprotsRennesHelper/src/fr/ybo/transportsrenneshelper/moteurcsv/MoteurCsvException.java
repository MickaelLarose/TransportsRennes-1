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

package fr.ybo.transportsrenneshelper.moteurcsv;

@SuppressWarnings("serial")
public class MoteurCsvException extends RuntimeException {

	public MoteurCsvException(final String message) {
		super(message);
	}

	public MoteurCsvException(final String message, final Throwable throwable) {
		super(message, throwable);
	}

	public MoteurCsvException(final Throwable throwable) {
		super(throwable);
	}

}