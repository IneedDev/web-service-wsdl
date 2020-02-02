**WS server - client** 

Layers:
interface contains webmethods
service implements webmethods, has WebService endpointInterface path/location/package
publisher - publishes endpoint under which service will be available int this case: http://localhost:1234/Service

Generate java file to specific directory
javac -d ws-generated/ publisher/UCPublisher.java 

run application
