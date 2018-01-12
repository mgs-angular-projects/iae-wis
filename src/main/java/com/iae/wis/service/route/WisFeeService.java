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

		restConfiguration().component("restlet").host(host).port(port).bindingMode(RestBindingMode.auto).enableCORS(true)
				.corsHeaderProperty("Access-Control-Allow-Headers",
						"Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers")
				.corsHeaderProperty("Access-Control-Allow-Origin", "*");

		/** getFeePaymentsRoute */

		rest("/iaewis").get("/getfeepayments").produces("application/json").route().routeId("getfeepaymentsRestletRoute").to("direct:getFeePayments");

		from("direct:getFeePayments").routeId("getFeePaymentsRoute").log("Received request to retrive students who paid fees").bean("wisJdbcRepository",
				"getFeePayments()");

		/** getTotalFeesRoute */

		rest("/iaewis").get("/gettotalfees").produces("application/json").route().routeId("gettotalfeesRestletRoute").to("direct:getTotalFees");

		from("direct:getTotalFees").routeId("getTotalFeesRoute").log("Received request to retrive tootal fees").bean("wisJdbcRepository", "getTotalFees()");

		/** getTotalBookAmountRoute */

		rest("/iaewis").get("/gettotalbookamount").produces("application/json").route().routeId("gettotalbookamountRestletRoute")
				.to("direct:getTotalBookAmount");

		from("direct:getTotalBookAmount").routeId("getTotalBookAmountRoute").log("Received request to retrive total book amount").bean("wisJdbcRepository",
				"getTotalBookAmount()");

	}

}