# IMP Points to remember

## TestNG Points

Do NOT use Assert.fail() just to force failures.
Check the actual behavior (error message or URL).

Why?
If you do Assert.fail(), every invalid login test will fail, even if the system is working correctly.

This means you won’t know if there’s a real bug or if the test is just forcing a failure.
