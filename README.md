# Keycloak OAUTH2 resource and JWT client applications example

## Install keycloack

``
https://www.keycloak.org/getting-started/getting-started-docker
``

setup your realm `quickstart`, client id `authz-servlet` and `client_secret`

modify realm data into `application.yml` -s

## For manually request
run resource server application, and call keycloack api for obtain access token

```json
curl -X POST http://localhost:8180/realms/quickstart/protocol/openid-connect/token \
-H 'content-type: application/x-www-form-urlencoded' \
-d 'client_id=authz-servlet&client_secret=secret'
```

call API method with request

```json
curl http://localhost:8080/api/hello \
  -H "Authorization: Bearer "$access_token
```

## Application client request

Run the oauth2 client application