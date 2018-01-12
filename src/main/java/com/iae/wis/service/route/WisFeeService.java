/**
 * 
 */
package com.iae.wis.service.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.iae.wis.service.dao.WisJdbcRepository;

/**
 * @author
 *
 */
@Component
public class WisFeeService extends RouteBuilder {

	@Autowired
	private WisJdbcRepository wisJdbcRepository;

	@Value("${wis.service.host}")
	private String host;

	@Value("${wis.service.port}")
	private String port;

	@Override
	public void configure() throws Exception {

		restConfiguration().component("restlet").host(host).port(port).bindingMode(RestBindingMode.auto);

		rest("/iaewis").get("/getfeepayments").produces("application/json").route().routeId("getfeepaymentsRestletRoute").to("direct:getFeePayments");

		from("direct:getFeePayments").routeId("getFeePaymentsRoute").log("Received request to retrive students who paid fees")
				.bean("wisJdbcRepository", "getFeePayments()").marshal().json(JsonLibrary.Jackson);

	}

}