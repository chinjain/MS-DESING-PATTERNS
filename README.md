# EazyBank Microservices Project

## Project Structure Fixed

The project structure has been reorganized as a proper multi-module Maven project:

```
01_end/
├── pom.xml                    # Root parent POM
├── eazy-bom/                  # Bill of Materials (BOM) module
│   ├── pom.xml               # BOM POM with dependency management
│   └── common/               # Common shared library
├── accounts/                  # Accounts microservice
├── cards/                     # Cards microservice  
├── loans/                     # Loans microservice
├── customer/                  # Customer microservice
├── eurekaserver/             # Service discovery server
└── gatewayserver/            # API Gateway server
```

## What Was Fixed

1. **Added Root POM**: Created `/pom.xml` to manage all modules
2. **Fixed BOM Structure**: Updated `eazy-bom/pom.xml` with proper dependency management
3. **Version Alignment**: Fixed version mismatches between modules
4. **Build Plugins**: Added proper Spring Boot Maven plugin configuration
5. **Module Dependencies**: Ensured all services properly depend on the common module

## Build Instructions

### Prerequisites
- Java 21
- Maven 3.6+

### Building the Project

1. **Build the entire project:**
   ```bash
   mvn clean install -DskipTests
   ```

2. **Build individual services:**
   ```bash
   # Build common library first
   cd eazy-bom/common
   mvn clean install -DskipTests
   
   # Then build any service
   cd ../../accounts
   mvn clean compile -DskipTests
   ```

3. **Run individual services:**
   ```bash
   # Start Eureka Server first
   cd eurekaserver
   mvn spring-boot:run
   
   # Then start other services
   cd ../accounts
   mvn spring-boot:run
   ```

## Service Ports
- Eureka Server: 8070
- Gateway Server: 8072
- Accounts Service: 8080
- Cards Service: 8090
- Loans Service: 8100
- Customer Service: 8080

## Notes
- Tests are currently skipped due to configuration issues
- Lombok annotation processing has been configured in the BOM
- All services use H2 in-memory database for development
- Spring Cloud version 2023.0.3 with Spring Boot 3.3.4

## Next Steps
1. Fix any remaining Lombok compatibility issues with Java 21
2. Configure proper test contexts for Spring Boot tests
3. Set up Docker containers for each service
4. Add proper logging and monitoring configuration