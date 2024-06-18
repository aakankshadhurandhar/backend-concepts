# Default goal
.DEFAULT_GOAL := run

# Targets
.PHONY: clean build run

# Clean the project
clean:
	mvn clean

# Build the project
build:
	mvn clean install

# Run the project locally
run:
	mvn spring-boot:run
