package Manual_interview_Q;

public class design_test_cases_when_requirements_are_unclear {

    public static void main(String[] args) {

        /*

        🔷 1️⃣ Clarify First – Don’t Assume

Review available documents (BRD, user stories, acceptance criteria)
Check UI mockups, API contracts, Jira tickets
Prepare a list of clarification questions
Discuss with:
Product Owner
Business Analyst
Developers

💬 Interview Line:

“I first try to clarify ambiguities by discussing with stakeholders rather than making
assumptions.”

🔷 2️⃣ Identify Core Business Objective
Even if details are unclear, usually the main goal is known.

Example:
Login feature → Must authenticate user
Payment feature → Must process transaction securely
API → Must return correct response structure
Design test cases around:
Happy path
Validation rules
Security
Error handling

🔷 3️⃣ Use Assumption-Based Testing (Document It)

If clarification is delayed:
Make logical assumptions
Clearly document them in test cases

Example:
Assumption: Username should be minimum 6 characters
This protects you during reviews.

🔷 4️⃣ Apply Exploratory Testing

When requirements are vague:
Explore application behavior
Identify edge cases
Compare with similar features in system
This helps uncover:
Hidden validations
UI inconsistencies

Performance issues

🔷 5️⃣ Use Risk-Based Testing
Focus on:

High Risk Areas	Example
Payment	Money loss
Login	Security risk
Data Save	Data corruption
API Integration	System breakage

Prioritize critical flows first.

🔷 6️⃣ Follow Industry Testing Techniques

Even with unclear requirements, you can apply:
Boundary Value Analysis
Equivalence Partitioning
Negative Testing
State Transition Testing

Example (Login):
Empty fields
Special characters
Max length
SQL injection

🔷 7️⃣ Collaborate Early in Agile

In Agile environments:
Participate in backlog grooming
Ask questions during sprint planning
Add acceptance criteria before development starts

🔥 Strong Interview Answer (2–3 Minute Version)

You can say:
When requirements are unclear, I first seek clarification from the product owner or
business analyst to avoid incorrect assumptions. Meanwhile, I analyze the core business
objective and design test cases for positive, negative, boundary, and edge scenarios.
 If clarification is delayed, I document my assumptions clearly in test cases. I also
  perform exploratory and risk-based testing to cover critical flows. This ensures
   quality without blocking progress.


         */
    }
}
