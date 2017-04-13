多模块MAVEN项目结构概述 version 1.0
-------------------------------------------------------------------------------


MAVEN模块                                       说明
----------------------------------------------- -------------------------------
parent                          		        父模块
war                             		        WAR模块

controller                                      Controller层。依赖service层。                                               
service                              			Service层。实现业务逻辑服务。依赖Dal层。 
dal												Dal层。实现数据库访问数据读取。
                                               
多模块MAVEN项目文件目录概述
-------------------------------------------------------------------------------   
+---parent                                                                              	// 
|       pom.xml                                                                             // MAVEN Parent配置文件


+---war                                                                                 	// 
|   |   pom.xml                                                                             // MAVEN 配置文件
|   |                                                                                       // 
|   \---src                                                                                 // 
|       \---main                                                                            // 
|           +---resources                                                                   // 资源文件 目录 
|           |       application.properties			                                        // SPRING 配置文件
|           |       mybatis-config.xml                                                 		// mybatis 配置文件
|           |       schema.sql			                                                    // 数据库schema脚本 
|           |       data.sql	                                                            // 数据库data脚本 
|           |                                                                               // 


+---service		                                                                            // 
|   |   pom.xml                                                                             // MAVEN 配置文件
|   |                                                                                       // 
|   \---src                                                                                 // 
|       \---main                                                                            // 
|           +---java                                                                        // Java源码 目录
|           |   +---com\github\zackwoo\scaffolding\service\dto                              // 公用对象的 DTO 定义
|           |                                         CityDto.java                          // City对象的 DTO 定义
|           |   \---com\github\zackwoo\scaffolding\service\interfaces                       // Service 定义
|           |                                             ICityService.java                 // City Service 定义
|           |	\---com\github\zackwoo\scaffolding\service\impl		                        // Service的实现
|			|											  CityService.java					// City Service 的具体实现


+---dal		                                                                                // 
|   |   pom.xml                                                                             // MAVEN 配置文件
|   |                                                                                       // 
|   \---src                                                                                 // 
|       \---main                                                                            // 
|           +---java                                                                        // Java源码 目录
|           |   +---com\github\zackwoo\scaffolding\entity                                   // mybatis generator 生成的实体类
|           |                                         										//
|           |   \---com\github\zackwoo\scaffolding\mapper 									// mybatis generator 生成的mapper类
|           |                                             									//
|           |	\---com\github\zackwoo\scaffolding\service\impl		                        // Service的实现
|			|																				//
|			+---resources     																//
|			|	\---generatorConfig.xml														// mybatis generator配置文件
|			|	\---com\github\zackwoo\scaffolding\mapper									// mybatis generator 生成的xml文件
