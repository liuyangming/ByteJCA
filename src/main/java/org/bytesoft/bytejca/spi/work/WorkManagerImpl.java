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

import javax.resource.spi.work.ExecutionContext;
import javax.resource.spi.work.Work;
import javax.resource.spi.work.WorkException;
import javax.resource.spi.work.WorkListener;
import javax.resource.spi.work.WorkManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkManagerImpl implements WorkManager {
	static final Logger logger = LoggerFactory.getLogger(WorkManagerImpl.class);

	// private final ThreadPoolExecutor executor = new ThreadPoolExecutor(5, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS,
	// new LinkedBlockingQueue<Runnable>());
	// private final ScheduledThreadPoolExecutor scheduled = new ScheduledThreadPoolExecutor(1);

	public void doWork(Work work) throws WorkException {
		throw new WorkException("not supported yet!");
	}

	public void doWork(Work work, long startTimeout, ExecutionContext execContext, WorkListener workListener)
			throws WorkException {
		throw new WorkException("not supported yet!");
	}

	public long startWork(Work work) throws WorkException {
		return this.startWork(work, 1800 * 1000L, null, null);
	}

	public long startWork(Work work, long startTimeout, ExecutionContext execContext, WorkListener workListener)
			throws WorkException {
		throw new WorkException("not supported yet!");
	}

	public void scheduleWork(Work work) throws WorkException {
		throw new WorkException("not supported yet!");
	}

	public void scheduleWork(Work work, long startTimeout, ExecutionContext execContext, WorkListener workListener)
			throws WorkException {
		throw new WorkException("not supported yet!");
	}

}
