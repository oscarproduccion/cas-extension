/*
 * File created on Jan 22, 2015 
 *
 * Copyright (c) 2015 Carl Harris, Jr.
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
 *
 */
package org.soulwing.cas.service.authentication;

import java.util.List;

/**
 * A mutable configuration.
 *
 * @author Carl Harris
 */
public interface MutableConfiguration extends Configuration {

  void setProtocol(AuthenticationProtocol protocol);
  
  void setServerUrl(String serverUrl);
  
  void setServiceUrl(String serviceUrl);
  
  void setProxyCallbackUrl(String proxyCallbackUrl);

  void setAcceptAnyProxy(boolean acceptAnyProxy);

  void setAllowEmptyProxyChain(boolean allowEmptyProxyChain);
  
  void setAllowedProxyChains(List<String[]> allowedProxyChains);

  void setRenew(boolean renew);

}
