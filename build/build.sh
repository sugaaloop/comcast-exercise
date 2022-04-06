
echo 'building...'
# using spring boot built in build image command
# ./mvnw spring-boot:build-image

# using custom docker build
./mvnw clean package
docker build -t sugaaloop/comcast-exercise .
