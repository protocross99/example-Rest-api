/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.lr.tutorial.karaf.cxf.personrest.impl;

import net.lr.tutorial.karaf.cxf.personrest.impl.Threshold;
import net.lr.tutorial.karaf.cxf.personrest.impl.ThresholdService;

public class ThresholdServiceImpl implements ThresholdService {
    Threshold variable = new Threshold();
    
    public ThresholdServiceImpl() {
        variable.setEntrophy(100);
    }
    
    public Threshold getThreshold() {
        return this.variable;
    }

    public void updateThreshold(Threshold threshold) {
        this.variable.setEntrophy(threshold.getEntrophy());
        System.out.println("Update request received for " + variable.getEntrophy());
    }
      
}
