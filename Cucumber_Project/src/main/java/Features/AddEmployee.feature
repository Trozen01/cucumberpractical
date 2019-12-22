Feature: Orange CRM Add new employee

Scenario: Add new employee

Given User is already on login page
When title of the page is orange CRM
Then user enter username and password
 | Admin | admin123 |

Then user is on home page
Then go to add Employee Page
And Add employee
| Jitu | JP | Sawant | 001 |

Then exit from the browser