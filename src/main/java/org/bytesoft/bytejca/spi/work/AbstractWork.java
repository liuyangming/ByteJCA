/**
 * Copyright 2014-2017 yangming.liu<bytefox@126.com>.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 */
package org.bytesoft.bytejca.spi.work;

import javax.resource.spi.work.Work;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractWork implements Work {
	static final Logger logger = LoggerFactory.getLogger(AbstractWork.class);

	public void run() {

		while (this.currentActive()) {
		} // end-while (this.currentActive())

	}

	public abstract void execute();

	public void release() {
		// this.stopTimeMillis = System.currentTimeMillis() + this.delayOfStoping;
	}

	protected boolean currentActive() {
		// return this.stopTimeMillis <= 0 || System.currentTimeMillis() < this.stopTimeMillis;
		return false;
	}

}
