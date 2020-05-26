#!/bin/bash

set -eux

# Run tests
mvn clean verify

# Upload test report
aws s3 sync /usr/src/app/target/site/serenity s3://${TEST_REPORT_BUCKET_NAME}