/*
 * reserved comment block
 * DO NOT REMOVE OR ALTER!
 */
/*
 * Copyright 1999-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * $Id: FuncStringLength.java,v 1.2.4.1 2005/09/14 20:18:44 jeffsuttor Exp $
 */
package com.sun.org.apache.xpath.internal.functions;

import com.sun.org.apache.xpath.internal.XPathContext;
import com.sun.org.apache.xpath.internal.objects.XNumber;
import com.sun.org.apache.xpath.internal.objects.XObject;

/**
 * Execute the StringLength() function.
 * @xsl.usage advanced
 */
public class FuncStringLength extends FunctionDef1Arg
{
    static final long serialVersionUID = -159616417996519839L;

  /**
   * Execute the function.  The function must return
   * a valid object.
   * @param xctxt The current execution context.
   * @return A valid XObject.
   *
   * @throws org.openjdk.javax.xml.transform.TransformerException
   */
  public XObject execute(XPathContext xctxt) throws org.openjdk.javax.xml.transform.TransformerException
  {
    return new XNumber(getArg0AsString(xctxt).length());
  }
}
