#!/bin/sh -l

REPORT_BRANCH=$1

PROJECT_SCM_URL=$GITHUB_SERVER_URL/$GITHUB_REPOSITORY

# for testing
echo "REPORT_BRANCH = $REPORT_BRANCH"
echo "PROJECT_SCM_URL = $PROJECT_SCM_URL"
echo "GITHUB_REPOSITORY = $GITHUB_REPOSITORY"
echo "GITHUB_WORKSPACE = $GITHUB_WORKSPACE"
ls $GITHUB_WORKSPACE

# Switch to the Fosstars branch
git fetch origin $REPORT_BRANCH || git branch $REPORT_BRANCH
git checkout $REPORT_BRANCH
if [ $? -ne 0 ]; then
    echo "Could not switch to branch '$REPORT_BRANCH'"
    echo "Did you fortet to run 'actions/checkout' step in your workflow?"
    exit 1
fi

# Generate a report
echo "Here will be a report" > README.md

# Commit the report
git config --global user.name "Fosstars"
git config --global user.email "fosstars@users.noreply.github.com"
git remote set-url origin https://x-access-token:$GITHUB_TOKEN@github.com/$GITHUB_REPOSITORY
git commit -am "Update Fosstars report"
git push origin $REPORT_BRANCH
