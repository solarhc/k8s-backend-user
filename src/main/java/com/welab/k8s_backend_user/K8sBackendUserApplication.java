package com.welab.k8s_backend_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class K8sBackendUserApplication {

	public static void main(String[] args) {
		System.out.printf("jenkins build trigger safd");
		SpringApplication.run(K8sBackendUserApplication.class, args);
	}

}
