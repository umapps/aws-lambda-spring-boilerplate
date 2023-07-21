
# AWS Lambda Boiler Plate

`sam build`

`sam deploy --guided` -- This will create samconfig.toml file if we have the params in the last step. 
Once this is created for next deployments just `sam deploy` would be enough.


This will create a new API, Lambda function, S3 bucket. No need of any manual setup.

Only thing is to add a custom domain for API gateway.

Custom domain added - https://samsample.umapps.in/users