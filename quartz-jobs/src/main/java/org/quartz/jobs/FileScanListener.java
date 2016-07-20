/* 
 * Copyright 2001-2009 Terracotta, Inc. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not 
 * use this file except in compliance with the License. You may obtain a copy 
 * of the License at 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0 
 *   
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations 
 * under the License.
 * 
 */

package org.quartz.jobs;

/**
 * Interface for objects wishing to receive a 'call-back' from a 
 * <code>FileScanJob</code>.
 * 《对象希望从FileScanJob中获取回调的接口》
 * 
 * @author jhouse
 * @see org.quartz.jobs.FileScanJob
 */
public interface FileScanListener {

    void fileUpdated(String fileName);
}