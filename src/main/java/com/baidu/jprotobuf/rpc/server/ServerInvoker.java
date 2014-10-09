/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.jprotobuf.rpc.server;

import com.baidu.bjf.remoting.protobuf.IDLProxyObject;

/**
 *
 * @author xiemalin
 * @since 1.0.0
 */
public interface ServerInvoker {

    
    /**
     * RPC service call back method.
     * 
     * @param input request IDL proxy object by protobuf deserialized
     * @param output return back IDL proxy object to serialized
     * @throws Exception in case of any exception
     */
    void invoke(IDLProxyObject input, IDLProxyObject output) throws Exception;
}
