export myvar1=abc123

do-test-1:
	@echo myvar1: ${myvar1}, test-type: ${TEST_TYPE}, auth0-value: ${AUTH0_TEST_VALUE}