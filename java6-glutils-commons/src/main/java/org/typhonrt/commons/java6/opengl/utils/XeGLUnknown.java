/**
 * Copyright 2015 Michael Leahy / TyphonRT, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.typhonrt.commons.java6.opengl.utils;

/**
 * XeGLUnknown -- Provides an extensible enum implementation for unknown OpenGL ES version info.
 */
public enum XeGLUnknown implements IGLVersion
{
   GL_UNKNOWN(0, 0, "Unknown");

   public final int     majorVersion, minorVersion;

   public final String  versionString;

   private XeGLUnknown(int majorVersion, int minorVersion, String versionString)
   {
      this.majorVersion = majorVersion;
      this.minorVersion = minorVersion;
      this.versionString = versionString;
   }

   @Override
   public int getMajorVersion()
   {
      return majorVersion;
   }

   @Override
   public int getMinorVersion()
   {
      return minorVersion;
   }

   @Override
   public String getVersionString()
   {
      return versionString;
   }

   @Override
   public boolean lessThan(IGLVersion glVersion)
   {
      int thatGLMajorVersion = glVersion.getMajorVersion();
      int thatGLMinorVersion = glVersion.getMinorVersion();

      return majorVersion < thatGLMajorVersion ||
       (majorVersion == thatGLMajorVersion && minorVersion < thatGLMinorVersion);
   }
}
