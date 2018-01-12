/**
 * 
 */
package com.iae.wis.service.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.iae.wis.service.constant.WisConstant;

/**
 * @author
 *
 */
@Component
public class WisFeeService extends RouteBuilder {

	@Value("${wis.service.host}")
	private String host;

	@Value("${wis.service.port}")
	private String port;

	@Override
	public void configure() throws Exception {

		restConfiguration().component("restlet").host(host).port(port).bindingMode(RestBindingMode.auto).enableCORS(true)
				.corsHeaderProperty(WisConstant.ALLOW_HEADERS, WisConstant.ALLOW_HEADER_VALUE).corsHeaderProperty(WisConstant.ALLOW_ORIGIN, "*");

		/** getFeePaymentsRoute */

		rest("/iaewis").get("/getfeepayments").produces(WisConstant.APPLICATION_JSON).route().routeId("getfeepaymentsRestletRoute").to("direct:getFeePayments");

		from("direct:getFeePayments").routeId("getFeePaymentsRoute").log("Request recevied for getfeepayments ").bean("wisJdbcRepository", "getFeePayments()");

		/** getTotalFeesRoute */

		rest("/iaewis").get("/gettotalfees").produces(WisConstant.APPLICATION_JSON).route().routeId("gettotalfeesRestletRoute").to("direct:getTotalFees");

		from("direct:getTotalFees").routeId("getTotalFeesRoute").log("Request received for gettotalfees").bean("wisJdbcRepository", "getTotalFees()");

		/** getTotalBookAmountRoute */

		rest("/iaewis").get("/gettotalbookamount").produces(WisConstant.APPLICATION_JSON).route().routeId("gettotalbookamountRestletRoute")
				.to("direct:getTotalBookAmount");

		from("direct:getTotalBookAmount").routeId("getTotalBookAmountRoute").log("Request received for gettotalbookamount").bean("wisJdbcRepository",
				"getTotalBookAmount()");

	}

}