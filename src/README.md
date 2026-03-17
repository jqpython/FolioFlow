What I Learned (OOP in Practice)

Building `folioflow` helped me understand how OOP concepts work together in a real project, not just in isolated examples.

### Encapsulation
I learned to keep class data protected and expose only what other classes need.  
For example, my entities store fields as private and provide behavior through methods, which made the code safer and easier to reason about.

### Abstraction
I used abstractions to define clear contracts:
- `Book` as an abstract base type
- `BorrowPolicy` as an interface for borrowing rules

This helped me focus on *what* each part should do instead of coupling everything to one implementation.

### Inheritance
I practiced inheritance by creating specialized classes from shared base classes:
- `PhysicalBook` and `EBook` from `Book`
- `PremiumMember` from `Member`

This reduced duplication and made shared behavior reusable.

### Polymorphism
I saw polymorphism in action through:
- Different `Book` types with their own `displayInfo()` behavior
- Swappable borrowing policies (`StandardBorrowPolicy`, `PremiumBorrowPolicy`)

The same method calls can produce different behavior depending on the runtime object.

### Composition (Most Valuable Lesson)
The most important concept I learned was composition:
- `Library` has a `LoanService`
- `Loan` has a `Book` and a `Member`
- `LoanService` has a `BorrowPolicy`

This taught me to build classes that collaborate, instead of creating one large class that does everything.

### Separation of Concerns
I structured the app so each class has a clear responsibility:
- `Library` manages catalog/member operations
- `LoanService` handles borrowing logic
- `Loan` represents borrowing records
- Policy classes define rule variations

This made the project easier to test, extend, and maintain.

### Overall
This project helped me move from “knowing OOP definitions” to actually applying OOP design in code. I now better understand how encapsulation, abstraction, inheritance, polymorphism, and composition work together to create flexible, maintainable software.
