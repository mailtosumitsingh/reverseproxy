package org.menlorobotics.rvr.reverseproxy;

import io.undertow.server.HttpServerExchange;
import io.undertow.server.handlers.proxy.LoadBalancingProxyClient;

public class RoutableLoadBalancedProxyClient extends LoadBalancingProxyClient {
@Override
protected Host selectHost(HttpServerExchange exchange) {
	System.out.println(exchange.getRequestURL()+":"+exchange.getRequestURI()+":"+ exchange.getQueryString());
	return super.selectHost(exchange);
}
}
