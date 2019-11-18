/*
 * @Description: In User Settings Edit
 * @Author: your name
 * @Date: 2019-08-12 13:44:59
 * @LastEditTime: 2019-08-15 13:55:32
 * @LastEditors: Please set LastEditors
 */
package com.ibm.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
