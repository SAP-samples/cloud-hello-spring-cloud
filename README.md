SAP HANA Cloud Platform Samples - hello spring cloud
========

This project demonstrates the usage of [Spring Cloud Connectors](http://cloud.spring.io/spring-cloud-connectors/) within a classic web application. In fact, it's a fork/rewrite of a [sample application](https://github.com/cloudfoundry-samples/hello-spring-cloud) provided as part of the Cloud Foundry samples.

The main differences between the original sample and this fork/rewrite are as follows:

+ the original version used [Spring Boot](http://projects.spring.io/spring-boot/), this fork sticks to the classic approach of Spring
+ the original version compiles to a JAR file, this fork uses the classic WAR format for deployment
+ this fork provides the needed dependencies to run the application on the [SAP HANA Cloud Platform](http://hcp.sap.com)  

>> **NOTE**: For further information please refer to the respective blog post: [Released: Spring Cloud Connectors for HCP](http://scn.sap.com/community/developer-center/cloud-platform/blog/2014/12/12/released-spring-cloud-connectors-for-hcp) 

Quick start
-----------

Clone the repo, `git clone https://github.com/SAP/cloud-hello-spring-cloud.git`, or [download the latest release](https://github.com/SAP/cloud-hello-spring-cloud/archive/master.zip), then run a Maven build and deploy the application to your cloud platform of choice. 

### SAP HANA Cloud Platform

The application should run as-is without any changes required. 

### Cloud Foundry

Please remember to adjust the declared services within the [`manifest.yml`](/manifest.yml) file as required for your runtime environment! 

>> **NOTE:** If you intend to deploy this application to a Cloud Foundry landscape provided by SAP or its partners in order to leverage the capabilities of the SAP HANA database platform you need to manually provide the HANA JDBC driver (`ngdbc.jar`) within the [`WEB-INF/lib`](/src/main/webapp/WEB-INF/lib) folder. 



Authors
-------

**Matthias Steiner**

+ http://twitter.com/steinermatt
+ http://github.com/steinermatt


Copyright and license
---------------------

Copyright (c) 2014 SAP SE

Except as provided below, this software is licensed under the Apache License, Version 2.0 (the "License"); you may not use this software except in compliance with the License.You may obtain a copy of the License at:

[http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
