**Status**: **Failed**

**Confidence**: Low (7.37, max confidence value is 10.0)

## Violated rules
1.  [**[rl-vulnerability_alerts-1]**](#rl-vulnerability_alerts-1) Are vulnerability alerts enabled? **No**
1.  [**[rl-reuse_tool-2]**](#rl-reuse_tool-2) Does it have LICENSES directory with licenses? **No**
1.  [**[rl-security_policy-1]**](#rl-security_policy-1) Does it have a security policy? **No**
1.  [**[rl-license_file-2]**](#rl-license_file-2) Does it use an allowed license? **No**
1.  [**[rl-reuse_tool-1]**](#rl-reuse_tool-1) Does README mention REUSE? **No**
1.  [**[rl-reuse_tool-3]**](#rl-reuse_tool-3) Is it registered in REUSE? **No**
1.  [**[rl-reuse_tool-4]**](#rl-reuse_tool-4) Is it compliant with REUSE rules? **No**


## Warnings
1.  [**[rl-readme_file-2]**](#rl-readme_file-2) Is README incomplete? **Yes**
1.  [**[rl-contributor_file-2]**](#rl-contributor_file-2) Does the contributing guideline have required text? **No**
1.  [**[rl-contributor_file-1]**](#rl-contributor_file-1) Does it have a contributing guideline? **No**


## Unclear
1.  **[rl-assigned_teams-4]** Does it have a team with push privileges on GitHub? **unknown**
1.  **[rl-assigned_teams-5]** Does teams have enough members on GitHub? **unknown**
1.  **[rl-assigned_teams-2]** Does it have an admin team on GitHub? **unknown**
1.  **[rl-assigned_teams-3]** Does it have enough admins on GitHub? **unknown**
1.  **[rl-assigned_teams-1]** Does it have enough teams on GitHub? **unknown**


## Passed rules
1.  **[rl-readme_file-1]** Does it have a README file? **Yes**
1.  **[rl-license_file-1]** Does it have a license file? **Yes**
1.  **[rl-license_file-3]** Does the license have disallowed content? **No**
1.  **[rl-vulnerability_alerts-2]** Does it have unresolved vulnerability alerts? **No**


## What is wrong, and how to fix it

### rl-vulnerability_alerts-1

Vulnerability alerts are not enabled in the project

Vulnerability alerts are disabled for your repository. An administrator should enable these alerts via Settings. Please see the GitHub documentation for details or contact the OSPO for more information.
*  [Managing vulnerabilities in your project's dependencies](https://docs.github.com/en/code-security/supply-chain-security/managing-vulnerabilities-in-your-projects-dependencies)


### rl-reuse_tool-2

The project does not have LICENSES directory

REUSE tool compliance requires that all used licenses are provided in a LICENSES folder on root level.


### rl-security_policy-1

Neither the project nor organization has a security policy

Open a pull request to add a security policy for the project.
*  [About adding a security policy to a repository on GitHub](https://docs.github.com/en/free-pro-team@latest/github/managing-security-vulnerabilities/adding-a-security-policy-to-your-repository)
*  [An example of a security policy](https://github.com/apache/nifi/blob/main/SECURITY.md)
*  [Suggest a security policy for the project](https://github.com/artem-smotrakov/test-rop-two/security/policy)


### rl-license_file-2

GPL-3.0 is not allowed

A license file was detected, but it doesn't seem to be approved by SAP. Under normal circumstances, we use Apache 2.0 exclusively for our open source projects. Of course, exceptions apply and should be covered by this check.


### rl-reuse_tool-1

The README does not seem to have a badge that points to REUSE status (https://api.reuse.software/info/github.com/artem-smotrakov/test-rop-two)

The README of your projects needs to include a link to the results of the REUSE tool scan as well as a licensing section.


### rl-reuse_tool-3

The project is not registered in REUSE

A registration for the repository could not be found. Please verify that the repository is registered properly.
*  [Register a project in REUSE](https://api.reuse.software/register)


### rl-reuse_tool-4

The project is not registered in REUSE

The latest REUSE tool compliance check resulted in errors. Please perform the check again on your repository and fix the issues.


### rl-readme_file-2

The README does not contain required text that should match '# Requirements', '# Download and [Ii]nstallation', '# How to obtain support'

### rl-contributor_file-2

You should add information about the Developer Certificate of Origin (DCO) to the contributions file. Moreover, be sure that there are no longer any references to the outdated contributor license agreement (CLA) in the file.


### rl-contributor_file-1

No contributing guideline file could be found in your repository. Though it's only a recommendation, we'd like to encourage you to add some information that can be detected by GitHub.
*  [Setting guidelines for repository contributors](https://docs.github.com/en/communities/setting-up-your-project-for-healthy-contributions/setting-guidelines-for-repository-contributors#adding-a-contributing-file)



