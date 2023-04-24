# SSL-Security

add self signed certificate 
keytool -genkeypair -alias local_ssl -keyalg RSA -keysize 2048 -storetype PKCS12^ -keystore local-ssl.p12 -validity 365 -ext san=dns:localhost

export certificate 
keytool -export -keystore local-ssl.p12 -alias local_ssl -file local-cert.crt
