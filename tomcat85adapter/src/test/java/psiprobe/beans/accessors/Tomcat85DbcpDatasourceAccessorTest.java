/**
 * Licensed under the GPL License. You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 *
 * THIS PACKAGE IS PROVIDED "AS IS" AND WITHOUT ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF MERCHANTIBILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.
 */
package psiprobe.beans.accessors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.junit.Test;

/**
 * The Class Tomcat85DbcpDatasourceAccessorTest.
 */
public class Tomcat85DbcpDatasourceAccessorTest {

  /**
   * Tomcat 85 dbcp datasource accessor.
   *
   * @throws Exception the exception
   */
  @Test
  public void Tomcat85DbcpDatasourceAccessor() throws Exception {
    Tomcat85DbcpDatasourceAccessor accessor = new Tomcat85DbcpDatasourceAccessor();
    try (BasicDataSource source = new BasicDataSource()) {
      assertEquals("tomcat-dbcp2", accessor.getInfo(source).getType());
    }
  }

  /**
   * Tomcat 85 dbcp datasource accessor invalid.
   *
   * @throws Exception the exception
   */
  @Test
  public void Tomcat85DbcpDatasourceAccessorInvalid() throws Exception {
    Tomcat85DbcpDatasourceAccessor accessor = new Tomcat85DbcpDatasourceAccessor();
    assertNull(accessor.getInfo(new Object()));
  }

  /**
   * Reset.
   *
   * @throws Exception the exception
   */
  @Test
  public void reset() throws Exception {
    Tomcat85DbcpDatasourceAccessor accessor = new Tomcat85DbcpDatasourceAccessor();
    assertFalse(accessor.reset(new Object()));
  }

}
