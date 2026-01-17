#!/bin/bash

echo "Building EazyBank Microservices Project..."

# Build the BOM first
echo "Building BOM..."
cd eazy-bom
mvn clean install -DskipTests
if [ $? -ne 0 ]; then
    echo "Failed to build BOM"
    exit 1
fi

# Build common library
echo "Building common library..."
cd common
mvn clean install -DskipTests
if [ $? -ne 0 ]; then
    echo "Failed to build common library"
    exit 1
fi

cd ../..

# Build all services
echo "Building all services..."
mvn clean compile -DskipTests
if [ $? -eq 0 ]; then
    echo "✅ Project structure fixed and build successful!"
    echo ""
    echo "You can now:"
    echo "1. Run individual services with: mvn spring-boot:run"
    echo "2. Start with Eureka Server: cd eurekaserver && mvn spring-boot:run"
    echo "3. Then start other services in separate terminals"
else
    echo "❌ Build failed. Check the error messages above."
    exit 1
fi