/*
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
package com.codingrodent.microprocessor.support;

import com.codingrodent.microprocessor.IBaseDevice;

public class Z80IOEcho implements IBaseDevice {
    private int value;

    /**
     * Just return the latest value output
     */
    @Override
    public int IORead(int address) {
        return value;
    }

    /**
     * Set output value
     */
    @Override
    public void IOWrite(int address, int data) {
        value = data;
    }
}
