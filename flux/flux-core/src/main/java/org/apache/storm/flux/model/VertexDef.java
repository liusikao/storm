/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.storm.flux.model;

/**
 * Abstract parent class of component definitions
 * (spouts/bolts)
 */
public abstract class VertexDef extends BeanDef {

    // default parallelism to 1 so if it's omitted, the topology will still function.
    private int parallelism = 1;
    private int numTasks = -1;
    private int onHeapMemoryLoad = -1;
    private int offHeapMemoryLoad = -1;
    private int cpuLoad = -1;

    public int getParallelism() {
        return parallelism;
    }

    public void setParallelism(int parallelism) {
        this.parallelism = parallelism;
    }

    public int getNumTasks() {
        return numTasks;
    }

    public void setNumTasks(int numTasks) {
        this.numTasks = numTasks;
    }

    public int getOnHeapMemoryLoad() {
        return onHeapMemoryLoad;
    }

    public void setOnHeapMemoryLoad(int onHeapMemoryLoad) {
        this.onHeapMemoryLoad = onHeapMemoryLoad;
    }

    public int getOffHeapMemoryLoad() {
        return offHeapMemoryLoad;
    }

    public void setOffHeapMemoryLoad(int offHeapMemoryLoad) {
        this.offHeapMemoryLoad = offHeapMemoryLoad;
    }

    public int getCpuLoad() {
        return cpuLoad;
    }

    public void setCpuLoad(int cpuLoad) {
        this.cpuLoad = cpuLoad;
    }
}
