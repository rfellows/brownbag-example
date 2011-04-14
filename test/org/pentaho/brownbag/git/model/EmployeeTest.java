/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2011 Pentaho Corporation..  All rights reserved.
 */

package org.pentaho.brownbag.git.model;

import org.junit.Test;

import java.util.Date;

import static junit.framework.Assert.assertEquals;

/**
 * Created: 4/14/11
 *
 * @author rfellows
 */
public class EmployeeTest {

  private static final String JOB = "Software Developer";

  @Test
  public void testGetJob() {
    Employee employee = new Employee();
    employee.setJob(JOB);
    assertEquals(JOB, employee.getJob());
  }

  @Test
  public void testGetHireDate() {
    Employee employee = new Employee();
    Date hired = new Date();
    employee.setHireDate(hired);
    assertEquals(hired, employee.getHireDate());
  }

}
